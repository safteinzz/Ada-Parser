import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

%%
%public
%standalone

%line
%column

L=[a-zA-Z_]+
D=[0-9]+
F=[0-9]+("." [0-9]+)?
espacio=[ \t\r]+
linea = [\n]+
UNKNOWN_TOKEN = .

%{	
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
%}


%%


{espacio} {/*ignore*/}
{linea} {impresorGuardador(yyline, yycolumn, yytext(), "Linea"); return AdaParserLexer.linea;}
("--".* | "//".*) {impresorGuardador(yyline, yycolumn, yytext(), "Comentario"); return AdaParserLexer.comentario;} 
(";") {impresorGuardador(yyline, yycolumn, yytext(), "Final de sentencia"); return AdaParserLexer.finaldesentencia;}

(",") {impresorGuardador(yyline, yycolumn, yytext(), "Coma"); return AdaParserLexer.coma;}
(":=") {impresorGuardador(yyline, yycolumn, yytext(), "Asignacion"); return AdaParserLexer.asignacion;}
(":") {impresorGuardador(yyline, yycolumn, yytext(), "Dos puntos"); return AdaParserLexer.dospuntos;}

("+") {impresorGuardador(yyline, yycolumn, yytext(), "Suma"); return AdaParserLexer.suma;}
("-") {impresorGuardador(yyline, yycolumn, yytext(), "Resta"); return AdaParserLexer.resta;}
("*") {impresorGuardador(yyline, yycolumn, yytext(), "Multiplicacion"); return AdaParserLexer.multiplicacion;}
("/") {impresorGuardador(yyline, yycolumn, yytext(), "Division"); return AdaParserLexer.division;}
("(") {impresorGuardador(yyline, yycolumn, yytext(), "Abre parentesis"); return AdaParserLexer.abreparentesis;}
(")") {impresorGuardador(yyline, yycolumn, yytext(), "Cierraparentesis"); return AdaParserLexer.cierraparentesis;}
("Integer" | "Float")  {impresorGuardador(yyline, yycolumn, yytext(), "Tipo"); return AdaParserLexer.tipo;}
("procedure") {impresorGuardador(yyline, yycolumn, yytext(), "Metodo"); return AdaParserLexer.metodo;}
("is") {impresorGuardador(yyline, yycolumn, yytext(), "Declarador"); return AdaParserLexer.declarador;}
("..") {impresorGuardador(yyline, yycolumn, yytext(), "Operador de rango"); return AdaParserLexer.operadorrango;}
("<" | ">" | "/=" | "=") {impresorGuardador(yyline, yycolumn, yytext(), "Operador racional"); return AdaParserLexer.operadorracional;}
("if" | "elsif") {impresorGuardador(yyline, yycolumn, yytext(), "Operador logico"); return AdaParserLexer.operadorlogico;}
("then") {impresorGuardador(yyline, yycolumn, yytext(), "Inicio de operador logico"); return AdaParserLexer.iniciooperadorlogico;}
("else") {impresorGuardador(yyline, yycolumn, yytext(), "Final de operador logico"); return AdaParserLexer.finaloperadorlogico;}
("in" ) {impresorGuardador(yyline, yycolumn, yytext(), "Iterador"); return AdaParserLexer.iterador;}
("begin") {impresorGuardador(yyline, yycolumn, yytext(), "Inicio de bloque"); return AdaParserLexer.iniciobloque;}
("end") {impresorGuardador(yyline, yycolumn, yytext(), "Delimitador"); return AdaParserLexer.delimitador;}
("while" | "for" | "loop") {impresorGuardador(yyline, yycolumn, yytext(), "Bucle"); return AdaParserLexer.bucle;}

{L}({L}|{D})* {impresorGuardador(yyline, yycolumn, yytext(), "identificador"); return AdaParserLexer.identificador;}
("(-"{D}+")")|{D}+ {impresorGuardador(yyline, yycolumn, yytext(), "Entero"); return AdaParserLexer.entero;}
("(-"{F}+")")|{F}+ {impresorGuardador(yyline, yycolumn, yytext(), "Real"); return AdaParserLexer.real;}
{UNKNOWN_TOKEN} {return AdaParserLexer.UNKNOWN_TOKEN;}
