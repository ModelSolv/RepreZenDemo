#! /usr/bin/env bash
rm -r target
mvn install
java -jar target/swagger-ui-0.0.1-SNAPSHOT.jar server swagger-ui.yml