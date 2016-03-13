import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

public class testHello {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		CharStream stream = new ANTLRInputStream(new FileInputStream(new File("src/testtext.txt")));
		// CharStream stream = new ANTLRInputStream("hello string");
		HelloLexer tester = new HelloLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(tester);
		HelloParser parser = new HelloParser(tokenStream);
		// System.out.println(tester.getAllTokens());
		List<? extends Token> tokens = tester.getAllTokens();
		for (Token token : tokens) {
			System.out.println(token);
		}
	}
}
