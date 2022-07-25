# spark-sbt.g8

A [Giter8](https://github.com/foundweekends/giter8) template for Spark SBT applications.

## Usage

1. Install SBT with [SDKMAN](https://mungingdata.com/java/sdkman-multiple-versions-java-sbt-scala/)
   or use the docker image [ejimenezr/giter8](https://hub.docker.com/repository/docker/ejimenezr/giter8)

2. Start the app generation wizard: `sbt new https://gitlab.com/kikeramos/spark-sbt.g8`

3. Fill out the project properties on the command line

## Properties

```yaml
name=my-spark-project
package=my.project
scalaVersion=3.1.3
sparkVersion=3.3.0
version=0.0.1
sbtVersion=1.7.1
```
The project version.  `0.0.1` is usually the best place to start.

## Contribution

Send pull requests to keep this project updated.

We'll always try to keep this updated with the latest version of Spark and Scala.


## References
- [Giter8 documentation](http://www.foundweekends.org/giter8/)
- [MrPowers Spark SBT with g8](https://github.com/MrPowers/spark-sbt.g8)

## Template license
----------------
Written in 2022 by Enrique Jimenez 

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
