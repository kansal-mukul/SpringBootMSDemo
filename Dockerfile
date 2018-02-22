FROM openjdk:8
ADD target/SpringBootMSDemo-0.0.1-SNAPSHOT.jar SpringBootMSDemo-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","SpringBootMSDemo-0.0.1-SNAPSHOT.jar"]