// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BigCalcProgLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, Variable=9, 
		Number=10, Digit=11, WS=12, COMMENT=13, LINE_COMMENT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "Variable", 
			"Number", "Digit", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'*'", "'/'", "'+'", "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "Variable", "Number", 
			"Digit", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public BigCalcProgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BigCalcProg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000ei\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b0\b\b\n\b\f\b3\t\b\u0001\t\u0005"+
		"\t6\b\t\n\t\f\t9\t\t\u0001\t\u0001\t\u0004\t=\b\t\u000b\t\f\t>\u0001\t"+
		"\u0004\tB\b\t\u000b\t\f\tC\u0003\tF\b\t\u0001\n\u0001\n\u0001\u000b\u0004"+
		"\u000bK\b\u000b\u000b\u000b\f\u000bL\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\fU\b\f\n\f\f\fX\t\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\rc\b\r\n\r\f\rf\t\r\u0001"+
		"\r\u0001\r\u0001V\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0005\u0002\u0000AZaz\u0003\u0000"+
		"09AZaz\u0001\u000009\u0003\u0000\t\n\f\r  \u0002\u0000\n\n\r\rp\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001\u001d"+
		"\u0001\u0000\u0000\u0000\u0003\u001f\u0001\u0000\u0000\u0000\u0005!\u0001"+
		"\u0000\u0000\u0000\u0007#\u0001\u0000\u0000\u0000\t%\u0001\u0000\u0000"+
		"\u0000\u000b\'\u0001\u0000\u0000\u0000\r)\u0001\u0000\u0000\u0000\u000f"+
		"+\u0001\u0000\u0000\u0000\u0011-\u0001\u0000\u0000\u0000\u0013E\u0001"+
		"\u0000\u0000\u0000\u0015G\u0001\u0000\u0000\u0000\u0017J\u0001\u0000\u0000"+
		"\u0000\u0019P\u0001\u0000\u0000\u0000\u001b^\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005=\u0000\u0000\u001e\u0002\u0001\u0000\u0000\u0000\u001f \u0005"+
		";\u0000\u0000 \u0004\u0001\u0000\u0000\u0000!\"\u0005*\u0000\u0000\"\u0006"+
		"\u0001\u0000\u0000\u0000#$\u0005/\u0000\u0000$\b\u0001\u0000\u0000\u0000"+
		"%&\u0005+\u0000\u0000&\n\u0001\u0000\u0000\u0000\'(\u0005-\u0000\u0000"+
		"(\f\u0001\u0000\u0000\u0000)*\u0005(\u0000\u0000*\u000e\u0001\u0000\u0000"+
		"\u0000+,\u0005)\u0000\u0000,\u0010\u0001\u0000\u0000\u0000-1\u0007\u0000"+
		"\u0000\u0000.0\u0007\u0001\u0000\u0000/.\u0001\u0000\u0000\u000003\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"2\u0012\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000046\u0003\u0015"+
		"\n\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:<\u0005.\u0000\u0000;=\u0003\u0015\n\u0000<;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?F\u0001\u0000\u0000\u0000@B\u0003\u0015\n\u0000"+
		"A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000E7\u0001\u0000"+
		"\u0000\u0000EA\u0001\u0000\u0000\u0000F\u0014\u0001\u0000\u0000\u0000"+
		"GH\u0007\u0002\u0000\u0000H\u0016\u0001\u0000\u0000\u0000IK\u0007\u0003"+
		"\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NO\u0006\u000b\u0000\u0000O\u0018\u0001\u0000\u0000\u0000PQ\u0005/\u0000"+
		"\u0000QR\u0005*\u0000\u0000RV\u0001\u0000\u0000\u0000SU\t\u0000\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000YZ\u0005*\u0000\u0000Z[\u0005/\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0006\f\u0000\u0000]\u001a\u0001\u0000\u0000\u0000"+
		"^_\u0005/\u0000\u0000_`\u0005/\u0000\u0000`d\u0001\u0000\u0000\u0000a"+
		"c\b\u0004\u0000\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000gh\u0006\r\u0000\u0000h\u001c\u0001\u0000"+
		"\u0000\u0000\t\u000017>CELVd\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}