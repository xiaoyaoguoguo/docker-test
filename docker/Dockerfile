FROM openjdk:8-oracle
VOLUME /tmp
ARG JAR_FILE=docker-test.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]