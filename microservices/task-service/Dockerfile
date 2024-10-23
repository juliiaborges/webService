FROM openjdk:17-jdk
WORKDIR /app
ADD target/*.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]
