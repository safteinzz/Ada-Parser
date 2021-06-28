%define api.prefix {AdaParser}
%define api.parser.class {AdaParser}
%define api.parser.public
%define parse.error verbose

%code imports{
  import java.io.InputStream;
  import java.io.InputStreamReader;
  import java.io.Reader;
  import java.io.IOException;
}

%code {
  public static void main(String args[]) throws IOException {
    AdaParserLexer lexer = new AdaParserLexer(System.in);
    AdaParser parser = new AdaParser(lexer);
    if(parser.parse())
      System.out.println("------------------------------------------\nParseo COMPLETADO: Codigo OK, gramatica correcta!");
    return;
  }
}

%token linea comentario finaldesentencia coma asignacion dospuntos suma resta multiplicacion division abreparentesis cierraparentesis tipo identificador entero real metodo declarador operadorrango operadorracional operadorlogico iniciooperadorlogico finaloperadorlogico iterador iniciobloque delimitador bucle UNKNOWN_TOKEN

%%
prog : 
    OUTSIDEFUNC
;

OUTSIDEFUNC : 
	| linea OUTSIDEFUNC
	| comentario OUTSIDEFUNC
	| metodo identificador declarador linea INSIDEFUNC OUTSIDEFUNC
;

INSIDEFUNC : 
	| linea INSIDEFUNC
	| comentario INSIDEFUNC
	| identificador MULTIDECLAR finaldesentencia linea INSIDEFUNC
	| iniciobloque linea AFTERBEGIN
;
	
MULTIDECLAR : MULTIASIG dospuntos tipo POSASIG
    | asignacion OPERACION
;
POSASIG : 
	| asignacion NUMERO
;
MULTIASIG : 
	| coma identificador MULTIASIG
;
	
AFTERBEGIN : 
	| linea AFTERBEGIN
	| comentario linea AFTERBEGIN
	| identificador asignacion OPERACION finaldesentencia linea AFTERBEGIN
	| bucle REP linea AFTERBEGIN
	| delimitador LIMITPOS finaldesentencia OVER AFTERBEGIN
	| operadorlogico COMP linea AFTERBEGIN
	| finaloperadorlogico linea AFTERBEGIN
	| iniciooperadorlogico linea AFTERBEGIN
;

OVER : 
	| linea AFTERBEGIN
;
COMP : VAL operadorracional VAL FIXTHEN
;
FIXTHEN : 
	| iniciooperadorlogico
;

REP : VAL REPE
;
REPE : operadorracional VAL bucle
	| iterador VAL operadorrango VAL bucle
;
	
LIMITPOS : identificador
    | operadorlogico
    | bucle
;
	
OPERACION : PRIO SUMARESTA
;
PRIO : VAL MULTIDIVI
;
MULTIDIVI : 
	| OPPRI VAL MULTIDIVI
;
SUMARESTA : 
	| OPSEC PRIO SUMARESTA
;
OPPRI : multiplicacion 
    | division
;
OPSEC : suma 
    | resta
;
	
VAL : NUMERO
    | identificador
    | abreparentesis OPERACION cierraparentesis
;

NUMERO : entero
    | real
;
%%

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