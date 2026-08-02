FROM eclipse-temurin:21

WORKDIR /usr/app

COPY target/docker_image777.jar docker_image777.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "docker_image777.jar"]
