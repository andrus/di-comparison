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

## Results (Java 21)

|DI| Jar w/Deps Size, KB | :arrow_down: Exec time, ms |
|----|---------------------|----------------------------|
|Dagger| 58                  | 90                         |
|Cayenne DI| 71                  | 105                        |
|Bootique| 2894                | 157                        |
|Guice| 3827                | 204                        |
|OpenWebBeans| 1632                | ? (failures)               |
|Spring| 4800                | 221                        |
|Spring Boot| 10094               | 743                        |
