# Usar OpenJDK 17 para rodar a aplicação compatível com Java 17
FROM openjdk:17-jdk

# Definir o diretório de trabalho dentro do container
WORKDIR /app

# Copiar o JAR gerado para o container
ADD target/*.jar app.jar

# Expor a porta 8081
EXPOSE 8081

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
