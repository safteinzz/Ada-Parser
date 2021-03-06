// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: AdaParser.l

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class Yylex {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\1\7\0"+
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\12\15\1\16\1\17\1\20\1\21\1\20\2\0\5\22"+
    "\1\23\2\22\1\24\21\22\4\0\1\22\1\0\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\2\22\1\36\1\22\1\37\1\40\1\41\1\22\1\42"+
    "\1\43\1\44\1\45\1\22\1\46\3\22\12\0\1\3"+
    "\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\1\1\13\1\14\1\15\1\16"+
    "\1\17\13\20\1\0\1\21\1\22\1\0\1\23\6\20"+
    "\1\24\1\25\1\26\4\20\1\0\1\27\4\20\1\30"+
    "\1\31\4\20\1\14\1\0\1\27\3\20\1\32\2\20"+
    "\1\33\1\20\1\0\1\34\1\20\1\35\1\20\1\27"+
    "\1\0\4\20\1\36";

  private static int [] zzUnpackAction() {
    int [] result = new int[81];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\116\0\165\0\47\0\234\0\47\0\47"+
    "\0\47\0\47\0\303\0\352\0\u0111\0\u0138\0\u015f\0\47"+
    "\0\47\0\u0186\0\u01ad\0\u01d4\0\u01fb\0\u0222\0\u0249\0\u0270"+
    "\0\u0297\0\u02be\0\u02e5\0\u030c\0\u0333\0\u035a\0\47\0\u0381"+
    "\0\47\0\u03a8\0\u03cf\0\u03f6\0\u041d\0\u0444\0\u046b\0\u0186"+
    "\0\u0186\0\u0186\0\u0492\0\u04b9\0\u04e0\0\u0507\0\u052e\0\u0555"+
    "\0\u057c\0\u05a3\0\u05ca\0\u05f1\0\u0186\0\u0186\0\u0618\0\u063f"+
    "\0\u0666\0\u068d\0\47\0\u06b4\0\u06db\0\u0702\0\u0729\0\u0750"+
    "\0\u0186\0\u0777\0\u079e\0\u0186\0\u07c5\0\u07ec\0\u0186\0\u0813"+
    "\0\u0186\0\u083a\0\47\0\u0861\0\u0888\0\u08af\0\u08d6\0\u08fd"+
    "\0\u0186";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[81];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\3\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\2\21\1\22\1\23\1\24\1\22\1\25\2\22\1\26"+
    "\1\27\2\22\1\30\1\31\2\22\1\32\2\22\1\33"+
    "\1\22\1\34\50\0\1\3\2\0\1\3\44\0\1\4"+
    "\56\0\1\35\46\0\1\36\47\0\1\37\47\0\1\36"+
    "\4\0\1\21\40\0\1\40\1\0\1\16\52\0\1\41"+
    "\42\0\1\22\4\0\25\22\15\0\1\22\4\0\14\22"+
    "\1\42\10\22\15\0\1\22\4\0\15\22\1\43\7\22"+
    "\15\0\1\22\4\0\7\22\1\44\15\22\15\0\1\22"+
    "\4\0\14\22\1\45\1\46\7\22\15\0\1\22\4\0"+
    "\16\22\1\47\6\22\15\0\1\22\4\0\10\22\1\50"+
    "\4\22\1\51\3\22\1\52\3\22\15\0\1\22\4\0"+
    "\16\22\1\53\6\22\15\0\1\22\4\0\20\22\1\54"+
    "\4\22\15\0\1\22\4\0\12\22\1\55\12\22\15\0"+
    "\1\22\4\0\12\22\1\56\12\22\15\0\1\57\31\0"+
    "\2\36\3\0\42\36\15\0\1\60\46\0\1\22\4\0"+
    "\16\22\1\61\6\22\15\0\1\22\4\0\22\22\1\62"+
    "\2\22\15\0\1\22\4\0\11\22\1\63\13\22\15\0"+
    "\1\22\4\0\21\22\1\64\3\22\15\0\1\22\4\0"+
    "\6\22\1\65\16\22\15\0\1\22\4\0\20\22\1\66"+
    "\4\22\15\0\1\22\4\0\16\22\1\67\6\22\15\0"+
    "\1\22\4\0\16\22\1\70\6\22\15\0\1\22\4\0"+
    "\7\22\1\71\15\22\15\0\1\22\4\0\13\22\1\72"+
    "\11\22\6\0\1\73\4\0\1\74\1\0\1\57\46\0"+
    "\1\75\46\0\1\22\4\0\3\22\1\76\21\22\15\0"+
    "\1\22\4\0\7\22\1\77\15\22\15\0\1\22\4\0"+
    "\13\22\1\100\11\22\15\0\1\22\4\0\7\22\1\101"+
    "\3\22\1\102\11\22\15\0\1\22\4\0\17\22\1\66"+
    "\5\22\15\0\1\22\4\0\5\22\1\103\17\22\15\0"+
    "\1\22\4\0\15\22\1\104\7\22\15\0\1\22\4\0"+
    "\14\22\1\105\10\22\15\0\1\106\44\0\1\40\1\0"+
    "\1\75\46\0\1\22\4\0\22\22\1\107\2\22\15\0"+
    "\1\22\4\0\11\22\1\110\13\22\15\0\1\22\4\0"+
    "\15\22\1\111\7\22\15\0\1\22\4\0\10\22\1\50"+
    "\14\22\15\0\1\22\4\0\7\22\1\112\15\22\15\0"+
    "\1\22\4\0\7\22\1\66\15\22\6\0\1\113\6\0"+
    "\1\114\46\0\1\22\4\0\7\22\1\115\15\22\15\0"+
    "\1\22\4\0\6\22\1\116\16\22\6\0\1\113\4\0"+
    "\1\74\1\0\1\114\46\0\1\22\4\0\20\22\1\107"+
    "\4\22\15\0\1\22\4\0\23\22\1\117\1\22\15\0"+
    "\1\22\4\0\20\22\1\120\4\22\15\0\1\22\4\0"+
    "\7\22\1\121\15\22";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2340];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\1\1\4\11\5\1\2\11"+
    "\13\1\1\0\1\1\1\11\1\0\1\11\15\1\1\0"+
    "\13\1\1\11\1\0\11\1\1\0\4\1\1\11\1\0"+
    "\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[81];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
	File salida = new File("..\\salida.txt");
	File gramatica = new File("..\\gramatica.txt");
	
	
    public void impresorGuardador(int linea, int columna, String inp, String tipo)
	{
		String output = null;
		String gramma = tipo + " ";		
		try {
            FileWriter fr1 = new FileWriter(gramatica, true);
			if (tipo == "Linea") gramma += "\n";
			fr1.write(gramma);
			fr1.close();
        } catch (IOException ex) {}
		
		if(tipo != "Linea"){
			output = "[token en Linea:" + linea + " Posicion:" + columna + " = \"" + inp + "\"] Es un " + tipo;	
			System.out.println(output);
			output += "\n";
			try {
				FileWriter fr2 = new FileWriter(salida, true);
				fr2.write(output);
				fr2.close();
			} catch (IOException ex) {}
		}		
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return AdaParserLexer.UNKNOWN_TOKEN;
            }
            // fall through
          case 31: break;
          case 2:
            { /*ignore*/
            }
            // fall through
          case 32: break;
          case 3:
            { impresorGuardador(yyline, yycolumn, yytext(), "Linea"); return AdaParserLexer.linea;
            }
            // fall through
          case 33: break;
          case 4:
            { System.out.print(yytext());
            }
            // fall through
          case 34: break;
          case 5:
            { impresorGuardador(yyline, yycolumn, yytext(), "Abre parentesis"); return AdaParserLexer.abreparentesis;
            }
            // fall through
          case 35: break;
          case 6:
            { impresorGuardador(yyline, yycolumn, yytext(), "Cierraparentesis"); return AdaParserLexer.cierraparentesis;
            }
            // fall through
          case 36: break;
          case 7:
            { impresorGuardador(yyline, yycolumn, yytext(), "Multiplicacion"); return AdaParserLexer.multiplicacion;
            }
            // fall through
          case 37: break;
          case 8:
            { impresorGuardador(yyline, yycolumn, yytext(), "Suma"); return AdaParserLexer.suma;
            }
            // fall through
          case 38: break;
          case 9:
            { impresorGuardador(yyline, yycolumn, yytext(), "Coma"); return AdaParserLexer.coma;
            }
            // fall through
          case 39: break;
          case 10:
            { impresorGuardador(yyline, yycolumn, yytext(), "Resta"); return AdaParserLexer.resta;
            }
            // fall through
          case 40: break;
          case 11:
            { impresorGuardador(yyline, yycolumn, yytext(), "Division"); return AdaParserLexer.division;
            }
            // fall through
          case 41: break;
          case 12:
            { impresorGuardador(yyline, yycolumn, yytext(), "Entero"); return AdaParserLexer.entero;
            }
            // fall through
          case 42: break;
          case 13:
            { impresorGuardador(yyline, yycolumn, yytext(), "Dos puntos"); return AdaParserLexer.dospuntos;
            }
            // fall through
          case 43: break;
          case 14:
            { impresorGuardador(yyline, yycolumn, yytext(), "Final de sentencia"); return AdaParserLexer.finaldesentencia;
            }
            // fall through
          case 44: break;
          case 15:
            { impresorGuardador(yyline, yycolumn, yytext(), "Operador racional"); return AdaParserLexer.operadorracional;
            }
            // fall through
          case 45: break;
          case 16:
            { impresorGuardador(yyline, yycolumn, yytext(), "identificador"); return AdaParserLexer.identificador;
            }
            // fall through
          case 46: break;
          case 17:
            { impresorGuardador(yyline, yycolumn, yytext(), "Comentario"); return AdaParserLexer.comentario;
            }
            // fall through
          case 47: break;
          case 18:
            { impresorGuardador(yyline, yycolumn, yytext(), "Operador de rango"); return AdaParserLexer.operadorrango;
            }
            // fall through
          case 48: break;
          case 19:
            { impresorGuardador(yyline, yycolumn, yytext(), "Asignacion"); return AdaParserLexer.asignacion;
            }
            // fall through
          case 49: break;
          case 20:
            { impresorGuardador(yyline, yycolumn, yytext(), "Operador logico"); return AdaParserLexer.operadorlogico;
            }
            // fall through
          case 50: break;
          case 21:
            { impresorGuardador(yyline, yycolumn, yytext(), "Iterador"); return AdaParserLexer.iterador;
            }
            // fall through
          case 51: break;
          case 22:
            { impresorGuardador(yyline, yycolumn, yytext(), "Declarador"); return AdaParserLexer.declarador;
            }
            // fall through
          case 52: break;
          case 23:
            { impresorGuardador(yyline, yycolumn, yytext(), "Real"); return AdaParserLexer.real;
            }
            // fall through
          case 53: break;
          case 24:
            { impresorGuardador(yyline, yycolumn, yytext(), "Delimitador"); return AdaParserLexer.delimitador;
            }
            // fall through
          case 54: break;
          case 25:
            { impresorGuardador(yyline, yycolumn, yytext(), "Bucle"); return AdaParserLexer.bucle;
            }
            // fall through
          case 55: break;
          case 26:
            { impresorGuardador(yyline, yycolumn, yytext(), "Final de operador logico"); return AdaParserLexer.finaloperadorlogico;
            }
            // fall through
          case 56: break;
          case 27:
            { impresorGuardador(yyline, yycolumn, yytext(), "Inicio de operador logico"); return AdaParserLexer.iniciooperadorlogico;
            }
            // fall through
          case 57: break;
          case 28:
            { impresorGuardador(yyline, yycolumn, yytext(), "Tipo"); return AdaParserLexer.tipo;
            }
            // fall through
          case 58: break;
          case 29:
            { impresorGuardador(yyline, yycolumn, yytext(), "Inicio de bloque"); return AdaParserLexer.iniciobloque;
            }
            // fall through
          case 59: break;
          case 30:
            { impresorGuardador(yyline, yycolumn, yytext(), "Metodo"); return AdaParserLexer.metodo;
            }
            // fall through
          case 60: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java Yylex [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Yylex scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Yylex(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
