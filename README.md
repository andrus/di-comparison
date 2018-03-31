# DI Containers Comparision

Comparing a simple app written on top of Cayenne DI, Dagger 2, and
Guice.

## IntelliJ IDEA Setup

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
$ time java -jar ./springboot/target/springboot-1.0-SNAPSHOT.jar
```

## Results

|DI|Jar with Dependencies, KB|Compile Time, ms|Exec time, ms|
|----|-----|-----|----|
|Cayenne DI|79|93|166|
|Dagger| 51|1320|122|
|Guice|3440|483|353|
|Spring Boot|6993|527|1628|
