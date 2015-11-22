name := "mailing"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
    "org.scalatest"   %% "scalatest"    % "2.2.4"   % "test,it",
    "org.scalacheck"  %% "scalacheck"   % "1.12.5"  % "test,it",
    "org.scoverage"   %% "scalac-scoverage-runtime" % "1.1.1"
)

scalacOptions ++= List("-feature","-deprecation", "-unchecked", "-Xlint")
testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-l", "org.scalatest.tags.Slow", "-u","target/junit-xml-reports", "-oD", "-eS")
scalastyleConfig <<= baseDirectory { _ / "src/main/config" / "scalastyle-config.xml" }
EclipseKeys.withSource := true

coverageEnabled := true
