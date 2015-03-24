FROM zalando/openjdk:8u40-b09-4

MAINTAINER Henning Jacobs <henning.jacobs@zalando.de>

COPY target/friboo-hello-world.jar /

EXPOSE 8080
ENV HTTP_PORT=8080

CMD java $(java-dynamic-memory-opts) -jar /friboo-hello-world.jar
