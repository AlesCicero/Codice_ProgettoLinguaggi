// $ANTLR 3.5.1 C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g 2022-11-11 17:29:24

	package Grammar.metaComvert;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class metacomvertLexer extends Lexer {
	public static final int EOF=-1;
	public static final int BACLOSE=4;
	public static final int BAOPEN=5;
	public static final int COL=6;
	public static final int COLON=7;
	public static final int COMMA=8;
	public static final int COMMENT=9;
	public static final int ENDCOL=10;
	public static final int ENDCONVERSION=11;
	public static final int ENDDELETE=12;
	public static final int ENDDOC=13;
	public static final int ENDINPATH=14;
	public static final int ENDMODIFYINGCELL=15;
	public static final int ENDNAMESHEET=16;
	public static final int ENDOUTPATH=17;
	public static final int ENDROW=18;
	public static final int INDEXDELETE=19;
	public static final int INT=20;
	public static final int NEWNAMESHEET=21;
	public static final int NEWVALUE=22;
	public static final int ROW=23;
	public static final int SCAN_ERROR=24;
	public static final int SHEETINDEX=25;
	public static final int STARTCOL=26;
	public static final int STARTCONVERSION=27;
	public static final int STARTDELETE=28;
	public static final int STARTDOC=29;
	public static final int STARTINPATH=30;
	public static final int STARTMODIFYINGCELL=31;
	public static final int STARTNAMESHEET=32;
	public static final int STARTOUTPATH=33;
	public static final int STARTROW=34;
	public static final int STRINGA=35;
	public static final int WS=36;




	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public metacomvertLexer() {} 
	public metacomvertLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public metacomvertLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g"; }

	// $ANTLR start "ENDDOC"
	public final void mENDDOC() throws RecognitionException {
		try {
			int _type = ENDDOC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:266:8: ( '#ENDDOCUMENT' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:267:2: '#ENDDOCUMENT'
			{
			match("#ENDDOCUMENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDDOC"

	// $ANTLR start "STARTDOC"
	public final void mSTARTDOC() throws RecognitionException {
		try {
			int _type = STARTDOC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:269:11: ( '#STARTDOCUMENT' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:270:2: '#STARTDOCUMENT'
			{
			match("#STARTDOCUMENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STARTDOC"

	// $ANTLR start "STARTINPATH"
	public final void mSTARTINPATH() throws RecognitionException {
		try {
			int _type = STARTINPATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:273:12: ( '#STARTINPATH' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:273:14: '#STARTINPATH'
			{
			match("#STARTINPATH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STARTINPATH"

	// $ANTLR start "ENDINPATH"
	public final void mENDINPATH() throws RecognitionException {
		try {
			int _type = ENDINPATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:276:10: ( '#ENDINPATH' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:276:12: '#ENDINPATH'
			{
			match("#ENDINPATH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDINPATH"

	// $ANTLR start "STARTOUTPATH"
	public final void mSTARTOUTPATH() throws RecognitionException {
		try {
			int _type = STARTOUTPATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:279:13: ( '#STARTOUTPATH' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:279:15: '#STARTOUTPATH'
			{
			match("#STARTOUTPATH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STARTOUTPATH"

	// $ANTLR start "ENDOUTPATH"
	public final void mENDOUTPATH() throws RecognitionException {
		try {
			int _type = ENDOUTPATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:282:11: ( '#ENDOUTPATH' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:282:13: '#ENDOUTPATH'
			{
			match("#ENDOUTPATH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDOUTPATH"

	// $ANTLR start "STARTCONVERSION"
	public final void mSTARTCONVERSION() throws RecognitionException {
		try {
			int _type = STARTCONVERSION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:285:16: ( '#STARTTYPECONVERSION' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:286:2: '#STARTTYPECONVERSION'
			{
			match("#STARTTYPECONVERSION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STARTCONVERSION"

	// $ANTLR start "ENDCONVERSION"
	public final void mENDCONVERSION() throws RecognitionException {
		try {
			int _type = ENDCONVERSION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:289:14: ( '#ENDTYPECONVERSION' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:290:2: '#ENDTYPECONVERSION'
			{
			match("#ENDTYPECONVERSION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDCONVERSION"

	// $ANTLR start "STARTNAMESHEET"
	public final void mSTARTNAMESHEET() throws RecognitionException {
		try {
			int _type = STARTNAMESHEET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:293:15: ( '#STARTNAMESHEET' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:294:2: '#STARTNAMESHEET'
			{
			match("#STARTNAMESHEET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STARTNAMESHEET"

	// $ANTLR start "ENDNAMESHEET"
	public final void mENDNAMESHEET() throws RecognitionException {
		try {
			int _type = ENDNAMESHEET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:297:13: ( '#ENDNAMESHEET' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:298:2: '#ENDNAMESHEET'
			{
			match("#ENDNAMESHEET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDNAMESHEET"

	// $ANTLR start "STARTDELETE"
	public final void mSTARTDELETE() throws RecognitionException {
		try {
			int _type = STARTDELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:303:2: ( '#STARTDELETE' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:304:2: '#STARTDELETE'
			{
			match("#STARTDELETE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STARTDELETE"

	// $ANTLR start "ENDDELETE"
	public final void mENDDELETE() throws RecognitionException {
		try {
			int _type = ENDDELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:307:2: ( '#ENDDELETE' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:308:2: '#ENDDELETE'
			{
			match("#ENDDELETE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDDELETE"

	// $ANTLR start "STARTMODIFYINGCELL"
	public final void mSTARTMODIFYINGCELL() throws RecognitionException {
		try {
			int _type = STARTMODIFYINGCELL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:312:2: ( '#STARTMODIFYINGCELL' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:313:2: '#STARTMODIFYINGCELL'
			{
			match("#STARTMODIFYINGCELL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STARTMODIFYINGCELL"

	// $ANTLR start "ENDMODIFYINGCELL"
	public final void mENDMODIFYINGCELL() throws RecognitionException {
		try {
			int _type = ENDMODIFYINGCELL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:316:2: ( '#ENDMODIFYINGCELL' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:317:2: '#ENDMODIFYINGCELL'
			{
			match("#ENDMODIFYINGCELL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDMODIFYINGCELL"

	// $ANTLR start "STARTROW"
	public final void mSTARTROW() throws RecognitionException {
		try {
			int _type = STARTROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:319:9: ( '#STARTROW' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:320:2: '#STARTROW'
			{
			match("#STARTROW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STARTROW"

	// $ANTLR start "ENDROW"
	public final void mENDROW() throws RecognitionException {
		try {
			int _type = ENDROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:322:8: ( '#ENDROW' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:323:2: '#ENDROW'
			{
			match("#ENDROW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDROW"

	// $ANTLR start "STARTCOL"
	public final void mSTARTCOL() throws RecognitionException {
		try {
			int _type = STARTCOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:326:9: ( '#STARTCOL' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:327:2: '#STARTCOL'
			{
			match("#STARTCOL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STARTCOL"

	// $ANTLR start "ENDCOL"
	public final void mENDCOL() throws RecognitionException {
		try {
			int _type = ENDCOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:329:8: ( '#ENDCOL' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:330:2: '#ENDCOL'
			{
			match("#ENDCOL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDCOL"

	// $ANTLR start "SHEETINDEX"
	public final void mSHEETINDEX() throws RecognitionException {
		try {
			int _type = SHEETINDEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:333:2: ( 'sheetIndex' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:334:2: 'sheetIndex'
			{
			match("sheetIndex"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHEETINDEX"

	// $ANTLR start "NEWNAMESHEET"
	public final void mNEWNAMESHEET() throws RecognitionException {
		try {
			int _type = NEWNAMESHEET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:337:2: ( 'nameSheet' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:338:2: 'nameSheet'
			{
			match("nameSheet"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWNAMESHEET"

	// $ANTLR start "INDEXDELETE"
	public final void mINDEXDELETE() throws RecognitionException {
		try {
			int _type = INDEXDELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:341:2: ( 'indexDelete' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:342:2: 'indexDelete'
			{
			match("indexDelete"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INDEXDELETE"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:344:7: ( ':' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:345:2: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COL"
	public final void mCOL() throws RecognitionException {
		try {
			int _type = COL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:347:5: ( 'col' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:348:2: 'col'
			{
			match("col"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COL"

	// $ANTLR start "ROW"
	public final void mROW() throws RecognitionException {
		try {
			int _type = ROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:350:5: ( 'row' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:351:2: 'row'
			{
			match("row"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ROW"

	// $ANTLR start "NEWVALUE"
	public final void mNEWVALUE() throws RecognitionException {
		try {
			int _type = NEWVALUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:353:9: ( 'value' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:354:2: 'value'
			{
			match("value"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWVALUE"

	// $ANTLR start "STRINGA"
	public final void mSTRINGA() throws RecognitionException {
		try {
			int _type = STRINGA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:359:9: ( '\"' ( options {greedy=false; } : . )* '\"' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:360:2: '\"' ( options {greedy=false; } : . )* '\"'
			{
			match('\"'); 
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:360:6: ( options {greedy=false; } : . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\"') ) {
					alt1=2;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:360:34: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop1;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGA"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:363:5: ( '*%' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '%*' ( options {greedy=false; } : . )* '*%' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='*') ) {
				alt5=1;
			}
			else if ( (LA5_0=='%') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:364:5: '*%' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("*%"); 

					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:364:10: (~ ( '\\n' | '\\r' ) )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop2;
						}
					}

					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:364:24: ( '\\r' )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0=='\r') ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:364:24: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:365:9: '%*' ( options {greedy=false; } : . )* '*%'
					{
					match("%*"); 

					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:365:14: ( options {greedy=false; } : . )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0=='*') ) {
							int LA4_1 = input.LA(2);
							if ( (LA4_1=='%') ) {
								alt4=2;
							}
							else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '$')||(LA4_1 >= '&' && LA4_1 <= '\uFFFF')) ) {
								alt4=1;
							}

						}
						else if ( ((LA4_0 >= '\u0000' && LA4_0 <= ')')||(LA4_0 >= '+' && LA4_0 <= '\uFFFF')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:365:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop4;
						}
					}

					match("*%"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:369:4: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "BAOPEN"
	public final void mBAOPEN() throws RecognitionException {
		try {
			int _type = BAOPEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:375:8: ( '<' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:376:3: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BAOPEN"

	// $ANTLR start "BACLOSE"
	public final void mBACLOSE() throws RecognitionException {
		try {
			int _type = BACLOSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:378:8: ( '>' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:379:3: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BACLOSE"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:381:8: ( ',' )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:382:3: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:384:6: ( ( '0' .. '9' )+ )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:385:3: ( '0' .. '9' )+
			{
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:385:3: ( '0' .. '9' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "SCAN_ERROR"
	public final void mSCAN_ERROR() throws RecognitionException {
		try {
			int _type = SCAN_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:388:13: ( . )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:388:15: .
			{
			matchAny(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCAN_ERROR"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:8: ( ENDDOC | STARTDOC | STARTINPATH | ENDINPATH | STARTOUTPATH | ENDOUTPATH | STARTCONVERSION | ENDCONVERSION | STARTNAMESHEET | ENDNAMESHEET | STARTDELETE | ENDDELETE | STARTMODIFYINGCELL | ENDMODIFYINGCELL | STARTROW | ENDROW | STARTCOL | ENDCOL | SHEETINDEX | NEWNAMESHEET | INDEXDELETE | COLON | COL | ROW | NEWVALUE | STRINGA | COMMENT | WS | BAOPEN | BACLOSE | COMMA | INT | SCAN_ERROR )
		int alt7=33;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:10: ENDDOC
				{
				mENDDOC(); 

				}
				break;
			case 2 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:17: STARTDOC
				{
				mSTARTDOC(); 

				}
				break;
			case 3 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:26: STARTINPATH
				{
				mSTARTINPATH(); 

				}
				break;
			case 4 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:38: ENDINPATH
				{
				mENDINPATH(); 

				}
				break;
			case 5 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:48: STARTOUTPATH
				{
				mSTARTOUTPATH(); 

				}
				break;
			case 6 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:61: ENDOUTPATH
				{
				mENDOUTPATH(); 

				}
				break;
			case 7 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:72: STARTCONVERSION
				{
				mSTARTCONVERSION(); 

				}
				break;
			case 8 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:88: ENDCONVERSION
				{
				mENDCONVERSION(); 

				}
				break;
			case 9 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:102: STARTNAMESHEET
				{
				mSTARTNAMESHEET(); 

				}
				break;
			case 10 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:117: ENDNAMESHEET
				{
				mENDNAMESHEET(); 

				}
				break;
			case 11 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:130: STARTDELETE
				{
				mSTARTDELETE(); 

				}
				break;
			case 12 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:142: ENDDELETE
				{
				mENDDELETE(); 

				}
				break;
			case 13 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:152: STARTMODIFYINGCELL
				{
				mSTARTMODIFYINGCELL(); 

				}
				break;
			case 14 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:171: ENDMODIFYINGCELL
				{
				mENDMODIFYINGCELL(); 

				}
				break;
			case 15 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:188: STARTROW
				{
				mSTARTROW(); 

				}
				break;
			case 16 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:197: ENDROW
				{
				mENDROW(); 

				}
				break;
			case 17 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:204: STARTCOL
				{
				mSTARTCOL(); 

				}
				break;
			case 18 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:213: ENDCOL
				{
				mENDCOL(); 

				}
				break;
			case 19 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:220: SHEETINDEX
				{
				mSHEETINDEX(); 

				}
				break;
			case 20 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:231: NEWNAMESHEET
				{
				mNEWNAMESHEET(); 

				}
				break;
			case 21 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:244: INDEXDELETE
				{
				mINDEXDELETE(); 

				}
				break;
			case 22 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:256: COLON
				{
				mCOLON(); 

				}
				break;
			case 23 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:262: COL
				{
				mCOL(); 

				}
				break;
			case 24 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:266: ROW
				{
				mROW(); 

				}
				break;
			case 25 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:270: NEWVALUE
				{
				mNEWVALUE(); 

				}
				break;
			case 26 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:279: STRINGA
				{
				mSTRINGA(); 

				}
				break;
			case 27 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:287: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 28 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:295: WS
				{
				mWS(); 

				}
				break;
			case 29 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:298: BAOPEN
				{
				mBAOPEN(); 

				}
				break;
			case 30 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:305: BACLOSE
				{
				mBACLOSE(); 

				}
				break;
			case 31 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:313: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 32 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:319: INT
				{
				mINT(); 

				}
				break;
			case 33 :
				// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:1:323: SCAN_ERROR
				{
				mSCAN_ERROR(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\1\uffff\4\21\1\uffff\6\21\60\uffff";
	static final String DFA7_eofS =
		"\74\uffff";
	static final String DFA7_minS =
		"\1\0\1\105\1\150\1\141\1\156\1\uffff\2\157\1\141\1\0\1\45\1\52\6\uffff"+
		"\1\116\1\124\16\uffff\1\104\1\101\1\103\1\122\1\105\7\uffff\1\124\2\uffff"+
		"\1\103\1\105\11\uffff";
	static final String DFA7_maxS =
		"\1\uffff\1\123\1\150\1\141\1\156\1\uffff\2\157\1\141\1\uffff\1\45\1\52"+
		"\6\uffff\1\116\1\124\16\uffff\1\104\1\101\1\124\1\122\1\117\7\uffff\1"+
		"\124\2\uffff\1\124\1\117\11\uffff";
	static final String DFA7_acceptS =
		"\5\uffff\1\26\6\uffff\1\34\1\35\1\36\1\37\1\40\1\41\2\uffff\1\23\1\24"+
		"\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\5\uffff\1"+
		"\4\1\6\1\10\1\12\1\16\1\20\1\22\1\uffff\1\1\1\14\2\uffff\1\3\1\5\1\7\1"+
		"\11\1\15\1\17\1\21\1\2\1\13";
	static final String DFA7_specialS =
		"\1\0\10\uffff\1\1\62\uffff}>";
	static final String[] DFA7_transitionS = {
			"\11\21\2\14\2\21\1\14\22\21\1\14\1\21\1\11\1\1\1\21\1\13\4\21\1\12\1"+
			"\21\1\17\3\21\12\20\1\5\1\21\1\15\1\21\1\16\44\21\1\6\5\21\1\4\4\21\1"+
			"\3\3\21\1\7\1\2\2\21\1\10\uff89\21",
			"\1\22\15\uffff\1\23",
			"\1\24",
			"\1\25",
			"\1\26",
			"",
			"\1\30",
			"\1\31",
			"\1\32",
			"\0\33",
			"\1\34",
			"\1\34",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\42",
			"\1\43",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\44",
			"\1\45",
			"\1\55\1\46\4\uffff\1\47\3\uffff\1\53\1\52\1\50\2\uffff\1\54\1\uffff"+
			"\1\51",
			"\1\56",
			"\1\60\11\uffff\1\57",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\61",
			"",
			"",
			"\1\71\1\62\4\uffff\1\63\3\uffff\1\67\1\66\1\64\2\uffff\1\70\1\uffff"+
			"\1\65",
			"\1\73\11\uffff\1\72",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( ENDDOC | STARTDOC | STARTINPATH | ENDINPATH | STARTOUTPATH | ENDOUTPATH | STARTCONVERSION | ENDCONVERSION | STARTNAMESHEET | ENDNAMESHEET | STARTDELETE | ENDDELETE | STARTMODIFYINGCELL | ENDMODIFYINGCELL | STARTROW | ENDROW | STARTCOL | ENDCOL | SHEETINDEX | NEWNAMESHEET | INDEXDELETE | COLON | COL | ROW | NEWVALUE | STRINGA | COMMENT | WS | BAOPEN | BACLOSE | COMMA | INT | SCAN_ERROR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA7_0 = input.LA(1);
						s = -1;
						if ( (LA7_0=='#') ) {s = 1;}
						else if ( (LA7_0=='s') ) {s = 2;}
						else if ( (LA7_0=='n') ) {s = 3;}
						else if ( (LA7_0=='i') ) {s = 4;}
						else if ( (LA7_0==':') ) {s = 5;}
						else if ( (LA7_0=='c') ) {s = 6;}
						else if ( (LA7_0=='r') ) {s = 7;}
						else if ( (LA7_0=='v') ) {s = 8;}
						else if ( (LA7_0=='\"') ) {s = 9;}
						else if ( (LA7_0=='*') ) {s = 10;}
						else if ( (LA7_0=='%') ) {s = 11;}
						else if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {s = 12;}
						else if ( (LA7_0=='<') ) {s = 13;}
						else if ( (LA7_0=='>') ) {s = 14;}
						else if ( (LA7_0==',') ) {s = 15;}
						else if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {s = 16;}
						else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\b')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\u001F')||LA7_0=='!'||LA7_0=='$'||(LA7_0 >= '&' && LA7_0 <= ')')||LA7_0=='+'||(LA7_0 >= '-' && LA7_0 <= '/')||LA7_0==';'||LA7_0=='='||(LA7_0 >= '?' && LA7_0 <= 'b')||(LA7_0 >= 'd' && LA7_0 <= 'h')||(LA7_0 >= 'j' && LA7_0 <= 'm')||(LA7_0 >= 'o' && LA7_0 <= 'q')||(LA7_0 >= 't' && LA7_0 <= 'u')||(LA7_0 >= 'w' && LA7_0 <= '\uFFFF')) ) {s = 17;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA7_9 = input.LA(1);
						s = -1;
						if ( ((LA7_9 >= '\u0000' && LA7_9 <= '\uFFFF')) ) {s = 27;}
						else s = 17;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 7, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
