# DI Containers Comparision

Comparing a simple app written on top of Cayenne DI, Dagger 2, and
Guice.

## Idea Setup

Go to "Preferences > Annotation Processors", and check "Enable Annotation
Processing".

## Results - Jar-with-Dependencies Sizes

```
$ mvn clean package
$ find . -name '*.jar' |xargs ls -l |grep -v original |grep -v common

-rw-r--r--  1 andrus  staff    80803 Mar 31 16:52 ./cayennedi/target/cayennedi-1.0-SNAPSHOT.jar
-rw-r--r--  1 andrus  staff    52533 Mar 31 16:52 ./dagger/target/dagger-1.0-SNAPSHOT.jar
-rw-r--r--  1 andrus  staff  3522218 Mar 31 16:52 ./guice/target/guice-1.0-SNAPSHOT.jar
```

## Results - Startup Time

```
$ time java -jar ./cayennedi/target/cayennedi-1.0-SNAPSHOT.jar
...
real	0m0.166s
```

```
$ time java -jar ./dagger/target/dagger-1.0-SNAPSHOT.jar
...
real	0m0.122s
```

```
$ time java -jar ./guice/target/guice-1.0-SNAPSHOT.jar
...
real	0m0.353s
```