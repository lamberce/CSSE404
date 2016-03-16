import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;


public class lexerAndParerInput {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		// new FileInputStream(new File("src/testtext.txt"));
		CharStream stream = new ANTLRInputStream(new FileInputStream(new File("src/testCase.txt")));
		MiniJava tester = new MiniJava(stream);
		TokenStream tokenStream = new CommonTokenStream(tester);
	//	MiniJavaParser parser = new MiniJavaParser(tokenStream);
		List<? extends Token> tokens = tester.getAllTokens();
		String[] tokes = tester.getRuleNames();
		for(Token token : tokens){
			//System.out.println(token + ",    " + token.getText());
			System.out.println(tokes[token.getType()-1] + ", " + token.getText());
		}
	}
}
