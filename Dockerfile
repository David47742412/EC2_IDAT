FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar Ec2Application.jar
ENTRYPOINT [ "java", "-jar", "/Ec2Application.jar" ]
EXPOSE 3000