// Generated from MiniJava.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJava extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ReservedWord=1, ID=2, Integer=3, Letter=4, Digit=5, NonZeroDigit=6, Operator=7, 
		Delimiter=8, Whitespace=9, Comment=10, SingleLineComment=11, MultiLineComment=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'"
	};
	public static final String[] ruleNames = {
		"ReservedWord", "ID", "Integer", "Letter", "Digit", "NonZeroDigit", "Operator", 
		"Delimiter", "Whitespace", "Comment", "SingleLineComment", "MultiLineComment"
	};


	public MiniJava(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16\u00cf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\5\2\u0083\n\2\3\3\3\3\3\3\7\3\u0088\n\3\f\3\16\3\u008b"+
		"\13\3\3\4\3\4\7\4\u008f\n\4\f\4\16\4\u0092\13\4\3\4\5\4\u0095\n\4\3\5"+
		"\5\5\u0098\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u00ad\n\b\3\t\3\t\3\n\3\n\5\n\u00b3\n\n\3\n\3"+
		"\n\3\13\3\13\5\13\u00b9\n\13\3\f\3\f\3\f\3\f\7\f\u00bf\n\f\f\f\16\f\u00c2"+
		"\13\f\3\r\3\r\3\r\3\r\7\r\u00c8\n\r\f\r\16\r\u00cb\13\r\3\r\3\r\3\r\3"+
		"\u00c9\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3"+
		"\2\n\3\2\62\62\4\2C\\c|\3\2\62;\3\2\63;\6\2,-//\61\61>>\13\2*+..\60\60"+
		"==??]]__}}\177\177\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u00f0\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\3\u0082\3\2\2\2\5\u0084\3\2\2\2\7\u0094\3\2\2\2\t\u0097\3\2\2\2\13\u0099"+
		"\3\2\2\2\r\u009b\3\2\2\2\17\u00ac\3\2\2\2\21\u00ae\3\2\2\2\23\u00b2\3"+
		"\2\2\2\25\u00b8\3\2\2\2\27\u00ba\3\2\2\2\31\u00c3\3\2\2\2\33\34\7e\2\2"+
		"\34\35\7n\2\2\35\36\7c\2\2\36\37\7u\2\2\37\u0083\7u\2\2 !\7r\2\2!\"\7"+
		"w\2\2\"#\7d\2\2#$\7n\2\2$%\7k\2\2%\u0083\7e\2\2&\'\7u\2\2\'(\7v\2\2()"+
		"\7c\2\2)*\7v\2\2*+\7k\2\2+\u0083\7e\2\2,-\7g\2\2-.\7z\2\2./\7v\2\2/\60"+
		"\7g\2\2\60\61\7p\2\2\61\62\7f\2\2\62\u0083\7u\2\2\63\64\7x\2\2\64\65\7"+
		"q\2\2\65\66\7k\2\2\66\u0083\7f\2\2\678\7k\2\289\7p\2\29\u0083\7v\2\2:"+
		";\7d\2\2;<\7q\2\2<=\7q\2\2=>\7n\2\2>?\7g\2\2?@\7c\2\2@\u0083\7p\2\2AB"+
		"\7k\2\2B\u0083\7h\2\2CD\7g\2\2DE\7n\2\2EF\7u\2\2F\u0083\7g\2\2GH\7y\2"+
		"\2HI\7j\2\2IJ\7k\2\2JK\7n\2\2K\u0083\7g\2\2LM\7t\2\2MN\7g\2\2NO\7v\2\2"+
		"OP\7w\2\2PQ\7t\2\2Q\u0083\7p\2\2RS\7p\2\2ST\7w\2\2TU\7n\2\2U\u0083\7n"+
		"\2\2VW\7v\2\2WX\7t\2\2XY\7w\2\2Y\u0083\7g\2\2Z[\7h\2\2[\\\7c\2\2\\]\7"+
		"n\2\2]^\7u\2\2^\u0083\7g\2\2_`\7v\2\2`a\7j\2\2ab\7k\2\2b\u0083\7u\2\2"+
		"cd\7p\2\2de\7g\2\2e\u0083\7y\2\2fg\7U\2\2gh\7v\2\2hi\7t\2\2ij\7k\2\2j"+
		"k\7p\2\2k\u0083\7i\2\2lm\7o\2\2mn\7c\2\2no\7k\2\2o\u0083\7p\2\2pq\7U\2"+
		"\2qr\7{\2\2rs\7u\2\2st\7v\2\2tu\7g\2\2uv\7o\2\2vw\7\60\2\2wx\7q\2\2xy"+
		"\7w\2\2yz\7v\2\2z{\7\60\2\2{|\7r\2\2|}\7t\2\2}~\7k\2\2~\177\7p\2\2\177"+
		"\u0080\7v\2\2\u0080\u0081\7n\2\2\u0081\u0083\7p\2\2\u0082\33\3\2\2\2\u0082"+
		" \3\2\2\2\u0082&\3\2\2\2\u0082,\3\2\2\2\u0082\63\3\2\2\2\u0082\67\3\2"+
		"\2\2\u0082:\3\2\2\2\u0082A\3\2\2\2\u0082C\3\2\2\2\u0082G\3\2\2\2\u0082"+
		"L\3\2\2\2\u0082R\3\2\2\2\u0082V\3\2\2\2\u0082Z\3\2\2\2\u0082_\3\2\2\2"+
		"\u0082c\3\2\2\2\u0082f\3\2\2\2\u0082l\3\2\2\2\u0082p\3\2\2\2\u0083\4\3"+
		"\2\2\2\u0084\u0089\5\t\5\2\u0085\u0088\5\t\5\2\u0086\u0088\5\13\6\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\6\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0090"+
		"\5\r\7\2\u008d\u008f\5\13\6\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2"+
		"\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0095\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0095\t\2\2\2\u0094\u008c\3\2\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\b\3\2\2\2\u0096\u0098\t\3\2\2\u0097\u0096\3\2\2\2\u0098\n\3\2\2\2\u0099"+
		"\u009a\t\4\2\2\u009a\f\3\2\2\2\u009b\u009c\t\5\2\2\u009c\16\3\2\2\2\u009d"+
		"\u00ad\t\6\2\2\u009e\u009f\7>\2\2\u009f\u00ad\7?\2\2\u00a0\u00a1\7@\2"+
		"\2\u00a1\u00ad\7?\2\2\u00a2\u00ad\7@\2\2\u00a3\u00a4\7?\2\2\u00a4\u00ad"+
		"\7?\2\2\u00a5\u00a6\7#\2\2\u00a6\u00ad\7?\2\2\u00a7\u00a8\7(\2\2\u00a8"+
		"\u00ad\7(\2\2\u00a9\u00aa\7~\2\2\u00aa\u00ad\7~\2\2\u00ab\u00ad\7#\2\2"+
		"\u00ac\u009d\3\2\2\2\u00ac\u009e\3\2\2\2\u00ac\u00a0\3\2\2\2\u00ac\u00a2"+
		"\3\2\2\2\u00ac\u00a3\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ac"+
		"\u00a9\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\20\3\2\2\2\u00ae\u00af\t\7\2"+
		"\2\u00af\22\3\2\2\2\u00b0\u00b3\5\25\13\2\u00b1\u00b3\t\b\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\n\2\2\u00b5"+
		"\24\3\2\2\2\u00b6\u00b9\5\27\f\2\u00b7\u00b9\5\31\r\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b7\3\2\2\2\u00b9\26\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb\u00bc"+
		"\7\61\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bf\n\t\2\2\u00be\u00bd\3\2\2\2"+
		"\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\30"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4\u00c5\7,\2\2\u00c5"+
		"\u00c9\3\2\2\2\u00c6\u00c8\13\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cd\7,\2\2\u00cd\u00ce\7\61\2\2\u00ce\32\3\2\2"+
		"\2\16\2\u0082\u0087\u0089\u0090\u0094\u0097\u00ac\u00b2\u00b8\u00c0\u00c9"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}