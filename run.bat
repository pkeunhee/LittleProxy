@echo off
set JAVA_CMD=%JAVA_HOME%\bin\java

"%JAVA_CMD%" -server -XX:+HeapDumpOnOutOfMemoryError -Xmx800m -jar target/all.jar %*