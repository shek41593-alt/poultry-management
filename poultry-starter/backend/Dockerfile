FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/poultry-api.jar poultry-api.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/poultry-api.jar"]
