# Apache Pekko Quickstart with Scala

## Quickstart guide

The Hello World example illustrates Apache Pekko basics. Within 30 minutes, you should be able to download and run the example and use this guide to understand how the example is constructed. This will get your feet wet, and hopefully inspire you to dive deeper into the wonderful world of Apache Pekko!

## Giter8 template

It can also be used as a [Giter8][g8] template for Apache Pekko with Scala.

Prerequisites:
- JDK 8
- [sbt][sbt] 0.13.13 or higher ([download here][sbt_download])

Open a console and run the following command to apply this template:
 ```
sbt -Dsbt.version=1.10.0 new apache/pekko-quickstart-scala.g8
 ```

This template will prompt for the name of the project. Press `Enter` if the default values suit you.

Once inside the project folder, run the application with:
```
sbt run
```

## Template license

Written in 2019 by Lightbend, Inc.

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <https://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: https://www.foundweekends.org/giter8/
[sbt]: https://www.scala-sbt.org/
[sbt_download]: https://www.scala-sbt.org/download.html

## Organize Scala imports

Generated Scala projects include Scalafix. Run `sbt sortImports` from the
generated project to organize main and test imports and remove unused imports.

This uses Scalafix 0.14.10 and the OrganizeImports grouping from
[apache/pekko#3342](https://github.com/apache/pekko/pull/3342). Relative imports
remain unexpanded and adjacent to their root import.

The template defaults to sbt 1.13.0, which is compatible with its build plugins.
The `sbt_version` template parameter remains overridable.
