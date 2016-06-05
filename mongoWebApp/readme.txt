mvn archetype:generate -DgroupId=com.friquerette -DartifactId=mongoWebApp -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
call mvn eclipse:clean
call mvn clean
call mvn mvn install
call mvn mvn eclipse:eclipse -Dwtpversion=2.0

gradleSimpleWS contient premier exemple mongoDB 

mongod --dbpath c:\project\mongodb