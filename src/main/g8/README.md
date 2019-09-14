# sbt project compiled with Dotty using GraalVM

## Usage

Compile
```
sbt compile
```

Run
```
sbt run
```

Test
```
sbt test
```

Building native image
```
sbt graalvm-native-image:packageBin
```

Note:  
You need to install [GraalVM] and [GraalVM Native Image].

Edit
```
sbt launchIDE
```

See also [IDE support for Dotty].

[GraalVM]: https://www.graalvm.org
[GraalVM Native Image]: https://www.graalvm.org/docs/reference-manual/aot-compilation/
[IDE support for Dotty]: https://dotty.epfl.ch/docs/usage/ide-support.html
