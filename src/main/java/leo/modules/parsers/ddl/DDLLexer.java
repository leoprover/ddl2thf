// Generated from ../contrib/DDL.g4 by ANTLR 4.7

  package leo.modules.parsers.ddl;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DDLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, Integer=21, Positive_decimal=22, Lower_word=23, 
		WS=24, Line_comment=25, Block_comment=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "Non_zero_numeric", "Numeric", "Lower_alpha", 
		"Upper_alpha", "Alpha_numeric", "Integer", "Positive_decimal", "Lower_word", 
		"WS", "Line_comment", "Block_comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ddl'", "'('", "','", "')'", "'.'", "'~'", "'&'", "'|'", "'<=>'", 
		"'=>'", "'<='", "'$true'", "'$false'", "'$O'", "'/'", "'$O_a'", "'$O_p'", 
		"'$box_a'", "'$box_p'", "'$box'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "Integer", "Positive_decimal", 
		"Lower_word", "WS", "Line_comment", "Block_comment"
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


	public DDLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DDL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00ca\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0099"+
		"\n\32\3\33\3\33\5\33\u009d\n\33\3\34\3\34\7\34\u00a1\n\34\f\34\16\34\u00a4"+
		"\13\34\3\35\3\35\7\35\u00a8\n\35\f\35\16\35\u00ab\13\35\3\36\6\36\u00ae"+
		"\n\36\r\36\16\36\u00af\3\36\3\36\3\37\3\37\7\37\u00b6\n\37\f\37\16\37"+
		"\u00b9\13\37\3\37\3\37\3 \3 \3 \3 \7 \u00c1\n \f \16 \u00c4\13 \3 \3 "+
		"\3 \3 \3 \3\u00c2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\2\61\2\63\2\65"+
		"\27\67\309\31;\32=\33?\34\3\2\b\3\2\63;\3\2\62;\3\2c|\3\2C\\\5\2\13\f"+
		"\17\17\"\"\4\2\f\f\17\17\2\u00cd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\3A\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17"+
		"O\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25W\3\2\2\2\27Z\3\2\2\2\31]\3\2\2\2"+
		"\33c\3\2\2\2\35j\3\2\2\2\37m\3\2\2\2!o\3\2\2\2#t\3\2\2\2%y\3\2\2\2\'\u0080"+
		"\3\2\2\2)\u0087\3\2\2\2+\u008c\3\2\2\2-\u008e\3\2\2\2/\u0090\3\2\2\2\61"+
		"\u0092\3\2\2\2\63\u0098\3\2\2\2\65\u009c\3\2\2\2\67\u009e\3\2\2\29\u00a5"+
		"\3\2\2\2;\u00ad\3\2\2\2=\u00b3\3\2\2\2?\u00bc\3\2\2\2AB\7f\2\2BC\7f\2"+
		"\2CD\7n\2\2D\4\3\2\2\2EF\7*\2\2F\6\3\2\2\2GH\7.\2\2H\b\3\2\2\2IJ\7+\2"+
		"\2J\n\3\2\2\2KL\7\60\2\2L\f\3\2\2\2MN\7\u0080\2\2N\16\3\2\2\2OP\7(\2\2"+
		"P\20\3\2\2\2QR\7~\2\2R\22\3\2\2\2ST\7>\2\2TU\7?\2\2UV\7@\2\2V\24\3\2\2"+
		"\2WX\7?\2\2XY\7@\2\2Y\26\3\2\2\2Z[\7>\2\2[\\\7?\2\2\\\30\3\2\2\2]^\7&"+
		"\2\2^_\7v\2\2_`\7t\2\2`a\7w\2\2ab\7g\2\2b\32\3\2\2\2cd\7&\2\2de\7h\2\2"+
		"ef\7c\2\2fg\7n\2\2gh\7u\2\2hi\7g\2\2i\34\3\2\2\2jk\7&\2\2kl\7Q\2\2l\36"+
		"\3\2\2\2mn\7\61\2\2n \3\2\2\2op\7&\2\2pq\7Q\2\2qr\7a\2\2rs\7c\2\2s\"\3"+
		"\2\2\2tu\7&\2\2uv\7Q\2\2vw\7a\2\2wx\7r\2\2x$\3\2\2\2yz\7&\2\2z{\7d\2\2"+
		"{|\7q\2\2|}\7z\2\2}~\7a\2\2~\177\7c\2\2\177&\3\2\2\2\u0080\u0081\7&\2"+
		"\2\u0081\u0082\7d\2\2\u0082\u0083\7q\2\2\u0083\u0084\7z\2\2\u0084\u0085"+
		"\7a\2\2\u0085\u0086\7r\2\2\u0086(\3\2\2\2\u0087\u0088\7&\2\2\u0088\u0089"+
		"\7d\2\2\u0089\u008a\7q\2\2\u008a\u008b\7z\2\2\u008b*\3\2\2\2\u008c\u008d"+
		"\t\2\2\2\u008d,\3\2\2\2\u008e\u008f\t\3\2\2\u008f.\3\2\2\2\u0090\u0091"+
		"\t\4\2\2\u0091\60\3\2\2\2\u0092\u0093\t\5\2\2\u0093\62\3\2\2\2\u0094\u0099"+
		"\5/\30\2\u0095\u0099\5\61\31\2\u0096\u0099\5-\27\2\u0097\u0099\7a\2\2"+
		"\u0098\u0094\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097"+
		"\3\2\2\2\u0099\64\3\2\2\2\u009a\u009d\7\62\2\2\u009b\u009d\5\67\34\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\66\3\2\2\2\u009e\u00a2\5+\26"+
		"\2\u009f\u00a1\5-\27\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a38\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a9\5/\30\2\u00a6\u00a8\5\63\32\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3"+
		"\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa:\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00ae\t\6\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\36"+
		"\2\2\u00b2<\3\2\2\2\u00b3\u00b7\7\'\2\2\u00b4\u00b6\n\7\2\2\u00b5\u00b4"+
		"\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\b\37\2\2\u00bb>\3\2\2\2"+
		"\u00bc\u00bd\7\61\2\2\u00bd\u00be\7,\2\2\u00be\u00c2\3\2\2\2\u00bf\u00c1"+
		"\13\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c3\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6"+
		"\7,\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b \2\2\u00c9"+
		"@\3\2\2\2\n\2\u0098\u009c\u00a2\u00a9\u00af\u00b7\u00c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}