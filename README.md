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

time java -jar ./bootique2/target/bootique2-*.jar
time java -jar ./cayennedi/target/cayennedi-*.jar
time java -jar ./dagger/target/dagger-*.jar
time java -jar ./guice/target/guice-*.jar
time java -jar ./owb/target/owb-*.jar
time java -jar ./spring/target/spring-*.jar
time java -jar ./springboot/target/springboot-*.jar

```

## Results

|DI|Build Time, ms|Jar w/Deps Size, KB|:arrow_down: Exec time, ms|
|----|-----|-----|----|
|Dagger|1267|51|121|
|Cayenne DI|91|79|180|
|Guice|487|3440|358|
|OpenWebBeans|361|1261|460|
|Spring|486|3545|506|
|Spring Boot|435|6993|1549|
