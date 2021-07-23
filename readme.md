# Event-driven Microservices using Spring Boot and Apache Kafka
This is the full event driven microservice example using spring boot codes with Apache Kafka as messaging broker. You can clone this full code and test it yourself, understand better what microservice event driven software design. Blog post https://www.techgalery.com/2021/07/event-driven-microservice-spring-boot.html

## To run your kafka server

docker-compose up -d

## If you want to stop your kafka server run this command

docker-compose rm -fsv

## To run consumer-service
cd consumer-service  
mvnw spring-boot:run

## To run producer-service

cd consumer-service  
mvnw spring-boot:run

## Hit POST test_api

``
curl --location --request POST 'http://localhost:8080/test_api' \
--header 'Content-Type: application/json' \
--data-raw '{
"dataKey": "kafkaKey123",
"dataBody": "Hello world kafka messaging!"
}'
``

See the log at consumer-service microservice, that's the consumer event that is firing.

You can also use kafka tool to view the message/logs/event that being produce by the application, download kafka tool here https://kafkatool.com/download.html

## Screenshoots

- postman  
  ![alt text](https://github.com/mudiadamz/event-driven-microservice-example/blob/main/postman.jpg?raw=true)
- kafka tool  
  ![alt text](https://github.com/mudiadamz/event-driven-microservice-example/blob/main/kafka-tool.jpg?raw=true)

