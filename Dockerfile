FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=./example-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]