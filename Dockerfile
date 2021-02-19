FROM adoptopenjdk/openjdk8-openj9:alpine

RUN apk add --update -U bash

VOLUME /tmp

ADD target/serviceListener.jar serviceListener.jar

COPY entry_point.sh /entry_point.sh

EXPOSE 8081

ENTRYPOINT ["/bin/bash", "entry_point.sh", "serviceListener.jar"]