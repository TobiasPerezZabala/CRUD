FROM maven:3.8.5-openjdk-17 AS build

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo pom.xml y las dependencias
COPY pom.xml .
COPY src ./src

# Ejecutar Maven para construir el proyecto
RUN mvn clean package

# Copiar el archivo jar desde la etapa de construcción
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]