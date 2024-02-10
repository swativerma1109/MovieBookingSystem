FROM openjdk:17
ADD target/TheaterManagementService-0.0.1-SNAPSHOT.jar TheaterManagementService.jar
EXPOSE 9091
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","TheaterManagementService.jar"]