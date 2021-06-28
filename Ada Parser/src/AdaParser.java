/* A Bison parser, made by GNU Bison 3.7.4.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java

   Copyright (C) 2007-2015, 2018-2020 Free Software Foundation, Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* DO NOT RELY ON FEATURES THAT ARE NOT DOCUMENTED in the manual,
   especially those whose name start with YY_ or yy_.  They are
   private implementation details that can be changed or removed.  */




import java.text.MessageFormat;
/* "%code imports" blocks.  */
/* "AdaParser.y":6  */

  import java.io.InputStream;
  import java.io.InputStreamReader;
  import java.io.Reader;
  import java.io.IOException;

/* "AdaParser.java":50  */

/**
 * A Bison parser, automatically generated from <tt>AdaParser.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
public class AdaParser
{
  /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "3.7.4";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";



  /**
   * True if verbose error messages are enabled.
   */
  private boolean yyErrorVerbose = true;

  /**
   * Whether verbose error messages are enabled.
   */
  public final boolean getErrorVerbose() { return yyErrorVerbose; }

  /**
   * Set the verbosity of error messages.
   * @param verbose True to request verbose error messages.
   */
  public final void setErrorVerbose(boolean verbose)
  { yyErrorVerbose = verbose; }




  public enum SymbolKind
  {
    S_YYEOF(0),                    /* "end of file"  */
    S_YYerror(1),                  /* error  */
    S_YYUNDEF(2),                  /* "invalid token"  */
    S_linea(3),                    /* linea  */
    S_comentario(4),               /* comentario  */
    S_finaldesentencia(5),         /* finaldesentencia  */
    S_coma(6),                     /* coma  */
    S_asignacion(7),               /* asignacion  */
    S_dospuntos(8),                /* dospuntos  */
    S_suma(9),                     /* suma  */
    S_resta(10),                   /* resta  */
    S_multiplicacion(11),          /* multiplicacion  */
    S_division(12),                /* division  */
    S_abreparentesis(13),          /* abreparentesis  */
    S_cierraparentesis(14),        /* cierraparentesis  */
    S_tipo(15),                    /* tipo  */
    S_identificador(16),           /* identificador  */
    S_entero(17),                  /* entero  */
    S_real(18),                    /* real  */
    S_metodo(19),                  /* metodo  */
    S_declarador(20),              /* declarador  */
    S_operadorrango(21),           /* operadorrango  */
    S_operadorracional(22),        /* operadorracional  */
    S_operadorlogico(23),          /* operadorlogico  */
    S_iniciooperadorlogico(24),    /* iniciooperadorlogico  */
    S_finaloperadorlogico(25),     /* finaloperadorlogico  */
    S_iterador(26),                /* iterador  */
    S_iniciobloque(27),            /* iniciobloque  */
    S_delimitador(28),             /* delimitador  */
    S_bucle(29),                   /* bucle  */
    S_UNKNOWN_TOKEN(30),           /* UNKNOWN_TOKEN  */
    S_YYACCEPT(31),                /* $accept  */
    S_prog(32),                    /* prog  */
    S_OUTSIDEFUNC(33),             /* OUTSIDEFUNC  */
    S_INSIDEFUNC(34),              /* INSIDEFUNC  */
    S_MULTIDECLAR(35),             /* MULTIDECLAR  */
    S_POSASIG(36),                 /* POSASIG  */
    S_MULTIASIG(37),               /* MULTIASIG  */
    S_AFTERBEGIN(38),              /* AFTERBEGIN  */
    S_OVER(39),                    /* OVER  */
    S_COMP(40),                    /* COMP  */
    S_FIXTHEN(41),                 /* FIXTHEN  */
    S_REP(42),                     /* REP  */
    S_REPE(43),                    /* REPE  */
    S_LIMITPOS(44),                /* LIMITPOS  */
    S_OPERACION(45),               /* OPERACION  */
    S_PRIO(46),                    /* PRIO  */
    S_MULTIDIVI(47),               /* MULTIDIVI  */
    S_SUMARESTA(48),               /* SUMARESTA  */
    S_OPPRI(49),                   /* OPPRI  */
    S_OPSEC(50),                   /* OPSEC  */
    S_VAL(51),                     /* VAL  */
    S_NUMERO(52);                  /* NUMERO  */


    private final int yycode_;

    SymbolKind (int n) {
      this.yycode_ = n;
    }

    private static final SymbolKind[] values_ = {
      SymbolKind.S_YYEOF,
      SymbolKind.S_YYerror,
      SymbolKind.S_YYUNDEF,
      SymbolKind.S_linea,
      SymbolKind.S_comentario,
      SymbolKind.S_finaldesentencia,
      SymbolKind.S_coma,
      SymbolKind.S_asignacion,
      SymbolKind.S_dospuntos,
      SymbolKind.S_suma,
      SymbolKind.S_resta,
      SymbolKind.S_multiplicacion,
      SymbolKind.S_division,
      SymbolKind.S_abreparentesis,
      SymbolKind.S_cierraparentesis,
      SymbolKind.S_tipo,
      SymbolKind.S_identificador,
      SymbolKind.S_entero,
      SymbolKind.S_real,
      SymbolKind.S_metodo,
      SymbolKind.S_declarador,
      SymbolKind.S_operadorrango,
      SymbolKind.S_operadorracional,
      SymbolKind.S_operadorlogico,
      SymbolKind.S_iniciooperadorlogico,
      SymbolKind.S_finaloperadorlogico,
      SymbolKind.S_iterador,
      SymbolKind.S_iniciobloque,
      SymbolKind.S_delimitador,
      SymbolKind.S_bucle,
      SymbolKind.S_UNKNOWN_TOKEN,
      SymbolKind.S_YYACCEPT,
      SymbolKind.S_prog,
      SymbolKind.S_OUTSIDEFUNC,
      SymbolKind.S_INSIDEFUNC,
      SymbolKind.S_MULTIDECLAR,
      SymbolKind.S_POSASIG,
      SymbolKind.S_MULTIASIG,
      SymbolKind.S_AFTERBEGIN,
      SymbolKind.S_OVER,
      SymbolKind.S_COMP,
      SymbolKind.S_FIXTHEN,
      SymbolKind.S_REP,
      SymbolKind.S_REPE,
      SymbolKind.S_LIMITPOS,
      SymbolKind.S_OPERACION,
      SymbolKind.S_PRIO,
      SymbolKind.S_MULTIDIVI,
      SymbolKind.S_SUMARESTA,
      SymbolKind.S_OPPRI,
      SymbolKind.S_OPSEC,
      SymbolKind.S_VAL,
      SymbolKind.S_NUMERO
    };

    static final SymbolKind get(int code) {
      return values_[code];
    }

    public final int getCode() {
      return this.yycode_;
    }

    /* Return YYSTR after stripping away unnecessary quotes and
       backslashes, so that it's suitable for yyerror.  The heuristic is
       that double-quoting is unnecessary unless the string contains an
       apostrophe, a comma, or backslash (other than backslash-backslash).
       YYSTR is taken from yytname.  */
    private static String yytnamerr_(String yystr)
    {
      if (yystr.charAt (0) == '"')
        {
          StringBuffer yyr = new StringBuffer();
          strip_quotes: for (int i = 1; i < yystr.length(); i++)
            switch (yystr.charAt(i))
              {
              case '\'':
              case ',':
                break strip_quotes;

              case '\\':
                if (yystr.charAt(++i) != '\\')
                  break strip_quotes;
                /* Fall through.  */
              default:
                yyr.append(yystr.charAt(i));
                break;

              case '"':
                return yyr.toString();
              }
        }
      return yystr;
    }

    /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
       First, the terminals, then, starting at \a YYNTOKENS_, nonterminals.  */
    private static final String[] yytname_ = yytname_init();
  private static final String[] yytname_init()
  {
    return new String[]
    {
  "\"end of file\"", "error", "\"invalid token\"", "linea", "comentario",
  "finaldesentencia", "coma", "asignacion", "dospuntos", "suma", "resta",
  "multiplicacion", "division", "abreparentesis", "cierraparentesis",
  "tipo", "identificador", "entero", "real", "metodo", "declarador",
  "operadorrango", "operadorracional", "operadorlogico",
  "iniciooperadorlogico", "finaloperadorlogico", "iterador",
  "iniciobloque", "delimitador", "bucle", "UNKNOWN_TOKEN", "$accept",
  "prog", "OUTSIDEFUNC", "INSIDEFUNC", "MULTIDECLAR", "POSASIG",
  "MULTIASIG", "AFTERBEGIN", "OVER", "COMP", "FIXTHEN", "REP", "REPE",
  "LIMITPOS", "OPERACION", "PRIO", "MULTIDIVI", "SUMARESTA", "OPPRI",
  "OPSEC", "VAL", "NUMERO", null
    };
  }

    /* The user-facing name of this symbol.  */
    public final String getName() {
      return yytnamerr_(yytname_[yycode_]);
    }

  };


  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>AdaParser</tt>.
   */
  public interface Lexer {
    /* Token kinds.  */
    /** Token "end of file", to be returned by the scanner.  */
    static final int YYEOF = 0;
    /** Token error, to be returned by the scanner.  */
    static final int YYerror = 256;
    /** Token "invalid token", to be returned by the scanner.  */
    static final int YYUNDEF = 257;
    /** Token linea, to be returned by the scanner.  */
    static final int linea = 258;
    /** Token comentario, to be returned by the scanner.  */
    static final int comentario = 259;
    /** Token finaldesentencia, to be returned by the scanner.  */
    static final int finaldesentencia = 260;
    /** Token coma, to be returned by the scanner.  */
    static final int coma = 261;
    /** Token asignacion, to be returned by the scanner.  */
    static final int asignacion = 262;
    /** Token dospuntos, to be returned by the scanner.  */
    static final int dospuntos = 263;
    /** Token suma, to be returned by the scanner.  */
    static final int suma = 264;
    /** Token resta, to be returned by the scanner.  */
    static final int resta = 265;
    /** Token multiplicacion, to be returned by the scanner.  */
    static final int multiplicacion = 266;
    /** Token division, to be returned by the scanner.  */
    static final int division = 267;
    /** Token abreparentesis, to be returned by the scanner.  */
    static final int abreparentesis = 268;
    /** Token cierraparentesis, to be returned by the scanner.  */
    static final int cierraparentesis = 269;
    /** Token tipo, to be returned by the scanner.  */
    static final int tipo = 270;
    /** Token identificador, to be returned by the scanner.  */
    static final int identificador = 271;
    /** Token entero, to be returned by the scanner.  */
    static final int entero = 272;
    /** Token real, to be returned by the scanner.  */
    static final int real = 273;
    /** Token metodo, to be returned by the scanner.  */
    static final int metodo = 274;
    /** Token declarador, to be returned by the scanner.  */
    static final int declarador = 275;
    /** Token operadorrango, to be returned by the scanner.  */
    static final int operadorrango = 276;
    /** Token operadorracional, to be returned by the scanner.  */
    static final int operadorracional = 277;
    /** Token operadorlogico, to be returned by the scanner.  */
    static final int operadorlogico = 278;
    /** Token iniciooperadorlogico, to be returned by the scanner.  */
    static final int iniciooperadorlogico = 279;
    /** Token finaloperadorlogico, to be returned by the scanner.  */
    static final int finaloperadorlogico = 280;
    /** Token iterador, to be returned by the scanner.  */
    static final int iterador = 281;
    /** Token iniciobloque, to be returned by the scanner.  */
    static final int iniciobloque = 282;
    /** Token delimitador, to be returned by the scanner.  */
    static final int delimitador = 283;
    /** Token bucle, to be returned by the scanner.  */
    static final int bucle = 284;
    /** Token UNKNOWN_TOKEN, to be returned by the scanner.  */
    static final int UNKNOWN_TOKEN = 285;

    /** Deprecated, use YYEOF instead.  */
    public static final int EOF = YYEOF;


    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.
     */
    Object getLVal();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token.
     */
    int yylex() throws java.io.IOException;

    /**
     * Emit an errorin a user-defined way.
     *
     *
     * @param msg The string for the error message.
     */
     void yyerror(String msg);


  }


  /**
   * The object doing lexical analysis for us.
   */
  private Lexer yylexer;





  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public AdaParser (Lexer yylexer)
  {

    this.yylexer = yylexer;

  }



  private int yynerrs = 0;

  /**
   * The number of syntax errors so far.
   */
  public final int getNumberOfErrors () { return yynerrs; }

  /**
   * Print an error message via the lexer.
   *
   * @param msg The error message.
   */
  public final void yyerror(String msg) {
      yylexer.yyerror(msg);
  }



  private final class YYStack {
    private int[] stateStack = new int[16];
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value) {
      height++;
      if (size == height)
        {
          int[] newStateStack = new int[size * 2];
          System.arraycopy (stateStack, 0, newStateStack, 0, height);
          stateStack = newStateStack;

          Object[] newValueStack = new Object[size * 2];
          System.arraycopy (valueStack, 0, newValueStack, 0, height);
          valueStack = newValueStack;

          size *= 2;
        }

      stateStack[height] = state;
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (0 < num) {
        java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out) {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
          out.print (' ');
          out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).
   */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).
   */
  public static final int YYABORT = 1;



  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.
   */
  public static final int YYERROR = 2;

  /**
   * Internal return codes that are not supported for user semantic
   * actions.
   */
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;


  private int yyerrstatus_ = 0;


  /**
   * Whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.
   */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  /** Compute post-reduction state.
   * @param yystate   the current state
   * @param yysym     the nonterminal to push on the stack
   */
  private int yyLRGotoState (int yystate, int yysym)
  {
    int yyr = yypgoto_[yysym - YYNTOKENS_] + yystate;
    if (0 <= yyr && yyr <= YYLAST_ && yycheck_[yyr] == yystate)
      return yytable_[yyr];
    else
      return yydefgoto_[yysym - YYNTOKENS_];
  }

  private int yyaction(int yyn, YYStack yystack, int yylen)
  {
    /* If YYLEN is nonzero, implement the default value of the action:
       '$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    Object yyval = (0 < yylen) ? yystack.valueAt(yylen - 1) : yystack.valueAt(0);

    switch (yyn)
      {
        
/* "AdaParser.java":544  */

        default: break;
      }

    yystack.pop(yylen);
    yylen = 0;
    /* Shift the result of the reduction.  */
    int yystate = yyLRGotoState(yystack.stateAt(0), yyr1_[yyn]);
    yystack.push(yystate, yyval);
    return YYNEWSTATE;
  }




  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse() throws java.io.IOException

  {


    /* Lookahead token kind.  */
    int yychar = YYEMPTY_;
    /* Lookahead symbol kind.  */
    SymbolKind yytoken = null;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;
    YYStack yystack = new YYStack ();
    int label = YYNEWSTATE;



    /* Semantic value of the lookahead.  */
    Object yylval = null;

    yyerrstatus_ = 0;
    yynerrs = 0;

    /* Initialize the stack.  */
    yystack.push (yystate, yylval);



    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
           pushed when we come here.  */
      case YYNEWSTATE:

        /* Accept?  */
        if (yystate == YYFINAL_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yyPactValueIsDefault (yyn))
          {
            label = YYDEFAULT;
            break;
          }

        /* Read a lookahead token.  */
        if (yychar == YYEMPTY_)
          {

            yychar = yylexer.yylex ();
            yylval = yylexer.getLVal();

          }

        /* Convert token to internal form.  */
        yytoken = yytranslate_ (yychar);

        if (yytoken == SymbolKind.S_YYerror)
          {
            // The scanner already issued an error message, process directly
            // to error recovery.  But do not keep the error token as
            // lookahead, it is too special and may lead us to an endless
            // loop in error recovery. */
            yychar = Lexer.YYUNDEF;
            yytoken = SymbolKind.S_YYUNDEF;
            label = YYERRLAB1;
          }
        else
          {
            /* If the proper action on seeing token YYTOKEN is to reduce or to
               detect an error, take that action.  */
            yyn += yytoken.getCode();
            if (yyn < 0 || YYLAST_ < yyn || yycheck_[yyn] != yytoken.getCode())
              label = YYDEFAULT;

            /* <= 0 means reduce or error.  */
            else if ((yyn = yytable_[yyn]) <= 0)
              {
                if (yyTableValueIsError (yyn))
                  label = YYERRLAB;
                else
                  {
                    yyn = -yyn;
                    label = YYREDUCE;
                  }
              }

            else
              {
                /* Shift the lookahead token.  */
                /* Discard the token being shifted.  */
                yychar = YYEMPTY_;

                /* Count tokens shifted since error; after three, turn off error
                   status.  */
                if (yyerrstatus_ > 0)
                  --yyerrstatus_;

                yystate = yyn;
                yystack.push (yystate, yylval);
                label = YYNEWSTATE;
              }
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction(yyn, yystack, yylen);
        yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs;
            if (yychar == YYEMPTY_)
              yytoken = null;
            yyreportSyntaxError (new Context (yystack, yytoken));
          }

        if (yyerrstatus_ == 3)
          {
            /* If just tried and failed to reuse lookahead token after an
               error, discard it.  */

            if (yychar <= Lexer.YYEOF)
              {
                /* Return failure if at end of input.  */
                if (yychar == Lexer.YYEOF)
                  return false;
              }
            else
              yychar = YYEMPTY_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `-------------------------------------------------*/
      case YYERROR:
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;       /* Each real token shifted decrements this.  */

        // Pop stack until we find a state that shifts the error token.
        for (;;)
          {
            yyn = yypact_[yystate];
            if (!yyPactValueIsDefault (yyn))
              {
                yyn += SymbolKind.S_YYerror.getCode();
                if (0 <= yyn && yyn <= YYLAST_
                    && yycheck_[yyn] == SymbolKind.S_YYerror.getCode())
                  {
                    yyn = yytable_[yyn];
                    if (0 < yyn)
                      break;
                  }
              }

            /* Pop the current state because it cannot handle the
             * error token.  */
            if (yystack.height == 0)
              return false;


            yystack.pop ();
            yystate = yystack.stateAt (0);
          }

        if (label == YYABORT)
          /* Leave the switch.  */
          break;



        /* Shift the error token.  */

        yystate = yyn;
        yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
}




  /**
   * Information needed to get the list of expected tokens and to forge
   * a syntax error diagnostic.
   */
  public static final class Context
  {
    Context (YYStack stack, SymbolKind token)
    {
      yystack = stack;
      yytoken = token;
    }

    private YYStack yystack;


    /**
     * The symbol kind of the lookahead token.
     */
    public final SymbolKind getToken ()
    {
      return yytoken;
    }

    private SymbolKind yytoken;
    static final int NTOKENS = AdaParser.YYNTOKENS_;

    /**
     * Put in YYARG at most YYARGN of the expected tokens given the
     * current YYCTX, and return the number of tokens stored in YYARG.  If
     * YYARG is null, return the number of expected tokens (guaranteed to
     * be less than YYNTOKENS).
     */
    int getExpectedTokens (SymbolKind yyarg[], int yyargn)
    {
      return getExpectedTokens (yyarg, 0, yyargn);
    }

    int getExpectedTokens (SymbolKind yyarg[], int yyoffset, int yyargn)
    {
      int yycount = yyoffset;
      int yyn = yypact_[this.yystack.stateAt (0)];
      if (!yyPactValueIsDefault (yyn))
        {
          /* Start YYX at -YYN if negative to avoid negative
             indexes in YYCHECK.  In other words, skip the first
             -YYN actions for this state because they are default
             actions.  */
          int yyxbegin = yyn < 0 ? -yyn : 0;
          /* Stay within bounds of both yycheck and yytname.  */
          int yychecklim = YYLAST_ - yyn + 1;
          int yyxend = yychecklim < NTOKENS ? yychecklim : NTOKENS;
          for (int yyx = yyxbegin; yyx < yyxend; ++yyx)
            if (yycheck_[yyx + yyn] == yyx && yyx != SymbolKind.S_YYerror.getCode()
                && !yyTableValueIsError(yytable_[yyx + yyn]))
              {
                if (yyarg == null)
                  yycount += 1;
                else if (yycount == yyargn)
                  return 0; // FIXME: this is incorrect.
                else
                  yyarg[yycount++] = SymbolKind.get(yyx);
              }
        }
      if (yyarg != null && yycount == yyoffset && yyoffset < yyargn)
        yyarg[yycount] = null;
      return yycount - yyoffset;
    }
  }


  private int yysyntaxErrorArguments (Context yyctx, SymbolKind[] yyarg, int yyargn)
  {
    /* There are many possibilities here to consider:
       - If this state is a consistent state with a default action,
         then the only way this function was invoked is if the
         default action is an error action.  In that case, don't
         check for expected tokens because there are none.
       - The only way there can be no lookahead present (in tok) is
         if this state is a consistent state with a default action.
         Thus, detecting the absence of a lookahead is sufficient to
         determine that there is no unexpected or expected token to
         report.  In that case, just report a simple "syntax error".
       - Don't assume there isn't a lookahead just because this
         state is a consistent state with a default action.  There
         might have been a previous inconsistent state, consistent
         state with a non-default action, or user semantic action
         that manipulated yychar.  (However, yychar is currently out
         of scope during semantic actions.)
       - Of course, the expected token list depends on states to
         have correct lookahead information, and it depends on the
         parser not to perform extra reductions after fetching a
         lookahead from the scanner and before detecting a syntax
         error.  Thus, state merging (from LALR or IELR) and default
         reductions corrupt the expected token list.  However, the
         list is correct for canonical LR with one exception: it
         will still contain any token that will not be accepted due
         to an error action in a later state.
    */
    int yycount = 0;
    if (yyctx.getToken() != null)
      {
        if (yyarg != null)
          yyarg[yycount] = yyctx.getToken();
        yycount += 1;
        yycount += yyctx.getExpectedTokens(yyarg, 1, yyargn);
      }
    return yycount;
  }


  /**
   * Build and emit a "syntax error" message in a user-defined way.
   *
   * @param ctx  The context of the error.
   */
  private void yyreportSyntaxError(Context yyctx) {
      if (yyErrorVerbose) {
          final int argmax = 5;
          SymbolKind[] yyarg = new SymbolKind[argmax];
          int yycount = yysyntaxErrorArguments(yyctx, yyarg, argmax);
          String[] yystr = new String[yycount];
          for (int yyi = 0; yyi < yycount; ++yyi) {
              yystr[yyi] = yyarg[yyi].getName();
          }
          String yyformat;
          switch (yycount) {
              default:
              case 0: yyformat = "syntax error"; break;
              case 1: yyformat = "syntax error, unexpected {0}"; break;
              case 2: yyformat = "syntax error, unexpected {0}, expecting {1}"; break;
              case 3: yyformat = "syntax error, unexpected {0}, expecting {1} or {2}"; break;
              case 4: yyformat = "syntax error, unexpected {0}, expecting {1} or {2} or {3}"; break;
              case 5: yyformat = "syntax error, unexpected {0}, expecting {1} or {2} or {3} or {4}"; break;
          }
          yyerror(new MessageFormat(yyformat).format(yystr));
      } else {
          yyerror("syntax error");
      }
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yyPactValueIsDefault (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code>
   * value indicates a syntax error.
   * @param yyvalue the value to check
   */
  private static boolean yyTableValueIsError (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  private static final byte yypact_ninf_ = -40;
  private static final byte yytable_ninf_ = -1;

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final byte[] yypact_ = yypact_init();
  private static final byte[] yypact_init()
  {
    return new byte[]
    {
       6,     6,     6,   -13,     5,   -40,   -40,   -40,   -12,   -40,
      13,    14,    14,    14,     7,    26,     6,   -40,   -40,    31,
      37,    16,    34,     8,   -40,    46,    37,   -40,   -40,   -40,
     -40,    29,    49,   -40,    53,    47,     8,    61,    59,    37,
      66,    67,    28,    37,   -40,   -40,    57,   -40,   -40,   -40,
      37,   -40,   -40,   -40,    37,    14,    65,   -40,     8,    37,
      70,    52,     8,     8,   -40,   -40,   -40,    71,    72,     0,
     -40,    29,    49,   -40,    50,   -40,   -40,    73,     8,    37,
     -40,   -40,    74,     8,    37,    37,   -40,   -40,   -40,   -40,
      76,   -40,    56,     8,     8,   -40,    54,    60,     8,   -40,
     -40,   -40,   -40,   -40,    37,   -40,    55,   -40
    };
  }

/* YYDEFACT[STATE-NUM] -- Default reduction number in state STATE-NUM.
   Performed when YYTABLE does not specify something else to do.  Zero
   means the default is an error.  */
  private static final byte[] yydefact_ = yydefact_init();
  private static final byte[] yydefact_init()
  {
    return new byte[]
    {
       3,     3,     3,     0,     0,     2,     4,     5,     0,     1,
       0,     7,     7,     7,    16,     0,     3,     8,     9,     0,
       0,     0,     0,    18,     6,    16,     0,    49,    51,    52,
      13,    42,    40,    48,     0,     0,    18,     0,     0,     0,
       0,     0,     0,     0,    11,    17,     0,    46,    47,    38,
       0,    44,    45,    39,     0,     7,    14,    19,    18,     0,
       0,     0,    18,    18,    35,    36,    37,     0,     0,     0,
      50,    42,    40,    10,     0,    12,    20,     0,    18,     0,
      26,    25,    27,    18,     0,     0,    32,    43,    41,    15,
       0,    24,    30,    18,    18,    22,     0,     0,    18,    31,
      29,    28,    23,    33,     0,    21,     0,    34
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final byte[] yypgoto_ = yypgoto_init();
  private static final byte[] yypgoto_init()
  {
    return new byte[]
    {
     -40,   -40,    18,    -6,   -40,   -40,    62,   -35,   -40,   -40,
     -40,   -40,   -40,   -40,   -24,    32,    17,    15,   -40,   -40,
     -39,    11
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final byte[] yydefgoto_ = yydefgoto_init();
  private static final byte[] yydefgoto_init()
  {
    return new byte[]
    {
      -1,     4,     5,    16,    21,    75,    22,    44,    94,    60,
     100,    68,    86,    67,    30,    31,    53,    49,    54,    50,
      32,    33
    };
  }

/* YYTABLE[YYPACT[STATE-NUM]] -- What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule whose
   number is the opposite.  If YYTABLE_NINF, syntax error.  */
  private static final byte[] yytable_ = yytable_init();
  private static final byte[] yytable_init()
  {
    return new byte[]
    {
      61,    57,    46,     8,    69,     9,    17,    18,    10,     1,
       2,    36,    37,    19,    20,    72,    11,    12,    13,     6,
       7,    34,    84,    76,    38,     3,    85,    80,    81,    23,
      14,    39,    40,    41,    24,    77,    42,    43,    47,    48,
      92,    15,    35,    91,    64,    96,    97,    25,    95,    73,
      26,    65,    19,    27,    28,    29,    55,    66,   101,   102,
      51,    52,    56,   105,    58,   106,    59,    28,    29,    62,
      63,    70,    74,    78,    79,    83,    82,    93,    90,    98,
      99,   104,    71,   103,   107,    89,    87,    45,     0,    88
    };
  }

private static final byte[] yycheck_ = yycheck_init();
  private static final byte[] yycheck_init()
  {
    return new byte[]
    {
      39,    36,    26,    16,    43,     0,    12,    13,    20,     3,
       4,     3,     4,     6,     7,    54,     3,     3,     4,     1,
       2,     5,    22,    58,    16,    19,    26,    62,    63,     3,
      16,    23,    24,    25,    16,    59,    28,    29,     9,    10,
      79,    27,     8,    78,    16,    84,    85,    16,    83,    55,
      13,    23,     6,    16,    17,    18,     3,    29,    93,    94,
      11,    12,    15,    98,     3,   104,     7,    17,    18,     3,
       3,    14,     7,     3,    22,     3,     5,     3,     5,     3,
      24,    21,    50,    29,    29,    74,    71,    25,    -1,    72
    };
  }

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
  private static final byte[] yystos_ = yystos_init();
  private static final byte[] yystos_init()
  {
    return new byte[]
    {
       0,     3,     4,    19,    32,    33,    33,    33,    16,     0,
      20,     3,     3,     4,    16,    27,    34,    34,    34,     6,
       7,    35,    37,     3,    33,    16,    13,    16,    17,    18,
      45,    46,    51,    52,     5,     8,     3,     4,    16,    23,
      24,    25,    28,    29,    38,    37,    45,     9,    10,    48,
      50,    11,    12,    47,    49,     3,    15,    38,     3,     7,
      40,    51,     3,     3,    16,    23,    29,    44,    42,    51,
      14,    46,    51,    34,     7,    36,    38,    45,     3,    22,
      38,    38,     5,     3,    22,    26,    43,    48,    47,    52,
       5,    38,    51,     3,    39,    38,    51,    51,     3,    24,
      41,    38,    38,    29,    21,    38,    51,    29
    };
  }

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte[] yyr1_ = yyr1_init();
  private static final byte[] yyr1_init()
  {
    return new byte[]
    {
       0,    31,    32,    33,    33,    33,    33,    34,    34,    34,
      34,    34,    35,    35,    36,    36,    37,    37,    38,    38,
      38,    38,    38,    38,    38,    38,    38,    39,    39,    40,
      41,    41,    42,    43,    43,    44,    44,    44,    45,    46,
      47,    47,    48,    48,    49,    49,    50,    50,    51,    51,
      51,    52,    52
    };
  }

/* YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.  */
  private static final byte[] yyr2_ = yyr2_init();
  private static final byte[] yyr2_init()
  {
    return new byte[]
    {
       0,     2,     1,     0,     2,     2,     6,     0,     2,     2,
       5,     3,     4,     2,     0,     2,     0,     3,     0,     2,
       3,     6,     4,     5,     4,     3,     3,     0,     2,     4,
       0,     1,     2,     3,     5,     1,     1,     1,     2,     2,
       0,     3,     0,     3,     1,     1,     1,     1,     1,     1,
       3,     1,     1
    };
  }




  /* YYTRANSLATE_(TOKEN-NUM) -- Symbol number corresponding to TOKEN-NUM
     as returned by yylex, with out-of-bounds checking.  */
  private static final SymbolKind yytranslate_(int t)
  {
    // Last valid token kind.
    int code_max = 285;
    if (t <= 0)
      return SymbolKind.S_YYEOF;
    else if (t <= code_max)
      return SymbolKind.get(yytranslate_table_[t]);
    else
      return SymbolKind.S_YYUNDEF;
  }
  private static final byte[] yytranslate_table_ = yytranslate_table_init();
  private static final byte[] yytranslate_table_init()
  {
    return new byte[]
    {
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30
    };
  }


  private static final int YYLAST_ = 89;
  private static final int YYEMPTY_ = -2;
  private static final int YYFINAL_ = 9;
  private static final int YYNTOKENS_ = 31;

/* Unqualified %code blocks.  */
/* "AdaParser.y":13  */

  public static void main(String args[]) throws IOException {
    AdaParserLexer lexer = new AdaParserLexer(System.in);
    AdaParser parser = new AdaParser(lexer);
    if(parser.parse())
      System.out.println("------------------------------------------\nParseo COMPLETADO: Codigo OK, gramatica correcta!");
    return;
  }

/* "AdaParser.java":1186  */

}
/* "AdaParser.y":109  */


class AdaParserLexer implements AdaParser.Lexer {
  InputStreamReader it;
  Yylex yylex;

  public AdaParserLexer(InputStream is){
    it = new InputStreamReader(is);
    yylex = new Yylex(it);
  }

  @Override
  public void yyerror (String s){
	System.out.println("------------------------------------------\nParseo COMPLETADO: Codigo incorrecto, gramatica no contemplada");
    System.err.println("\t-> Error: " + s);
  }

  @Override
  public Object getLVal() {
    return null;
  }

  @Override
  public int yylex () throws IOException{	
	int token = yylex.yylex();
    return token;
  }
}
