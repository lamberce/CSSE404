import org.antlr.v4.runtime.misc.NotNull;

public class MiniJavaCustomListener extends MiniJavaBaseListener {
	@Override public void enterExpr(@NotNull MiniJavaParser.ExprContext ctx) {	
		System.out.println(ctx.toString());
	}
}
