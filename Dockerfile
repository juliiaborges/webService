# Usar OpenJDK 17, compatível com sua aplicação
FROM openjdk:17-jdk

# Definir o diretório de trabalho dentro do container
WORKDIR /app

# Copiar o JAR gerado para dentro do container
ADD target/*.jar app.jar

# Expor a porta 8761 (Eureka Server)
EXPOSE 8761

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
