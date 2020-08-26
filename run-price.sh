#start app on docker container

#shoose java version
export JAVA_HOME=`/usr/libexec/java_home -v 14`

#build JAR file
mvn clean install -DskipTests

#build docker image
docker build -t zd/zd-price:0.0.1 .

#start docker container
docker run --rm -d -p 9093:9093  zd/zd-price:0.0.1