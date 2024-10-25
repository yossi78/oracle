
POSTMAN
-------------------------------------------------------------------------------------------------------------
#) Download postman collection from "resources"



RUN CONTAINER
-------------------------------------------------------------------------------------------------------------
#) Open command line in the root of the project and run :
  mvn clean package -DskipTests

#) Then run the following command :
  docker-compose up


OPEN UI IN BROWSER
-------------------------------------------------------------------------------------------------------------
#) Open the browser in the following url:
http://localhost:8080/



ORACLE CLIENT
-------------------------------------------------------------------------------------------------------------
#) Download “sql developer” in the following link :
https://www.oracle.com/database/sqldeveloper/technologies/download/

#) Provide the following credentials :
Host = localhost
Port = 1521
SID = xe
userName = system
Password = adminpassword

