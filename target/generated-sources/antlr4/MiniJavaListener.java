// Generated from MiniJava.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(@NotNull MiniJavaParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(@NotNull MiniJavaParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(@NotNull MiniJavaParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(@NotNull MiniJavaParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClassDecl}.
	 * @param ctx the parse tree
	 */
	void enterMainClassDecl(@NotNull MiniJavaParser.MainClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClassDecl}.
	 * @param ctx the parse tree
	 */
	void exitMainClassDecl(@NotNull MiniJavaParser.MainClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassVarDecl(@NotNull MiniJavaParser.ClassVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassVarDecl(@NotNull MiniJavaParser.ClassVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(@NotNull MiniJavaParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(@NotNull MiniJavaParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull MiniJavaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull MiniJavaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull MiniJavaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull MiniJavaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(@NotNull MiniJavaParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(@NotNull MiniJavaParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull MiniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull MiniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull MiniJavaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull MiniJavaParser.StmtContext ctx);
}