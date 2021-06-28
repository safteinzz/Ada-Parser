@echo off
IF EXIST gramatica.txt DEL /F gramatica.txt 
IF EXIST salida.txt DEL /F salida.txt 
cd src
call creador.bat
ping 127.0.0.1 -n 3 > nul
cd ../compilacion
java AdaParser < ../pruebas/codigoinput.txt
pause
