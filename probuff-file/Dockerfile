FROM openjdk:8-jdk-alpine

RUN mkdir /server

COPY target/probuff-file-1.0-SNAPSHOT-jar-with-dependencies.jar /server/probuf-file-server.jar

ENTRYPOINT ["java", "-jar", "/server/probuf-file-server.jar"]