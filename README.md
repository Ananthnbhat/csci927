# Pandemica microservices

## Required software:

* java: openjdk 18.0.1.1
* build tool: maven
* docker desktop
* any IDE which supports Java such as Intellij idea community edition

## How to run the microservices without docker:
1. Make sure there are no errors
2. In the terminal/cmd, go into *each* of the microservices and execute following command:
   * `mvn spring-boot:run`

## How to run the microservices with docker:

1. Start docker
2. In the terminal/cmd, go into *each* of the microservices (or one of the microservice that you want to run) and execute following commands:
    * `mvn clean package`
    * `docker-compose up` 
