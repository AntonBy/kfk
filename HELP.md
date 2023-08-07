# Getting Started

JAVA 17!!

in cmd: 
build project: `mvnw clean package`
startup: `docker-compose up`


http://localhost:9095/ - KafkaUI
http://localhost:8080/messages/send/hello - send message "hello" to kafka. "Hello" can be replaced with another value.
http://localhost:8080/messages - list all messages

stop: `docker-compose down`