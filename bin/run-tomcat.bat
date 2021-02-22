@echo off
echo.
echo [信息] ʹ开始 Spring Boot Tomcat 运行 Web 服务
echo.

%~d0
cd %~dp0

cd ..
title %cd%
set MAVEN_OPTS=%MAVEN_OPTS% -Xms256m -Xmx1024m -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=512m
call mvn clean spring-boot:run -Dmaven.test.skip=true -U

pause