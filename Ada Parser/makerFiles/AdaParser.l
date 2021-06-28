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
%%


{espacio} {/*ignore*/}
{linea} {return AdaParserLexer.linea;}
("--".* | "//".*) {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.comentario;} 
(";") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.finaldesentencia;}

(",") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.coma;}
(":=") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.asignacion;}
(":") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.dospuntos;}

("+") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.suma;}
("-") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.resta;}
("*") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.multiplicacion;}
("/") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.division;}
("(") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.abreparentesis;}
(")") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.cierraparentesis;}
("Integer" | "Float")  {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.tipo;}
("procedure") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.metodo;}
("is") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.declarador;}
("..") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.operadorrango;}
("<" | ">" | "/=" | "=") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.operadorracional;}
("if" | "elsif") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.operadorlogico;}
("then") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.iniciooperadorlogico;}
("else") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.finaloperadorlogico;}
("in" ) {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.iterador;}
("begin") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.iniciobloque;}
("end") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.delimitador;}
("while" | "for" | "loop") {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.bucle;}

{L}({L}|{D})* {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.identificador;}
("(-"{D}+")")|{D}+ {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.entero;}
("(-"{F}+")")|{F}+ {System.out.println("[token at line " + yyline + ":" + yycolumn + " = \"" + yytext() + "\"]"); return AdaParserLexer.real;}
{UNKNOWN_TOKEN} {return AdaParserLexer.UNKNOWN_TOKEN;}
