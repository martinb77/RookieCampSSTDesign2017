@echo off
call \software\set-env.cmd
cd ..
start serve
start http://localhost:5000/swagger-ui-3.4.1?url=http://localhost:5000/uebung1/dynamicDataAPIv1/swagger/swagger-dynamicDataAPIv1.yaml