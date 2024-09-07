FROM amazoncorretto:21-alpine3.20-jdk
RUN adduser -D -h /home/user user
USER user
WORKDIR /home/user/app
COPY build/libs/spring-boot-sample-0.0.1-SNAPSHOT.jar spring-boot-sample.jar
ENTRYPOINT ["java","-jar","spring-boot-sample.jar"]