// Generated from C:\Users\E6420\Desktop\Wlasny2\src\Mat.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WRITE=4, READ=5, TOINT=6, TOREAL=7, ID=8, REAL=9, 
		INT=10, ADD=11, MULT=12, NEWLINE=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "WRITE", "READ", "TOINT", "TOREAL", "ID", "REAL", 
		"INT", "ADD", "MULT", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'write'", "'read'", "'(int)'", "'(real)'", 
		null, null, null, "'+'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "WRITE", "READ", "TOINT", "TOREAL", "ID", "REAL", 
		"INT", "ADD", "MULT", "NEWLINE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 13:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20b\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\6\t?\n\t\r\t\16\t@\3\n\6\nD\n\n\r\n\16\nE\3\n"+
		"\3\n\6\nJ\n\n\r\n\16\nK\3\13\6\13O\n\13\r\13\16\13P\3\f\3\f\3\r\3\r\3"+
		"\16\5\16X\n\16\3\16\3\16\3\17\6\17]\n\17\r\17\16\17^\3\17\3\17\2\2\20"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\3\2\4\4\2C\\c|\4\2\13\13\"\"g\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3"+
		"\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13+\3\2\2\2\r\60\3\2\2\2"+
		"\17\66\3\2\2\2\21>\3\2\2\2\23C\3\2\2\2\25N\3\2\2\2\27R\3\2\2\2\31T\3\2"+
		"\2\2\33W\3\2\2\2\35\\\3\2\2\2\37 \7?\2\2 \4\3\2\2\2!\"\7*\2\2\"\6\3\2"+
		"\2\2#$\7+\2\2$\b\3\2\2\2%&\7y\2\2&\'\7t\2\2\'(\7k\2\2()\7v\2\2)*\7g\2"+
		"\2*\n\3\2\2\2+,\7t\2\2,-\7g\2\2-.\7c\2\2./\7f\2\2/\f\3\2\2\2\60\61\7*"+
		"\2\2\61\62\7k\2\2\62\63\7p\2\2\63\64\7v\2\2\64\65\7+\2\2\65\16\3\2\2\2"+
		"\66\67\7*\2\2\678\7t\2\289\7g\2\29:\7c\2\2:;\7n\2\2;<\7+\2\2<\20\3\2\2"+
		"\2=?\t\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\22\3\2\2\2BD\4\62"+
		";\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GI\7\60\2\2HJ\4\62"+
		";\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\24\3\2\2\2MO\4\62;\2NM\3"+
		"\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\26\3\2\2\2RS\7-\2\2S\30\3\2\2\2"+
		"TU\7,\2\2U\32\3\2\2\2VX\7\17\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\f\2"+
		"\2Z\34\3\2\2\2[]\t\3\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3"+
		"\2\2\2`a\b\17\2\2a\36\3\2\2\2\t\2@EKPW^\3\3\17\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}