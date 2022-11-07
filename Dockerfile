FROM maven:3.6.3-jdk-11-openj9 AS MVN_M2
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn package
RUN ls /build/target/
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=MVN_M2 /build/target/proyectoBanco-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java", "-jar", "proyectoBanco-0.0.1-SNAPSHOT.jar"]
