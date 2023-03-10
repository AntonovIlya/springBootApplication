FROM openjdk:17-oracle

EXPOSE 8080

COPY target/springBootApplication-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]