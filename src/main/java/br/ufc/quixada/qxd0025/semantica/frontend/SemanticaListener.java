// Generated from /home/araruna/workspace/java/comp-material/comp-semantica/src/main/java/br/ufc/quixada/qxd0025/semantica/antlr4/Semantica.g4 by ANTLR 4.7.2
package br.ufc.quixada.qxd0025.semantica.frontend;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SemanticaParser}.
 */
public interface SemanticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SemanticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SemanticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SemanticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SemanticaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SemanticaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticaParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(SemanticaParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticaParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(SemanticaParser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticaParser#varassign}.
	 * @param ctx the parse tree
	 */
	void enterVarassign(SemanticaParser.VarassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticaParser#varassign}.
	 * @param ctx the parse tree
	 */
	void exitVarassign(SemanticaParser.VarassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticaParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(SemanticaParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticaParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(SemanticaParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticaParser#repetition}.
	 * @param ctx the parse tree
	 */
	void enterRepetition(SemanticaParser.RepetitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticaParser#repetition}.
	 * @param ctx the parse tree
	 */
	void exitRepetition(SemanticaParser.RepetitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrderingExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrderingExpression(SemanticaParser.OrderingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrderingExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrderingExpression(SemanticaParser.OrderingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(SemanticaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(SemanticaParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(SemanticaParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(SemanticaParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(SemanticaParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(SemanticaParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarExpression(SemanticaParser.VarExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarExpression(SemanticaParser.VarExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(SemanticaParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(SemanticaParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SemanticaParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SemanticaParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(SemanticaParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(SemanticaParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(SemanticaParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(SemanticaParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDivExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExpression(SemanticaParser.MultDivExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDivExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExpression(SemanticaParser.MultDivExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusMinusExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpression(SemanticaParser.PlusMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusMinusExpression}
	 * labeled alternative in {@link SemanticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpression(SemanticaParser.PlusMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticaParser#listassign}.
	 * @param ctx the parse tree
	 */
	void enterListassign(SemanticaParser.ListassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticaParser#listassign}.
	 * @param ctx the parse tree
	 */
	void exitListassign(SemanticaParser.ListassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SemanticaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SemanticaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SemanticaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SemanticaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SemanticaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SemanticaParser.LiteralContext ctx);
}