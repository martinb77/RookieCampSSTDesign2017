@echo off
call \software\set-env.cmd
cd ..
start serve
start http://localhost:5001/swagger-ui-3.4.1?url=http://localhost:5001/uebung1/dynamicDataAPIv2/swagger/swagger-dynamicDataAPIv2.yaml