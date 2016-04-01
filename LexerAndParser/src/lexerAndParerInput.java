import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.gui.TreeViewer;

public class lexerAndParerInput {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// new FileInputStream(new File("src/testtext.txt"));
		CharStream stream = new ANTLRInputStream(new FileInputStream(new File("src/testCase.txt")));
		// MiniJava tester = new MiniJava(stream);
		// TokenStream tokenStream = new CommonTokenStream(tester);
		TokenStream tokenStream = new CommonTokenStream(new MiniJavaLexer(stream));
		MiniJavaParser parser = new MiniJavaParser(tokenStream);

		/* The code below displays the parse tree in a GUI */
		ParseTree tree = parser.r();
		// show AST in console
		System.out.println(tree.getChild(0));
		System.out.println(tree.getText());
	//	MiniJavaBaseListener tListener = new MiniJavaBaseListener();

//		System.out.println(tree.accept(new AbstractParseTreeVisitor().visit(tree)));
		System.out.println(tree.toStringTree(parser));
		// show AST in GUI
		JFrame frame = new JFrame("Antlr AST");
		JPanel panel = new JPanel();
		TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
		viewr.setScale(1.5);// scale a little
		panel.add(viewr);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);

		/* The code below was used in Milestone1 (Lexer) tests */
		// List<? extends Token> tokens = tester.getAllTokens();
		// String[] tokes = tester.getRuleNames();
		// for (Token token : tokens) {
		// // System.out.println(token + ", " + token.getText());
		// System.out.println(tokes[token.getType() - 1] + ", " +
		// token.getText());
		// }
	}
}