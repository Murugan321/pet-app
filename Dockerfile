FROM openjdk:8
WORKDIR /app
ADD target/pet-app-0.0.1-SNAPSHOT.jar /app/devops-integration.jar
ENTRYPOINT ["java","-jar","/app/devops-integration.jar"]
