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

## hit POST test_api

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