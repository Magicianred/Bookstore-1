# Bookstore - Redis + Spring Boot

A collection of Spring Boot REST services for a mythical online bookstore powered by Redis. It uses:

* [Spring Data Redis](https://spring.io/projects/spring-data-redis)
* [RedisJSON](https://oss.redislabs.com/redisjson/) via [JRedisJSON](https://github.com/RedisJSON/JRedisJSON)
* [RediSearch](https://oss.redislabs.com/redisearch/) via [spring-redisearch](https://github.com/RediSearch/spring-redisearch) and [LettuSearch](https://github.com/RediSearch/lettusearch)
* [RedisGraph](https://oss.redislabs.com/redisgraph/) via [JRedisGraph](https://github.com/RedisGraph/JRedisGraph)
* [RedisBloom](http://redisbloom.io) via [JRedisBloom](https://github.com/RedisBloom/JReBloom)

**Prerequisites:**

* [Java 11](https://sdkman.io/jdks)
* [Maven 3.2+](https://sdkman.io/sdks#maven)
* [Docker](https://www.docker.com/products/docker-desktop)
* [Redis + Modules ](https://hub.docker.com/r/redislabs/redismod) 6.0.1 or greater

## Getting Started

### Start Redis and the Spring Boot Application

1. Start the Docker Compose application:

    ```
    cd bookstore/docker
    docker-compose up
    ```
2. Run the Spring Boot app to build the application.

    ```
    ./mvnw clean spring-boot:run
    ```
