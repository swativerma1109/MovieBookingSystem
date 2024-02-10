FROM openjdk:17
ADD target/MovieManagementService-0.0.1-SNAPSHOT.jar MovieManagementService.jar
EXPOSE 9090
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","MovieManagementService.jar"]