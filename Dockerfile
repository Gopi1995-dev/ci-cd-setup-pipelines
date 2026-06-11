FROM eclipse-temurin:21-jdk

COPY target/*.jar app.jar

EXPOSE 7000

ENTRYPOINT ["java","-jar","app.jar"]