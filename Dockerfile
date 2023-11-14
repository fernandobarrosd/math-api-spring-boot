FROM maven as build

COPY . . 

RUN mvn package

FROM openjdk:17

COPY --from=build /target/math-api-0.0.1-SNAPSHOT.jar math-api.jar


EXPOSE 8080

ENTRYPOINT ["java", "-jar", "math-api.jar"]