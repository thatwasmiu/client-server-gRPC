FROM openjdk:8-jdk-alpine

RUN mkdir /server

COPY target/probuf-client-1.0-SNAPSHOT-jar-with-dependencies.jar /server/probuf-client.jar

ENTRYPOINT ["java", "-jar", "/server/probuf-client.jar"]