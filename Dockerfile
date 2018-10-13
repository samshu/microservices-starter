FROM maven:3.5.4-slim

ENTRYPOINT mvn spring-boot:run

WORKDIR /home/ubuntu/site/microservices-starter/

COPY springboot-microservice/ .

