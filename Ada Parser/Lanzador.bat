@echo off 
cd classFiles
if exist *.class (
	java AdaParser < ../Testcode/codigoinput.txt
	pause
) else (
	cd ../makerFiles
	call creador.bat
	ping 127.0.0.1 -n 3 > nul
	cd ..
	call Lanzador.bat
)