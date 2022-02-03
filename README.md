# DI Containers Comparision

Comparing a simple app varieties on different DI containers.

## IntelliJ IDEA Setup

Go to "Preferences > Annotation Processors", and check "Enable Annotation
Processing".

## "Benchmark"

```
# Build (can't compare build times, as module ordering affects the results)
mvn clean package
```

```
# Get the file sizes
find . -name '*.jar' |xargs ls -l |grep -v original |grep -v common
```

```
# Execution time

time java -jar ./bootique/target/bootique-*.jar
time java -jar ./cayennedi/target/cayennedi-*.jar
time java -jar ./dagger/target/dagger-*.jar
time java -jar ./guice/target/guice-*.jar
time java -jar ./owb/target/owb-*.jar
time java -jar ./spring/target/spring-*.jar
time java -jar ./springboot/target/springboot-*.jar

```

## Results (Java 8)

|DI|Jar w/Deps Size, KB|:arrow_down: Exec time, ms|
|----|-----|----|
|Dagger|46|104|
|Cayenne DI|79|120|
|Bootique|2522|244|
|Guice|3781|328|
|OpenWebBeans|1345|381|
|Spring|3954|355|
|Spring Boot|7824|1057|
