mvn archetype:generate -DgroupId=com.friquerette -DartifactId=mongoWebApp -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
mvn install
mvn eclipse:eclipse -Dwtpversion=2.0

mvn eclipse:clean

gradleSimpleWS contient premier exemple mongoDB 