FROM openjdk:17-jdk
WORKDIR /app
ADD target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
