FROM openjdk:8-jdk-alpine

COPY . .

RUN ./gradlew build

EXPOSE 8080

CMD ./gradlew bootRun 
