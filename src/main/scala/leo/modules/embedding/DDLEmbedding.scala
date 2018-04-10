package leo.modules.embedding

import java.io.{BufferedReader, StringReader}

import leo.modules.parsers.ddl._
import org.antlr.v4.runtime._
import org.antlr.v4.runtime.misc.ParseCancellationException

object DDLEmbedding {

  private final val thfTypeDeclarations: String =
    """
      |%- Types of meta-logical symbols
      |thf(world_type,type,(
      |    world: $tType )).
      |
      |thf(av_type,type,(
      |    av: world > world > $o )).
      |
      |thf(pv_type,type,(
      |    pv: world > world > $o )).
      |
      |thf(ob_type,type,(
      |    ob: ( world > $o ) > ( world > $o ) > $o )).
    """.stripMargin.trim
  private final val thfAxiomatization: String =
    """
      |%- Meta-logical axioms
      |thf(ax_3a, axiom, ![W:world]: (? [X: world]: (av @ W @ X))).
      |
      |thf(ax_4a, axiom, ![W:world, X:world]: ( (av @ W @ X) => (pv @ W @ X))).
      |
      |thf(ax_4b, axiom, ![W:world]: ( (pv @ W @ W))).
      |
      |thf(ax_5a, axiom, ![X:world>$o]: (~(ob @ X @ (^[Y: world]: ($false))))).
      |
      |thf(ax_5b,axiom,(
      |    ! [X: world > $o,Y: world > $o,Z: world > $o] :
      |      ( ! [W: world] :
      |          ( ( ( Y @ W )
      |            & ( X @ W ) )
      |        <=> ( ( Z @ W )
      |            & ( X @ W ) ) )
      |     => ( ( ob @ X @ Y )
      |      <=> ( ob @ X @ Z ) ) ) )).
      |
      |thf(ax_5c,axiom,(
      |    ! [X: world > $o,BB: ( world > $o ) > $o] :
      |      ( ( ! [Z: world > $o] :
      |            ( ( BB @ Z )
      |           => ( ob @ X @ Z ) )
      |        & ? [Z: world > $o] :
      |            ( BB @ Z ) )
      |     => ( ? [Y: world] :
      |            ( ( ^ [W: world] :
      |                ! [Z: world > $o] :
      |                  ( ( BB @ Z )
      |                 => ( Z @ W ) )
      |              @ Y )
      |            & ( X @ Y ) )
      |       => ( ob @ X
      |          @ ^ [W: world] :
      |            ! [Z: world > $o] :
      |              ( ( BB @ Z )
      |             => ( Z @ W ) ) ) ) ) )).
      |
      |thf(ax_5d,axiom,(
      |    ! [X: world > $o,Y: world > $o,Z: world > $o] :
      |      ( ( ! [W: world] :
      |            ( ( Y @ W )
      |           => ( X @ W ) )
      |        & ( ob @ X @ Z )
      |        & ? [W: world] :
      |            ( ( Y @ W )
      |            & ( Z @ W ) ) )
      |     => ( ob @ Y
      |        @ ^ [W: world] :
      |            ( ( ( Z @ W )
      |              & ~ ( X @ W ) )
      |            | ( Y @ W ) ) ) ) )).
      |
      |thf(ax_5e,axiom,(
      |    ! [X: world > $o,Y: world > $o,Z: world > $o] :
      |      ( ( ! [W: world] :
      |            ( ( Y @ W )
      |           => ( X @ W ) )
      |        & ( ob @ X @ Z )
      |        & ? [W: world] :
      |            ( ( Y @ W )
      |            & ( Z @ W ) ) )
      |     => ( ob @ Y @ Z ) ) )).
    """.stripMargin.trim
  private final val operatorMap: Map[String, String] = Map(
    "~" -> "ddlNot",
    "&" -> "ddlAnd",
    "|" -> "ddlOr",
    "=>" -> "ddlImplies",
    "<=>" -> "ddlEquiv",
    "$true" -> "ddlTrue",
    "$false" -> "ddlFalse",
    "$box_a" -> "ddlBoxA",
    "$box_p" -> "ddlBoxP",
    "$box" -> "ddlBox",
    "$O_a" -> "ddlOA",
    "$O_p" -> "ddlOP",
    "$O" -> "ddlO"
    )
  private final val thfDefinitions: String =
    """
      |% Definitions of (meta-)logical connectives
      |thf(ddlTrue_type,type,(
      |    ddlTrue: world > $o )).
      |
      |thf(ddlTrue_def,definition,
      |    ( ddlTrue
      |    = ( ^ [X: world] : $true ) )).
      |
      |thf(ddlFalse_type,type,(
      |    ddlFalse: world > $o )).
      |
      |thf(ddlFalse_def,definition,
      |    ( ddlFalse
      |    = ( ^ [X: world] : $false ) )).
      |
      |thf(ddlNot_type,type,(
      |    ddlNot: ( world > $o ) > world > $o )).
      |
      |thf(ddlNot_def,definition,
      |    ( ddlNot
      |    = ( ^ [P: world > $o,W: world] :
      |          ~ ( P @ W ) ) )).
      |
      |thf(ddlAnd_type,type,(
      |    ddlAnd: ( world > $o ) > ( world > $o ) > world > $o )).
      |
      |thf(ddlAnd_def,definition,
      |    ( ddlAnd
      |    = ( ^ [P: world > $o,Q: world > $o,W: world] :
      |          ( ( P @ W )
      |          & ( Q @ W ) ) ) )).
      |
      |thf(ddlOr_type,type,(
      |    ddlOr: ( world > $o ) > ( world > $o ) > world > $o )).
      |
      |thf(ddlOr_def,definition,
      |    ( ddlOr
      |    = ( ^ [P: world > $o,Q: world > $o,W: world] :
      |          ( ( P @ W )
      |          | ( Q @ W ) ) ) )).
      |
      |thf(ddlImplies_type,type,(
      |    ddlImplies: ( world > $o ) > ( world > $o ) > world > $o )).
      |
      |thf(ddlImplies_def,definition,
      |    ( ddlImplies
      |    = ( ^ [P: world > $o,Q: world > $o,W: world] :
      |          ( ( P @ W )
      |         => ( Q @ W ) ) ) )).
      |
      |thf(ddlEquiv_type,type,(
      |    ddlEquiv: ( world > $o ) > ( world > $o ) > world > $o )).
      |
      |thf(ddlEquiv_def,definition,
      |    ( ddlEquiv
      |    = ( ^ [P: world > $o,Q: world > $o,W: world] :
      |          ( ( P @ W )
      |        <=> ( Q @ W ) ) ) )).
      |
      |thf(ddlBoxA_type,type,(
      |    ddlBoxA: ( world > $o ) > world > $o )).
      |
      |thf(ddlBoxA_def,definition,
      |    ( ddlBoxA
      |    = ( ^ [P: world > $o,W: world] :
      |        ! [X: world] :
      |          ( ( av @ W @ X )
      |         => ( P @ X ) ) ) )).
      |
      |thf(ddlBoxP_type,type,(
      |    ddlBoxP: ( world > $o ) > world > $o )).
      |
      |thf(ddlBoxP_def,definition,
      |    ( ddlBoxP
      |    = ( ^ [P: world > $o,W: world] :
      |        ! [X: world] :
      |          ( ( pv @ W @ X )
      |         => ( P @ X ) ) ) )).
      |
      |thf(ddlBox_type,type,(
      |    ddlBox: ( world > $o ) > world > $o )).
      |
      |thf(ddlBox_def,definition,
      |    ( ddlBox
      |    = ( ^ [P: world > $o,W: world] :
      |        ! [X: world] :
      |          ( P @ X ) ) )).
      |
      |thf(ddlOA_type,type,(
      |    ddlOA: ( world > $o ) > world > $o )).
      |
      |thf(ddlOA_def,definition,
      |    ( ddlOA
      |    = ( ^ [P: world > $o,W: world] :
      |          ( ( ob @ ( av @ W ) @ P )
      |          & ? [X: world] :
      |              ( ( av @ W @ X )
      |              & ~ ( P @ X ) ) ) ) )).
      |
      |thf(ddlOP_type,type,(
      |    ddlOP: ( world > $o ) > world > $o )).
      |
      |thf(ddlOP_def,definition,
      |    ( ddlOP
      |    = ( ^ [P: world > $o,W: world] :
      |          ( ( ob @ ( pv @ W ) @ P )
      |          & ? [X: world] :
      |              ( ( pv @ W @ X )
      |              & ~ ( P @ X ) ) ) ) )).
      |
      |thf(ddlO_type,type,(
      |    ddlO: ( world > $o ) > ( world > $o ) > world > $o )).
      |
      |thf(ddlO_def,definition,
      |    ( ddlO
      |    = ( ^ [P: world > $o,Q: world > $o,W: world] :
      |          ( ob @ P @ Q ) ) )).
      |
      |thf(ddlValid_type,type,(
      |    ddlValid: ( world > $o ) > $o )).
      |
      |thf(ddlValid_def,definition,
      |    ( ddlValid
      |    = ( ^ [P: world > $o] :
      |        ! [W: world] :
      |          ( P @ W ) ) )).
    """.stripMargin.trim



  final def apply(input: String): String = apply(new BufferedReader(new StringReader(input)))
  final def apply(input: java.io.BufferedReader): String = {
    val sb: StringBuilder = new StringBuilder
    // parse
    val file = parseDDLFile(input)
    val translator = new DDLTranslation
    val result = translator.apply(file)
    // print definitions
    sb.append(thfTypeDeclarations)
    sb.append('\n')
    sb.append(thfAxiomatization)
    sb.append('\n')
    sb.append(thfDefinitions)
    sb.append('\n')
    sb.append('\n')
    sb.append("% Embedded user problem:\n")
    sb.append(printUserTypes(translator.getSymbols))
    // print embedded problem
    sb.append(result)
    sb.toString()
  }

  protected final def printUserTypes(symbols: Set[String]): String = {
    val sb: StringBuilder = new StringBuilder
    for (s <- symbols) {
      sb.append(s"thf(${s}_type, type, $s : world > $$o).\n")
    }
    sb.toString()
  }

  protected final def parseDDLFile(input: java.io.BufferedReader): DDLParser.FileContext = {
    val inputStream = CharStreams.fromReader(input)
    val lexer = new DDLLexer(inputStream)
    lexer.removeErrorListeners()
    lexer.addErrorListener(DDLParseErrorListener())
    val tokenStream = new CommonTokenStream(lexer)
    val parser = new DDLParser(tokenStream)
    parser.removeErrorListeners()
    parser.addErrorListener(DDLParseErrorListener())
    parser.file()
  }

  private class DDLTranslation {
    private var symbols0: Set[String] = Set.empty
    final def apply(ctx: DDLParser.FileContext): String = apply0(ctx)

    final def getSymbols: Set[String] = symbols0
    private def apply0(ctx: DDLParser.FileContext): String = {
      import scala.collection.JavaConverters._
      val sb: StringBuilder = new StringBuilder
      val inputs = ctx.input().asScala.map(_.annotated_formula)
      for (i <- inputs) {
        sb.append(s"thf(${i.name.getText},${i.formula_role().getText},ddlValid @ (${apply0(i.formula)})).\n")
      }
      sb.toString()
    }
    private def apply0(ctx: DDLParser.FormulaContext): String = {
      if (ctx.binary_formula() != null) apply0(ctx.binary_formula())
      else if (ctx.unary_formula() != null) apply0(ctx.unary_formula())
      else if (ctx.unitary_formula() != null) apply0(ctx.unitary_formula())
      else throw new Exception
    }
    private def apply0(ctx: DDLParser.Binary_formulaContext): String = {
      if(ctx.binary_assoc() != null) apply0(ctx.binary_assoc())
      else apply0(ctx.binary_nonassoc())
    }
    private def apply0(context: DDLParser.Binary_assocContext): String = {
      if (context.conjunction() != null) apply0(context.conjunction())
      else apply0(context.disjunction())
    }
    def apply0(context: DDLParser.ConjunctionContext): String = {
      if (context.conjunction() != null) {
        val translatedConj1 = apply0(context.conjunction())
        val translatedConj2 = apply0(context.unitary_formula(0))
        s"${operatorMap("&")} @ ($translatedConj1) @ ($translatedConj2)"
      } else {
        val translatedConj1 = apply0(context.unitary_formula(0))
        val translatedConj2 = apply0(context.unitary_formula(1))
        s"${operatorMap("&")} @ ($translatedConj1) @ ($translatedConj2)"
      }
    }
    def apply0(context: DDLParser.DisjunctionContext): String = {
      if (context.disjunction() != null) {
        val translatedConj1 = apply0(context.disjunction())
        val translatedConj2 = apply0(context.unitary_formula(0))
        s"${operatorMap("|")} @ ($translatedConj1) @ ($translatedConj2)"
      } else {
        val translatedConj1 = apply0(context.unitary_formula(0))
        val translatedConj2 = apply0(context.unitary_formula(1))
        s"${operatorMap("|")} @ ($translatedConj1) @ ($translatedConj2)"
      }
    }
    private def apply0(context: DDLParser.Binary_nonassocContext): String = {
      val translatedArg1 = apply0(context.unitary_formula(0))
      val translatedArg2 = apply0(context.unitary_formula(1))
      val op = context.nonassoc_connective().getText
      s"${operatorMap(op)} @ ($translatedArg1) @ ($translatedArg2)"
    }
    private def apply0(ctx: DDLParser.Unary_formulaContext): String = {
      if (ctx.atomic_formula() != null) apply0(ctx.atomic_formula())
      else s"(${apply0(ctx.formula())})"
    }
    private def apply0(ctx: DDLParser.Unitary_formulaContext): String = {
      if (ctx.atomic_formula() != null) apply0(ctx.atomic_formula())
      else s"(${apply0(ctx.formula())})"
    }
    private def apply0(context: DDLParser.Atomic_formulaContext): String = {
      if (context.atom() != null) {
        val symbol = context.atom().getText
        symbols0 += symbol
        symbol
      } else {
        val defined = context.defined_atom()
        if (defined.getText == "$true") operatorMap("$true")
        else if (defined.getText == "$false") operatorMap("$false")
        else {
          val functor = defined.defined_function()
          if (functor.dyadic_defined_function() != null) {
            val arg1 = apply0(functor.dyadic_defined_function().formula(0))
            val arg2 = apply0(functor.dyadic_defined_function().formula(1))
            s"${operatorMap("$O")} @ ($arg1) @ ($arg2)"
          } else {
            val arg = apply0(functor.monadic_defined_function().formula())
            if (functor.monadic_defined_function().monadic_defined_functor().getText == "$O") {
              s"${operatorMap("$O")} @ ($arg) @ ${operatorMap("$true")}"
            } else {
              s"${operatorMap(functor.monadic_defined_function().monadic_defined_functor().getText)} @ ($arg)"
            }
          }
        }
      }
    }
  }

  class DDLParseErrorListener extends BaseErrorListener {
    override def syntaxError(recognizer: Recognizer[_, _], offendingSymbol: scala.Any, line: Int, charPositionInLine: Int, msg: String, e: RecognitionException): Unit = {
      throw new ParseCancellationException(s"Parse error in $line:$charPositionInLine. $msg")
    }
  }
  object DDLParseErrorListener {
    private final val instance = new DDLParseErrorListener
    final def apply(): DDLParseErrorListener = instance
  }
}
