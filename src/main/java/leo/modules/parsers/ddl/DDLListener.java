// Generated from ../contrib/DDL.g4 by ANTLR 4.7

  package leo.modules.parsers.ddl;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DDLParser}.
 */
public interface DDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DDLParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(DDLParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(DDLParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(DDLParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(DDLParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(DDLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(DDLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#annotated_formula}.
	 * @param ctx the parse tree
	 */
	void enterAnnotated_formula(DDLParser.Annotated_formulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#annotated_formula}.
	 * @param ctx the parse tree
	 */
	void exitAnnotated_formula(DDLParser.Annotated_formulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#formula_role}.
	 * @param ctx the parse tree
	 */
	void enterFormula_role(DDLParser.Formula_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#formula_role}.
	 * @param ctx the parse tree
	 */
	void exitFormula_role(DDLParser.Formula_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(DDLParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(DDLParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#unary_formula}.
	 * @param ctx the parse tree
	 */
	void enterUnary_formula(DDLParser.Unary_formulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#unary_formula}.
	 * @param ctx the parse tree
	 */
	void exitUnary_formula(DDLParser.Unary_formulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#binary_formula}.
	 * @param ctx the parse tree
	 */
	void enterBinary_formula(DDLParser.Binary_formulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#binary_formula}.
	 * @param ctx the parse tree
	 */
	void exitBinary_formula(DDLParser.Binary_formulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#binary_assoc}.
	 * @param ctx the parse tree
	 */
	void enterBinary_assoc(DDLParser.Binary_assocContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#binary_assoc}.
	 * @param ctx the parse tree
	 */
	void exitBinary_assoc(DDLParser.Binary_assocContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(DDLParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(DDLParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(DDLParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(DDLParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#nonassoc_connective}.
	 * @param ctx the parse tree
	 */
	void enterNonassoc_connective(DDLParser.Nonassoc_connectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#nonassoc_connective}.
	 * @param ctx the parse tree
	 */
	void exitNonassoc_connective(DDLParser.Nonassoc_connectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#binary_nonassoc}.
	 * @param ctx the parse tree
	 */
	void enterBinary_nonassoc(DDLParser.Binary_nonassocContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#binary_nonassoc}.
	 * @param ctx the parse tree
	 */
	void exitBinary_nonassoc(DDLParser.Binary_nonassocContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#unitary_formula}.
	 * @param ctx the parse tree
	 */
	void enterUnitary_formula(DDLParser.Unitary_formulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#unitary_formula}.
	 * @param ctx the parse tree
	 */
	void exitUnitary_formula(DDLParser.Unitary_formulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#atomic_formula}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_formula(DDLParser.Atomic_formulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#atomic_formula}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_formula(DDLParser.Atomic_formulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(DDLParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(DDLParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#defined_atom}.
	 * @param ctx the parse tree
	 */
	void enterDefined_atom(DDLParser.Defined_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#defined_atom}.
	 * @param ctx the parse tree
	 */
	void exitDefined_atom(DDLParser.Defined_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#defined_function}.
	 * @param ctx the parse tree
	 */
	void enterDefined_function(DDLParser.Defined_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#defined_function}.
	 * @param ctx the parse tree
	 */
	void exitDefined_function(DDLParser.Defined_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#dyadic_defined_function}.
	 * @param ctx the parse tree
	 */
	void enterDyadic_defined_function(DDLParser.Dyadic_defined_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#dyadic_defined_function}.
	 * @param ctx the parse tree
	 */
	void exitDyadic_defined_function(DDLParser.Dyadic_defined_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#monadic_defined_function}.
	 * @param ctx the parse tree
	 */
	void enterMonadic_defined_function(DDLParser.Monadic_defined_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#monadic_defined_function}.
	 * @param ctx the parse tree
	 */
	void exitMonadic_defined_function(DDLParser.Monadic_defined_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DDLParser#monadic_defined_functor}.
	 * @param ctx the parse tree
	 */
	void enterMonadic_defined_functor(DDLParser.Monadic_defined_functorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DDLParser#monadic_defined_functor}.
	 * @param ctx the parse tree
	 */
	void exitMonadic_defined_functor(DDLParser.Monadic_defined_functorContext ctx);
}