#! /usr/bin/env bash
rm -r target
mvn install
java -jar target/tax-blaster-impl-0.0.1-SNAPSHOT.jar db migrate taxblaster.yml
java -jar target/tax-blaster-impl-0.0.1-SNAPSHOT.jar server taxblaster.yml