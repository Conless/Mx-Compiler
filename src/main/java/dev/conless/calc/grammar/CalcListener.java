// Generated from Calc.g4 by ANTLR 4.13.0
package dev.conless.calc.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalcParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalcParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(CalcParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(CalcParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(CalcParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(CalcParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(CalcParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link CalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(CalcParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(CalcParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(CalcParser.ConstantContext ctx);
}