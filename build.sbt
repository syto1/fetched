lazy val root = (project in file(".")).
  settings(
    name := "fetched",
    version := "0.10",
    scalaVersion := "2.11.7"
  )

libraryDependencies ++= Seq(
"org.apache.hadoop" % "hadoop-hdfs" % "2.7.1.2.3.2.1-12"  excludeAll(
    ExclusionRule(organization = "org.mortbay.jetty")
  ),
  "org.apache.hadoop" % "hadoop-common" % "2.7.1.2.3.2.1-12" excludeAll(
      ExclusionRule(organization = "org.mortbay.jetty")
    )
)

resolvers ++= Seq(
"hdp releases" at "http://repo.hortonworks.com/content/repositories/releases/"
)
