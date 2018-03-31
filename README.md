# DI Containers Comparision

Comparing a simple app written with Cayenne DI, Dagger 2,
Guice and SpringBoot.

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

|DI|Compile/Package Time, ms|Jar with Dependencies, KB|Exec time, ms|
|----|-----|-----|----|
|Dagger|1320|51|122|
|Cayenne DI|93|79|166|
|Guice|483|3440|353|
|Spring Boot|527|6993|1628|
