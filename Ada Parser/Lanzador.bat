@echo off
IF EXIST gramatica.txt DEL /F gramatica.txt 
IF EXIST salida.txt DEL /F salida.txt 
cd compilacion
if exist *.class (
	java AdaParser < ../pruebas/codigoinput.txt
	pause
) else (
	cd ../src
	call creador.bat
	ping 127.0.0.1 -n 3 > nul
	cd ..
	call Lanzador.bat
)