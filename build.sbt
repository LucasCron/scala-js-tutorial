enablePlugins(ScalaJSPlugin)

name := "scala-js-tutorial"
version := "0.1.0-SNAPSHOT"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true 
scalaVersion := "3.1.1"
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.1.0"

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.10" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")