dotty-graalvm.g8
=================
A [Giter8][g8] template for [Dotty] using [GraalVM].

Template usage
--------------
Using `sbt` version `1.3.0`, do:
```
sbt new devilune/dotty-graalvm.g8
```
in the folder where you want to clone the template.

Generated project usage
--------------
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

Template license
----------------
Written in 2019 by [devilune]

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
[Dotty]: http://dotty.epfl.ch/
[IDE support for Dotty]: https://dotty.epfl.ch/docs/usage/ide-support.html
[GraalVM]: https://www.graalvm.org
[GraalVM Native Image]: https://www.graalvm.org/docs/reference-manual/aot-compilation/
[devilune]: https://github.com/devilune
