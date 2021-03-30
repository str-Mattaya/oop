@echo off
cls
"C:\Program Files\Java\jdk-14.0.1\bin\javac" *.java
"C:\Program Files\Java\jdk-14.0.1\bin\java" Main
del *.class
pause