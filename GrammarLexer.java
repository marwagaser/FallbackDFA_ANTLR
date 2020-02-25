// Generated from Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Astate=1, Caccept=2, Baccept=3, One=4, Zero=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Astate", "Caccept", "Baccept", "One", "Zero"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Astate", "Caccept", "Baccept", "One", "Zero"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			Astate_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Astate_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("10");
			break;
		case 1:
			System.out.println("01");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\79\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13\2"+
		"\3\2\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2$"+
		"\n\2\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\4\3\4\7\4\61\n\4\f\4\16"+
		"\4\64\13\4\3\5\3\5\3\6\3\6\2\2\7\3\3\5\4\7\5\t\6\13\7\3\2\4\3\2\63\63"+
		"\3\2\62\62\2>\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\3\32\3\2\2\2\5%\3\2\2\2\7.\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r\31"+
		"\5\13\6\2\16\22\5\t\5\2\17\21\5\t\5\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20"+
		"\3\2\2\2\22\23\3\2\2\2\23\25\3\2\2\2\24\22\3\2\2\2\25\26\5\13\6\2\26\27"+
		"\5\13\6\2\27\31\3\2\2\2\30\r\3\2\2\2\30\16\3\2\2\2\31\34\3\2\2\2\32\30"+
		"\3\2\2\2\32\33\3\2\2\2\33#\3\2\2\2\34\32\3\2\2\2\35\36\5\5\3\2\36\37\b"+
		"\2\2\2\37$\3\2\2\2 !\5\7\4\2!\"\b\2\3\2\"$\3\2\2\2#\35\3\2\2\2# \3\2\2"+
		"\2$\4\3\2\2\2%)\5\t\5\2&(\5\t\5\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3"+
		"\2\2\2*,\3\2\2\2+)\3\2\2\2,-\5\13\6\2-\6\3\2\2\2.\62\5\t\5\2/\61\5\t\5"+
		"\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\b\3\2\2\2"+
		"\64\62\3\2\2\2\65\66\t\2\2\2\66\n\3\2\2\2\678\t\3\2\28\f\3\2\2\2\t\2\22"+
		"\30\32#)\62\4\3\2\2\3\2\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}