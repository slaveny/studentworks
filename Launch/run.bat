@echo off
javac Main.java
del Main.java
java -classpath . Main
del Main.class
pause
exit