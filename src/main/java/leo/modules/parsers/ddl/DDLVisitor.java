// Generated from ../contrib/DDL.g4 by ANTLR 4.7

  package leo.modules.parsers.ddl;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DDLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DDLParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(DDLParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(DDLParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(DDLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#annotated_formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotated_formula(DDLParser.Annotated_formulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#formula_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula_role(DDLParser.Formula_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(DDLParser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#unary_formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_formula(DDLParser.Unary_formulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#binary_formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_formula(DDLParser.Binary_formulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#binary_assoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_assoc(DDLParser.Binary_assocContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(DDLParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#disjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunction(DDLParser.DisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#nonassoc_connective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonassoc_connective(DDLParser.Nonassoc_connectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#binary_nonassoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_nonassoc(DDLParser.Binary_nonassocContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#unitary_formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitary_formula(DDLParser.Unitary_formulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#atomic_formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic_formula(DDLParser.Atomic_formulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(DDLParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#defined_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefined_atom(DDLParser.Defined_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#defined_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefined_function(DDLParser.Defined_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#dyadic_defined_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDyadic_defined_function(DDLParser.Dyadic_defined_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#monadic_defined_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonadic_defined_function(DDLParser.Monadic_defined_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DDLParser#monadic_defined_functor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonadic_defined_functor(DDLParser.Monadic_defined_functorContext ctx);
}