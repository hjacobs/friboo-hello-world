FROM zalando/openjdk:8u45-b14-1

MAINTAINER Henning Jacobs <henning.jacobs@zalando.de>

EXPOSE 8080
ENV HTTP_PORT=8080

COPY target/hello-world.jar /
COPY target/scm-source.json /

CMD java $(java-dynamic-memory-opts) -jar /hello-world.jar
