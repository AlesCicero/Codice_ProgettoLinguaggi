// $ANTLR 3.5.1 C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g 2022-11-11 17:29:24

package Grammar.metaComvert;

	// Inserire le import per costruttore (vedere @members )
	//SE SI VUOLE UTILIZZARE IL FILE ParserLauncher
	
import Grammar.metaComvert.util.*;
import Grammar.metaComvert.MetaComvertHandler;
import java.io.IOException;
import java.io.StringReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import LFCLibrary.TypeConversion.*;





import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class metacomvertParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BACLOSE", "BAOPEN", "COL", "COLON", 
		"COMMA", "COMMENT", "ENDCOL", "ENDCONVERSION", "ENDDELETE", "ENDDOC", 
		"ENDINPATH", "ENDMODIFYINGCELL", "ENDNAMESHEET", "ENDOUTPATH", "ENDROW", 
		"INDEXDELETE", "INT", "NEWNAMESHEET", "NEWVALUE", "ROW", "SCAN_ERROR", 
		"SHEETINDEX", "STARTCOL", "STARTCONVERSION", "STARTDELETE", "STARTDOC", 
		"STARTINPATH", "STARTMODIFYINGCELL", "STARTNAMESHEET", "STARTOUTPATH", 
		"STARTROW", "STRINGA", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public metacomvertParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public metacomvertParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return metacomvertParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g"; }



	// ************************************ inizio Analizzatore semantico

	MetaComvertHandler h;


	// ****************************************** Parte scanner e parser 
		public metacomvertParser(FileReader fileIn, converterExcelToType cET) throws  IOException{
					this(new CommonTokenStream(
									new metacomvertLexer(
											new ANTLRReaderStream(fileIn))));
			
					h = new MetaComvertHandler(input, cET);
				}
				
	public MetaComvertHandler getHandler() {
	    return h;
	  }
	  
				
				
	public List<String> getErrorList () {
	    return h.getErrorList();
	  }
		public void displayRecognitionError(String[] tokenNames,
	                                       RecognitionException e) {
			String hdr = " * " + getErrorHeader(e);
			String msg = " - " + getErrorMessage(e, tokenNames);
			  
			h.handleError(tokenNames, e, hdr, msg);
	  }





	//**





	// $ANTLR start "language"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:79:1: language : STARTDOC wsc body wsc ENDDOC ;
	public final void language() throws RecognitionException {
		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:80:2: ( STARTDOC wsc body wsc ENDDOC )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:81:3: STARTDOC wsc body wsc ENDDOC
			{
			match(input,STARTDOC,FOLLOW_STARTDOC_in_language62); 
			pushFollow(FOLLOW_wsc_in_language64);
			wsc();
			state._fsp--;

			pushFollow(FOLLOW_body_in_language66);
			body();
			state._fsp--;

			pushFollow(FOLLOW_wsc_in_language68);
			wsc();
			state._fsp--;

			match(input,ENDDOC,FOLLOW_ENDDOC_in_language71); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "language"



	// $ANTLR start "body"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:85:2: body : (inPath= inpath ) wsc (outPath= outpath )? wsc (convTok= conversion ) wsc (nameSheet= namesheet )? wsc ( delete )? wsc (modCell= modifyingcell )? ;
	public final void body() throws RecognitionException {
		Token inPath =null;
		ArrayList<Token> outPath =null;
		ArrayList<Token> convTok =null;
		Map<Token, Token> nameSheet =null;
		ArrayList<cellModifyingClass<Token,Token,Token,Token>> modCell =null;

		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:85:7: ( (inPath= inpath ) wsc (outPath= outpath )? wsc (convTok= conversion ) wsc (nameSheet= namesheet )? wsc ( delete )? wsc (modCell= modifyingcell )? )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:88:3: (inPath= inpath ) wsc (outPath= outpath )? wsc (convTok= conversion ) wsc (nameSheet= namesheet )? wsc ( delete )? wsc (modCell= modifyingcell )?
			{
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:88:3: (inPath= inpath )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:88:4: inPath= inpath
			{
			pushFollow(FOLLOW_inpath_in_body98);
			inPath=inpath();
			state._fsp--;

			h.setInputPath(inPath);
			}

			pushFollow(FOLLOW_wsc_in_body110);
			wsc();
			state._fsp--;

			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:94:3: (outPath= outpath )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==STARTOUTPATH) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:94:4: outPath= outpath
					{
					pushFollow(FOLLOW_outpath_in_body125);
					outPath=outpath();
					state._fsp--;

					h.setOuputPath(outPath);
					}
					break;

			}

			pushFollow(FOLLOW_wsc_in_body141);
			wsc();
			state._fsp--;

			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:101:3: (convTok= conversion )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:101:4: convTok= conversion
			{
			pushFollow(FOLLOW_conversion_in_body156);
			convTok=conversion();
			state._fsp--;

			 h.setConversionType(convTok);
			}

			pushFollow(FOLLOW_wsc_in_body170);
			wsc();
			state._fsp--;

			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:107:3: (nameSheet= namesheet )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==STARTNAMESHEET) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:107:4: nameSheet= namesheet
					{
					pushFollow(FOLLOW_namesheet_in_body185);
					nameSheet=namesheet();
					state._fsp--;

					 h.setSheetName(nameSheet);
					}
					break;

			}

			pushFollow(FOLLOW_wsc_in_body198);
			wsc();
			state._fsp--;

			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:112:3: ( delete )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==STARTDELETE) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:112:4: delete
					{
					pushFollow(FOLLOW_delete_in_body206);
					delete();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_wsc_in_body218);
			wsc();
			state._fsp--;

			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:119:3: (modCell= modifyingcell )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==STARTMODIFYINGCELL) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:119:4: modCell= modifyingcell
					{
					pushFollow(FOLLOW_modifyingcell_in_body236);
					modCell=modifyingcell();
					state._fsp--;

					h.modifyingCellMeth(modCell);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "body"



	// $ANTLR start "wsc"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:123:1: wsc : ( WS | COMMENT | scanerror )* ;
	public final void wsc() throws RecognitionException {
		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:123:5: ( ( WS | COMMENT | scanerror )* )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:124:2: ( WS | COMMENT | scanerror )*
			{
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:124:2: ( WS | COMMENT | scanerror )*
			loop5:
			while (true) {
				int alt5=4;
				switch ( input.LA(1) ) {
				case WS:
					{
					alt5=1;
					}
					break;
				case COMMENT:
					{
					alt5=2;
					}
					break;
				case SCAN_ERROR:
					{
					alt5=3;
					}
					break;
				}
				switch (alt5) {
				case 1 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:124:3: WS
					{
					match(input,WS,FOLLOW_WS_in_wsc255); 
					}
					break;
				case 2 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:124:8: COMMENT
					{
					match(input,COMMENT,FOLLOW_COMMENT_in_wsc259); 
					}
					break;
				case 3 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:124:17: scanerror
					{
					pushFollow(FOLLOW_scanerror_in_wsc262);
					scanerror();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "wsc"



	// $ANTLR start "inpath"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:128:1: inpath returns [Token t] : STARTINPATH (startInPath= path ) ENDINPATH wsc ;
	public final Token inpath() throws RecognitionException {
		Token t = null;


		Token startInPath =null;

		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:129:2: ( STARTINPATH (startInPath= path ) ENDINPATH wsc )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:130:3: STARTINPATH (startInPath= path ) ENDINPATH wsc
			{
			match(input,STARTINPATH,FOLLOW_STARTINPATH_in_inpath283); 
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:130:15: (startInPath= path )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:130:16: startInPath= path
			{
			pushFollow(FOLLOW_path_in_inpath290);
			startInPath=path();
			state._fsp--;

			 t = startInPath;
			}

			match(input,ENDINPATH,FOLLOW_ENDINPATH_in_inpath295); 
			pushFollow(FOLLOW_wsc_in_inpath299);
			wsc();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "inpath"



	// $ANTLR start "path"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:135:1: path returns [Token t] : wsc BAOPEN (baOpen= STRINGA ) BACLOSE wsc ;
	public final Token path() throws RecognitionException {
		Token t = null;


		Token baOpen=null;

		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:136:2: ( wsc BAOPEN (baOpen= STRINGA ) BACLOSE wsc )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:137:2: wsc BAOPEN (baOpen= STRINGA ) BACLOSE wsc
			{
			pushFollow(FOLLOW_wsc_in_path322);
			wsc();
			state._fsp--;

			match(input,BAOPEN,FOLLOW_BAOPEN_in_path324); 
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:137:13: (baOpen= STRINGA )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:137:14: baOpen= STRINGA
			{
			baOpen=(Token)match(input,STRINGA,FOLLOW_STRINGA_in_path331); 
			t = baOpen;
			}

			match(input,BACLOSE,FOLLOW_BACLOSE_in_path337); 
			pushFollow(FOLLOW_wsc_in_path340);
			wsc();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return t;
	}
	// $ANTLR end "path"



	// $ANTLR start "outpath"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:142:1: outpath returns [ArrayList<Token> outPath] : STARTOUTPATH (startOutPath= path )+ ENDOUTPATH ;
	public final ArrayList<Token> outpath() throws RecognitionException {
		ArrayList<Token> outPath = null;


		Token startOutPath =null;

		outPath = new ArrayList<Token>();
		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:145:2: ( STARTOUTPATH (startOutPath= path )+ ENDOUTPATH )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:147:2: STARTOUTPATH (startOutPath= path )+ ENDOUTPATH
			{
			match(input,STARTOUTPATH,FOLLOW_STARTOUTPATH_in_outpath370); 
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:147:15: (startOutPath= path )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==BAOPEN||LA6_0==COMMENT||LA6_0==SCAN_ERROR||LA6_0==WS) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:147:16: startOutPath= path
					{
					pushFollow(FOLLOW_path_in_outpath376);
					startOutPath=path();
					state._fsp--;

					 outPath.add(startOutPath);
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			match(input,ENDOUTPATH,FOLLOW_ENDOUTPATH_in_outpath382); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return outPath;
	}
	// $ANTLR end "outpath"



	// $ANTLR start "conversion"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:152:1: conversion returns [ArrayList<Token> convTok] : STARTCONVERSION wsc (convType= type ) wsc ENDCONVERSION ;
	public final ArrayList<Token> conversion() throws RecognitionException {
		ArrayList<Token> convTok = null;


		ArrayList<Token> convType =null;

		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:153:2: ( STARTCONVERSION wsc (convType= type ) wsc ENDCONVERSION )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:155:2: STARTCONVERSION wsc (convType= type ) wsc ENDCONVERSION
			{
			match(input,STARTCONVERSION,FOLLOW_STARTCONVERSION_in_conversion408); 
			pushFollow(FOLLOW_wsc_in_conversion410);
			wsc();
			state._fsp--;

			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:155:22: (convType= type )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:155:24: convType= type
			{
			pushFollow(FOLLOW_type_in_conversion418);
			convType=type();
			state._fsp--;

			 convTok = convType;
			}

			pushFollow(FOLLOW_wsc_in_conversion422);
			wsc();
			state._fsp--;

			match(input,ENDCONVERSION,FOLLOW_ENDCONVERSION_in_conversion424); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return convTok;
	}
	// $ANTLR end "conversion"



	// $ANTLR start "namesheet"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:159:1: namesheet returns [Map<Token, Token> nameSheet] : STARTNAMESHEET (nameSh= sheet ) wsc ENDNAMESHEET ;
	public final Map<Token, Token> namesheet() throws RecognitionException {
		Map<Token, Token> nameSheet = null;


		Map<Token,Token> nameSh =null;

		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:160:2: ( STARTNAMESHEET (nameSh= sheet ) wsc ENDNAMESHEET )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:162:2: STARTNAMESHEET (nameSh= sheet ) wsc ENDNAMESHEET
			{
			match(input,STARTNAMESHEET,FOLLOW_STARTNAMESHEET_in_namesheet446); 
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:162:17: (nameSh= sheet )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:162:19: nameSh= sheet
			{
			pushFollow(FOLLOW_sheet_in_namesheet454);
			nameSh=sheet();
			state._fsp--;

			 nameSheet = nameSh;
			}

			pushFollow(FOLLOW_wsc_in_namesheet459);
			wsc();
			state._fsp--;

			match(input,ENDNAMESHEET,FOLLOW_ENDNAMESHEET_in_namesheet461); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return nameSheet;
	}
	// $ANTLR end "namesheet"



	// $ANTLR start "sheet"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:166:1: sheet returns [Map<Token,Token> nameSheet] : ( wsc BAOPEN SHEETINDEX COLON (indexSheet= ( INT | STRINGA ) ) COMMA NEWNAMESHEET COLON (nameSh= STRINGA ) BACLOSE wsc )+ ;
	public final Map<Token,Token> sheet() throws RecognitionException {
		Map<Token,Token> nameSheet = null;


		Token indexSheet=null;
		Token nameSh=null;

		 nameSheet = new HashMap<Token, Token>();
		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:169:2: ( ( wsc BAOPEN SHEETINDEX COLON (indexSheet= ( INT | STRINGA ) ) COMMA NEWNAMESHEET COLON (nameSh= STRINGA ) BACLOSE wsc )+ )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:171:2: ( wsc BAOPEN SHEETINDEX COLON (indexSheet= ( INT | STRINGA ) ) COMMA NEWNAMESHEET COLON (nameSh= STRINGA ) BACLOSE wsc )+
			{
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:171:2: ( wsc BAOPEN SHEETINDEX COLON (indexSheet= ( INT | STRINGA ) ) COMMA NEWNAMESHEET COLON (nameSh= STRINGA ) BACLOSE wsc )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				switch ( input.LA(1) ) {
				case WS:
					{
					alt7=1;
					}
					break;
				case COMMENT:
					{
					alt7=1;
					}
					break;
				case SCAN_ERROR:
					{
					alt7=1;
					}
					break;
				case BAOPEN:
					{
					alt7=1;
					}
					break;
				}
				switch (alt7) {
				case 1 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:171:3: wsc BAOPEN SHEETINDEX COLON (indexSheet= ( INT | STRINGA ) ) COMMA NEWNAMESHEET COLON (nameSh= STRINGA ) BACLOSE wsc
					{
					pushFollow(FOLLOW_wsc_in_sheet490);
					wsc();
					state._fsp--;

					match(input,BAOPEN,FOLLOW_BAOPEN_in_sheet492); 
					match(input,SHEETINDEX,FOLLOW_SHEETINDEX_in_sheet494); 
					match(input,COLON,FOLLOW_COLON_in_sheet496); 
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:171:31: (indexSheet= ( INT | STRINGA ) )
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:171:33: indexSheet= ( INT | STRINGA )
					{
					indexSheet=input.LT(1);
					if ( input.LA(1)==INT||input.LA(1)==STRINGA ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}

					System.out.println("tipo : "+ indexSheet.getType());
					match(input,COMMA,FOLLOW_COMMA_in_sheet515); 
					match(input,NEWNAMESHEET,FOLLOW_NEWNAMESHEET_in_sheet517); 
					match(input,COLON,FOLLOW_COLON_in_sheet520); 
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:173:2: (nameSh= STRINGA )
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:173:4: nameSh= STRINGA
					{
					nameSh=(Token)match(input,STRINGA,FOLLOW_STRINGA_in_sheet530); 
					nameSheet.put(indexSheet, nameSh);
					}

					match(input,BACLOSE,FOLLOW_BACLOSE_in_sheet537); 
					pushFollow(FOLLOW_wsc_in_sheet539);
					wsc();
					state._fsp--;

					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return nameSheet;
	}
	// $ANTLR end "sheet"



	// $ANTLR start "type"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:178:1: type returns [ArrayList<Token> convType] : ( BAOPEN ) (convType1= STRINGA ) ( BACLOSE ) wsc ( ( BAOPEN ) (convType2= STRINGA ) ( BACLOSE ) )? wsc ( ( BAOPEN ) (convType3= STRINGA ) ( BACLOSE ) )? ;
	public final ArrayList<Token> type() throws RecognitionException {
		ArrayList<Token> convType = null;


		Token convType1=null;
		Token convType2=null;
		Token convType3=null;

		 convType = new ArrayList<Token>();
		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:181:2: ( ( BAOPEN ) (convType1= STRINGA ) ( BACLOSE ) wsc ( ( BAOPEN ) (convType2= STRINGA ) ( BACLOSE ) )? wsc ( ( BAOPEN ) (convType3= STRINGA ) ( BACLOSE ) )? )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:182:2: ( BAOPEN ) (convType1= STRINGA ) ( BACLOSE ) wsc ( ( BAOPEN ) (convType2= STRINGA ) ( BACLOSE ) )? wsc ( ( BAOPEN ) (convType3= STRINGA ) ( BACLOSE ) )?
			{
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:182:2: ( BAOPEN )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:182:3: BAOPEN
			{
			match(input,BAOPEN,FOLLOW_BAOPEN_in_type569); 
			}

			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:182:11: (convType1= STRINGA )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:182:12: convType1= STRINGA
			{
			convType1=(Token)match(input,STRINGA,FOLLOW_STRINGA_in_type577); 
			convType.add(convType1);
			}

			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:182:60: ( BACLOSE )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:182:61: BACLOSE
			{
			match(input,BACLOSE,FOLLOW_BACLOSE_in_type583); 
			}

			pushFollow(FOLLOW_wsc_in_type586);
			wsc();
			state._fsp--;

			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:183:2: ( ( BAOPEN ) (convType2= STRINGA ) ( BACLOSE ) )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==BAOPEN) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:183:4: ( BAOPEN ) (convType2= STRINGA ) ( BACLOSE )
					{
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:183:4: ( BAOPEN )
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:183:5: BAOPEN
					{
					match(input,BAOPEN,FOLLOW_BAOPEN_in_type593); 
					}

					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:183:14: (convType2= STRINGA )
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:183:15: convType2= STRINGA
					{
					convType2=(Token)match(input,STRINGA,FOLLOW_STRINGA_in_type602); 
					convType.add(convType2);
					}

					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:183:64: ( BACLOSE )
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:183:66: BACLOSE
					{
					match(input,BACLOSE,FOLLOW_BACLOSE_in_type610); 
					}

					}
					break;

			}

			pushFollow(FOLLOW_wsc_in_type615);
			wsc();
			state._fsp--;

			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:184:2: ( ( BAOPEN ) (convType3= STRINGA ) ( BACLOSE ) )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==BAOPEN) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:184:3: ( BAOPEN ) (convType3= STRINGA ) ( BACLOSE )
					{
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:184:3: ( BAOPEN )
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:184:4: BAOPEN
					{
					match(input,BAOPEN,FOLLOW_BAOPEN_in_type620); 
					}

					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:184:12: (convType3= STRINGA )
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:184:13: convType3= STRINGA
					{
					convType3=(Token)match(input,STRINGA,FOLLOW_STRINGA_in_type628); 
					convType.add(convType3);
					}

					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:184:61: ( BACLOSE )
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:184:62: BACLOSE
					{
					match(input,BACLOSE,FOLLOW_BACLOSE_in_type634); 
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return convType;
	}
	// $ANTLR end "type"



	// $ANTLR start "delete"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:189:1: delete : STARTDELETE wsc (r= row )? wsc (c= col )? wsc ENDDELETE ;
	public final void delete() throws RecognitionException {
		ArrayList<Delete<Token,Token>> r =null;
		ArrayList<Delete<Token,Token>> c =null;

		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:190:2: ( STARTDELETE wsc (r= row )? wsc (c= col )? wsc ENDDELETE )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:192:2: STARTDELETE wsc (r= row )? wsc (c= col )? wsc ENDDELETE
			{
			match(input,STARTDELETE,FOLLOW_STARTDELETE_in_delete656); 
			pushFollow(FOLLOW_wsc_in_delete658);
			wsc();
			state._fsp--;

			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:192:19: (r= row )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==STARTROW) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:192:20: r= row
					{
					pushFollow(FOLLOW_row_in_delete666);
					r=row();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_wsc_in_delete671);
			wsc();
			state._fsp--;

			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:192:35: (c= col )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==STARTCOL) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:192:36: c= col
					{
					pushFollow(FOLLOW_col_in_delete678);
					c=col();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_wsc_in_delete682);
			wsc();
			state._fsp--;

			match(input,ENDDELETE,FOLLOW_ENDDELETE_in_delete684); 

				if( r != null && c != null)
					h.fusionDelete(r,c);
				else if(c == null && r != null){
					ArrayList<Delete<Token,Token>> c1 = new ArrayList<Delete<Token,Token>>();
					h.fusionDelete(r,c1);
				}
				else if (c != null && r == null) {
					ArrayList<Delete<Token,Token>> r1 = new ArrayList<Delete<Token,Token>>();
					h.fusionDelete(r1,c);
				}
				else if (c == null && r == null){
					ArrayList<Delete<Token,Token>> r1 = new ArrayList<Delete<Token,Token>>();
					ArrayList<Delete<Token,Token>> c1 = new ArrayList<Delete<Token,Token>>();
					h.fusionDelete(r1,c1);
				
				}
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "delete"



	// $ANTLR start "row"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:214:1: row returns [ArrayList<Delete<Token,Token>> row] : STARTROW (deleteRow= todelete ) ENDROW ;
	public final ArrayList<Delete<Token,Token>> row() throws RecognitionException {
		ArrayList<Delete<Token,Token>> row = null;


		ArrayList<Delete<Token,Token>> deleteRow =null;

		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:215:2: ( STARTROW (deleteRow= todelete ) ENDROW )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:217:2: STARTROW (deleteRow= todelete ) ENDROW
			{
			match(input,STARTROW,FOLLOW_STARTROW_in_row708); 
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:217:11: (deleteRow= todelete )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:217:12: deleteRow= todelete
			{
			pushFollow(FOLLOW_todelete_in_row715);
			deleteRow=todelete();
			state._fsp--;

			row = deleteRow;
			}

			match(input,ENDROW,FOLLOW_ENDROW_in_row719); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return row;
	}
	// $ANTLR end "row"



	// $ANTLR start "col"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:221:1: col returns [ArrayList<Delete<Token,Token>> col] : STARTCOL (deleteCol= todelete ) ENDCOL ;
	public final ArrayList<Delete<Token,Token>> col() throws RecognitionException {
		ArrayList<Delete<Token,Token>> col = null;


		ArrayList<Delete<Token,Token>> deleteCol =null;

		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:222:2: ( STARTCOL (deleteCol= todelete ) ENDCOL )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:224:2: STARTCOL (deleteCol= todelete ) ENDCOL
			{
			match(input,STARTCOL,FOLLOW_STARTCOL_in_col740); 
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:224:11: (deleteCol= todelete )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:224:12: deleteCol= todelete
			{
			pushFollow(FOLLOW_todelete_in_col747);
			deleteCol=todelete();
			state._fsp--;

			col = deleteCol;
			}

			match(input,ENDCOL,FOLLOW_ENDCOL_in_col751); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return col;
	}
	// $ANTLR end "col"



	// $ANTLR start "todelete"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:228:1: todelete returns [ArrayList<Delete<Token,Token>> d] : ( wsc BAOPEN SHEETINDEX COLON (index= ( INT | STRINGA ) ) COMMA INDEXDELETE COLON (del= INT ) BACLOSE wsc )+ ;
	public final ArrayList<Delete<Token,Token>> todelete() throws RecognitionException {
		ArrayList<Delete<Token,Token>> d = null;


		Token index=null;
		Token del=null;

		 d = new ArrayList<>();
		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:231:2: ( ( wsc BAOPEN SHEETINDEX COLON (index= ( INT | STRINGA ) ) COMMA INDEXDELETE COLON (del= INT ) BACLOSE wsc )+ )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:233:2: ( wsc BAOPEN SHEETINDEX COLON (index= ( INT | STRINGA ) ) COMMA INDEXDELETE COLON (del= INT ) BACLOSE wsc )+
			{
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:233:2: ( wsc BAOPEN SHEETINDEX COLON (index= ( INT | STRINGA ) ) COMMA INDEXDELETE COLON (del= INT ) BACLOSE wsc )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==BAOPEN||LA12_0==COMMENT||LA12_0==SCAN_ERROR||LA12_0==WS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:233:3: wsc BAOPEN SHEETINDEX COLON (index= ( INT | STRINGA ) ) COMMA INDEXDELETE COLON (del= INT ) BACLOSE wsc
					{
					pushFollow(FOLLOW_wsc_in_todelete779);
					wsc();
					state._fsp--;

					match(input,BAOPEN,FOLLOW_BAOPEN_in_todelete781); 
					match(input,SHEETINDEX,FOLLOW_SHEETINDEX_in_todelete783); 
					match(input,COLON,FOLLOW_COLON_in_todelete785); 
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:233:31: (index= ( INT | STRINGA ) )
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:233:32: index= ( INT | STRINGA )
					{
					index=input.LT(1);
					if ( input.LA(1)==INT||input.LA(1)==STRINGA ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}

					match(input,COMMA,FOLLOW_COMMA_in_todelete801); 
					match(input,INDEXDELETE,FOLLOW_INDEXDELETE_in_todelete803); 
					match(input,COLON,FOLLOW_COLON_in_todelete805); 
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:234:2: (del= INT )
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:234:3: del= INT
					{
					del=(Token)match(input,INT,FOLLOW_INT_in_todelete814); 
					Delete p= new Delete(index,del); d.add(p);
					}

					match(input,BACLOSE,FOLLOW_BACLOSE_in_todelete820); 
					pushFollow(FOLLOW_wsc_in_todelete822);
					wsc();
					state._fsp--;

					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return d;
	}
	// $ANTLR end "todelete"



	// $ANTLR start "modifyingcell"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:241:1: modifyingcell returns [ArrayList<cellModifyingClass<Token,Token,Token,Token>> modifyCell] : STARTMODIFYINGCELL (modCell= modcell ) ENDMODIFYINGCELL ;
	public final ArrayList<cellModifyingClass<Token,Token,Token,Token>> modifyingcell() throws RecognitionException {
		ArrayList<cellModifyingClass<Token,Token,Token,Token>> modifyCell = null;


		ArrayList<cellModifyingClass<Token,Token,Token,Token>> modCell =null;

		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:242:2: ( STARTMODIFYINGCELL (modCell= modcell ) ENDMODIFYINGCELL )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:244:2: STARTMODIFYINGCELL (modCell= modcell ) ENDMODIFYINGCELL
			{
			match(input,STARTMODIFYINGCELL,FOLLOW_STARTMODIFYINGCELL_in_modifyingcell852); 
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:244:21: (modCell= modcell )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:244:22: modCell= modcell
			{
			pushFollow(FOLLOW_modcell_in_modifyingcell859);
			modCell=modcell();
			state._fsp--;

			modifyCell = modCell;
			}

			match(input,ENDMODIFYINGCELL,FOLLOW_ENDMODIFYINGCELL_in_modifyingcell863); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return modifyCell;
	}
	// $ANTLR end "modifyingcell"



	// $ANTLR start "modcell"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:248:1: modcell returns [ArrayList<cellModifyingClass<Token,Token,Token,Token>> modifyCell] : ( wsc BAOPEN SHEETINDEX COLON (indexSheet= ( INT | STRINGA ) ) COMMA ROW COLON (rowMod= ( INT | STRINGA ) ) COMMA COL COLON (colMod= ( INT | STRINGA ) ) COMMA NEWVALUE COLON (valueCell= ( INT | STRINGA ) ) BACLOSE wsc )+ ;
	public final ArrayList<cellModifyingClass<Token,Token,Token,Token>> modcell() throws RecognitionException {
		ArrayList<cellModifyingClass<Token,Token,Token,Token>> modifyCell = null;


		Token indexSheet=null;
		Token rowMod=null;
		Token colMod=null;
		Token valueCell=null;

		modifyCell = new ArrayList<>();
		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:251:2: ( ( wsc BAOPEN SHEETINDEX COLON (indexSheet= ( INT | STRINGA ) ) COMMA ROW COLON (rowMod= ( INT | STRINGA ) ) COMMA COL COLON (colMod= ( INT | STRINGA ) ) COMMA NEWVALUE COLON (valueCell= ( INT | STRINGA ) ) BACLOSE wsc )+ )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:253:2: ( wsc BAOPEN SHEETINDEX COLON (indexSheet= ( INT | STRINGA ) ) COMMA ROW COLON (rowMod= ( INT | STRINGA ) ) COMMA COL COLON (colMod= ( INT | STRINGA ) ) COMMA NEWVALUE COLON (valueCell= ( INT | STRINGA ) ) BACLOSE wsc )+
			{
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:253:2: ( wsc BAOPEN SHEETINDEX COLON (indexSheet= ( INT | STRINGA ) ) COMMA ROW COLON (rowMod= ( INT | STRINGA ) ) COMMA COL COLON (colMod= ( INT | STRINGA ) ) COMMA NEWVALUE COLON (valueCell= ( INT | STRINGA ) ) BACLOSE wsc )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==BAOPEN||LA13_0==COMMENT||LA13_0==SCAN_ERROR||LA13_0==WS) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:253:3: wsc BAOPEN SHEETINDEX COLON (indexSheet= ( INT | STRINGA ) ) COMMA ROW COLON (rowMod= ( INT | STRINGA ) ) COMMA COL COLON (colMod= ( INT | STRINGA ) ) COMMA NEWVALUE COLON (valueCell= ( INT | STRINGA ) ) BACLOSE wsc
					{
					pushFollow(FOLLOW_wsc_in_modcell891);
					wsc();
					state._fsp--;

					match(input,BAOPEN,FOLLOW_BAOPEN_in_modcell893); 
					match(input,SHEETINDEX,FOLLOW_SHEETINDEX_in_modcell895); 
					match(input,COLON,FOLLOW_COLON_in_modcell897); 
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:253:31: (indexSheet= ( INT | STRINGA ) )
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:253:32: indexSheet= ( INT | STRINGA )
					{
					indexSheet=input.LT(1);
					if ( input.LA(1)==INT||input.LA(1)==STRINGA ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}

					match(input,COMMA,FOLLOW_COMMA_in_modcell913); 
					match(input,ROW,FOLLOW_ROW_in_modcell917); 
					match(input,COLON,FOLLOW_COLON_in_modcell919); 
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:254:12: (rowMod= ( INT | STRINGA ) )
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:254:13: rowMod= ( INT | STRINGA )
					{
					rowMod=input.LT(1);
					if ( input.LA(1)==INT||input.LA(1)==STRINGA ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}

					match(input,COMMA,FOLLOW_COMMA_in_modcell935); 
					match(input,COL,FOLLOW_COL_in_modcell937); 
					match(input,COLON,FOLLOW_COLON_in_modcell939); 
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:254:55: (colMod= ( INT | STRINGA ) )
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:254:57: colMod= ( INT | STRINGA )
					{
					colMod=input.LT(1);
					if ( input.LA(1)==INT||input.LA(1)==STRINGA ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}

					match(input,COMMA,FOLLOW_COMMA_in_modcell956); 
					match(input,NEWVALUE,FOLLOW_NEWVALUE_in_modcell960); 
					match(input,COLON,FOLLOW_COLON_in_modcell962); 
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:255:17: (valueCell= ( INT | STRINGA ) )
					// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:255:19: valueCell= ( INT | STRINGA )
					{
					valueCell=input.LT(1);
					if ( input.LA(1)==INT||input.LA(1)==STRINGA ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					cellModifyingClass ce = new cellModifyingClass(indexSheet,rowMod,colMod,valueCell); modifyCell.add(ce);
					}

					match(input,BACLOSE,FOLLOW_BACLOSE_in_modcell986); 
					pushFollow(FOLLOW_wsc_in_modcell988);
					wsc();
					state._fsp--;

					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return modifyCell;
	}
	// $ANTLR end "modcell"



	// $ANTLR start "scanerror"
	// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:260:1: scanerror : sc= SCAN_ERROR ;
	public final void scanerror() throws RecognitionException {
		Token sc=null;

		try {
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:262:2: (sc= SCAN_ERROR )
			// C:\\Users\\aless\\Desktop\\PROGETTO_LINGUAGGI_FORMALI_COMPILATORI\\Progetto_new\\src\\main\\java\\Grammar\\metaComvert\\metacomvert.g:263:2: sc= SCAN_ERROR
			{
			sc=(Token)match(input,SCAN_ERROR,FOLLOW_SCAN_ERROR_in_scanerror1016); 
			h.printError(sc);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "scanerror"

	// Delegated rules



	public static final BitSet FOLLOW_STARTDOC_in_language62 = new BitSet(new long[]{0x0000001041000200L});
	public static final BitSet FOLLOW_wsc_in_language64 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_body_in_language66 = new BitSet(new long[]{0x0000001001002200L});
	public static final BitSet FOLLOW_wsc_in_language68 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ENDDOC_in_language71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inpath_in_body98 = new BitSet(new long[]{0x0000001209000200L});
	public static final BitSet FOLLOW_wsc_in_body110 = new BitSet(new long[]{0x0000001209000200L});
	public static final BitSet FOLLOW_outpath_in_body125 = new BitSet(new long[]{0x0000001009000200L});
	public static final BitSet FOLLOW_wsc_in_body141 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_conversion_in_body156 = new BitSet(new long[]{0x0000001191000200L});
	public static final BitSet FOLLOW_wsc_in_body170 = new BitSet(new long[]{0x0000001191000200L});
	public static final BitSet FOLLOW_namesheet_in_body185 = new BitSet(new long[]{0x0000001091000200L});
	public static final BitSet FOLLOW_wsc_in_body198 = new BitSet(new long[]{0x0000001091000200L});
	public static final BitSet FOLLOW_delete_in_body206 = new BitSet(new long[]{0x0000001081000200L});
	public static final BitSet FOLLOW_wsc_in_body218 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_modifyingcell_in_body236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_wsc255 = new BitSet(new long[]{0x0000001001000202L});
	public static final BitSet FOLLOW_COMMENT_in_wsc259 = new BitSet(new long[]{0x0000001001000202L});
	public static final BitSet FOLLOW_scanerror_in_wsc262 = new BitSet(new long[]{0x0000001001000202L});
	public static final BitSet FOLLOW_STARTINPATH_in_inpath283 = new BitSet(new long[]{0x0000001001000220L});
	public static final BitSet FOLLOW_path_in_inpath290 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ENDINPATH_in_inpath295 = new BitSet(new long[]{0x0000001001000200L});
	public static final BitSet FOLLOW_wsc_in_inpath299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wsc_in_path322 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BAOPEN_in_path324 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_STRINGA_in_path331 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BACLOSE_in_path337 = new BitSet(new long[]{0x0000001001000200L});
	public static final BitSet FOLLOW_wsc_in_path340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STARTOUTPATH_in_outpath370 = new BitSet(new long[]{0x0000001001000220L});
	public static final BitSet FOLLOW_path_in_outpath376 = new BitSet(new long[]{0x0000001001020220L});
	public static final BitSet FOLLOW_ENDOUTPATH_in_outpath382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STARTCONVERSION_in_conversion408 = new BitSet(new long[]{0x0000001001000220L});
	public static final BitSet FOLLOW_wsc_in_conversion410 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_type_in_conversion418 = new BitSet(new long[]{0x0000001001000A00L});
	public static final BitSet FOLLOW_wsc_in_conversion422 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ENDCONVERSION_in_conversion424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STARTNAMESHEET_in_namesheet446 = new BitSet(new long[]{0x0000001001000220L});
	public static final BitSet FOLLOW_sheet_in_namesheet454 = new BitSet(new long[]{0x0000001001010200L});
	public static final BitSet FOLLOW_wsc_in_namesheet459 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ENDNAMESHEET_in_namesheet461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wsc_in_sheet490 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BAOPEN_in_sheet492 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_SHEETINDEX_in_sheet494 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_sheet496 = new BitSet(new long[]{0x0000000800100000L});
	public static final BitSet FOLLOW_set_in_sheet504 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMA_in_sheet515 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_NEWNAMESHEET_in_sheet517 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_sheet520 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_STRINGA_in_sheet530 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BACLOSE_in_sheet537 = new BitSet(new long[]{0x0000001001000220L});
	public static final BitSet FOLLOW_wsc_in_sheet539 = new BitSet(new long[]{0x0000001001000222L});
	public static final BitSet FOLLOW_BAOPEN_in_type569 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_STRINGA_in_type577 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BACLOSE_in_type583 = new BitSet(new long[]{0x0000001001000220L});
	public static final BitSet FOLLOW_wsc_in_type586 = new BitSet(new long[]{0x0000001001000220L});
	public static final BitSet FOLLOW_BAOPEN_in_type593 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_STRINGA_in_type602 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BACLOSE_in_type610 = new BitSet(new long[]{0x0000001001000220L});
	public static final BitSet FOLLOW_wsc_in_type615 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_BAOPEN_in_type620 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_STRINGA_in_type628 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BACLOSE_in_type634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STARTDELETE_in_delete656 = new BitSet(new long[]{0x0000001405001200L});
	public static final BitSet FOLLOW_wsc_in_delete658 = new BitSet(new long[]{0x0000001405001200L});
	public static final BitSet FOLLOW_row_in_delete666 = new BitSet(new long[]{0x0000001005001200L});
	public static final BitSet FOLLOW_wsc_in_delete671 = new BitSet(new long[]{0x0000001005001200L});
	public static final BitSet FOLLOW_col_in_delete678 = new BitSet(new long[]{0x0000001001001200L});
	public static final BitSet FOLLOW_wsc_in_delete682 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENDDELETE_in_delete684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STARTROW_in_row708 = new BitSet(new long[]{0x0000001001000220L});
	public static final BitSet FOLLOW_todelete_in_row715 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ENDROW_in_row719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STARTCOL_in_col740 = new BitSet(new long[]{0x0000001001000220L});
	public static final BitSet FOLLOW_todelete_in_col747 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ENDCOL_in_col751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wsc_in_todelete779 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BAOPEN_in_todelete781 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_SHEETINDEX_in_todelete783 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_todelete785 = new BitSet(new long[]{0x0000000800100000L});
	public static final BitSet FOLLOW_set_in_todelete792 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMA_in_todelete801 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_INDEXDELETE_in_todelete803 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_todelete805 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_INT_in_todelete814 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BACLOSE_in_todelete820 = new BitSet(new long[]{0x0000001001000220L});
	public static final BitSet FOLLOW_wsc_in_todelete822 = new BitSet(new long[]{0x0000001001000222L});
	public static final BitSet FOLLOW_STARTMODIFYINGCELL_in_modifyingcell852 = new BitSet(new long[]{0x0000001001000220L});
	public static final BitSet FOLLOW_modcell_in_modifyingcell859 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ENDMODIFYINGCELL_in_modifyingcell863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wsc_in_modcell891 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BAOPEN_in_modcell893 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_SHEETINDEX_in_modcell895 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_modcell897 = new BitSet(new long[]{0x0000000800100000L});
	public static final BitSet FOLLOW_set_in_modcell904 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMA_in_modcell913 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ROW_in_modcell917 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_modcell919 = new BitSet(new long[]{0x0000000800100000L});
	public static final BitSet FOLLOW_set_in_modcell926 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMA_in_modcell935 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COL_in_modcell937 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_modcell939 = new BitSet(new long[]{0x0000000800100000L});
	public static final BitSet FOLLOW_set_in_modcell947 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COMMA_in_modcell956 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_NEWVALUE_in_modcell960 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COLON_in_modcell962 = new BitSet(new long[]{0x0000000800100000L});
	public static final BitSet FOLLOW_set_in_modcell970 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BACLOSE_in_modcell986 = new BitSet(new long[]{0x0000001001000220L});
	public static final BitSet FOLLOW_wsc_in_modcell988 = new BitSet(new long[]{0x0000001001000222L});
	public static final BitSet FOLLOW_SCAN_ERROR_in_scanerror1016 = new BitSet(new long[]{0x0000000000000002L});
}
