# DI Containers Comparision

Comparing a simple app written on top of Cayenne DI, Dagger 2, and
Guice.

## Idea Setup

Go to "Preferences > Annotation Processors", and check "Enable Annotation
Processing".

## "Benchmark"

```
$ mvn clean package

# Get the file sizes
$ find . -name '*.jar' |xargs ls -l |grep -v original |grep -v common

# Execution time
$ time java -jar ./cayennedi/target/cayennedi-1.0-SNAPSHOT.jar
$ time java -jar ./dagger/target/dagger-1.0-SNAPSHOT.jar
$ time java -jar ./guice/target/guice-1.0-SNAPSHOT.jar
```

## Results

|DI|Jar with Dependencies, KB|Exec time, ms|
|----|-----|-----|
|Cayenne DI|78.9|166|
|Dagger| 51.3|122|
|Guice|3439.7|353|
