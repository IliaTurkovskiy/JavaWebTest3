FROM openjdk:17
EXPOSE 8080
ADD build/libs/JavaWebTest3-0.0.1-SNAPSHOT-plain.jar java_web_test3.jar
ENTRYPOINT ["java", "-jar", "/java_web_test3.jar"]