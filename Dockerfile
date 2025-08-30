FROM openjdk:21
ADD target/spring-docker-mongodb.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]