FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT [ "java", "-jar", "/Ec2Application.jar" ]
EXPOSE 3000