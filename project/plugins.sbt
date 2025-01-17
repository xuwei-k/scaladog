addSbtPlugin("org.scalameta"     % "sbt-scalafmt" % "2.0.0")
addSbtPlugin("org.xerial.sbt"    % "sbt-sonatype" % "2.5")
addSbtPlugin("com.jsuereth"      % "sbt-pgp"      % "1.1.0")
addSbtPlugin("com.github.gseitz" % "sbt-release"  % "1.0.11")

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "os-lib" % "0.3.0"
)
