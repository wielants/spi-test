#!/bin/bash

# clean
rm -rf bin/
mkdir bin
rm -rf lib/
mkdir lib

# compile java files
find src/ -name "*.java" | xargs javac -d bin/

# package jars
(cd bin
find -type f | grep example | xargs jar cf ../lib/example.jar
find -type f | grep acme | xargs jar cmf ../res/Manifest2.txt ../lib/acme.jar
)

# call application
java -classpath lib/package2.jar package2.Test2
java -classpath lib/package2.jar package2.Test2Dynamic
