FROM openjdk:8
EXPOSE 9095
ADD target/cde-27-docker-image.jar cde-27-docker-image.jar
ENTRYPOINT ["java","-jar","cde-27-docker-image.jar"]