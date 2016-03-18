// Generated from hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link helloParser}.
 */
public interface helloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link helloParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(@NotNull helloParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(@NotNull helloParser.RContext ctx);
}