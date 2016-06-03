# About
This it just a small sample project, where I am trying out
if scala.js really work with angular. Shared as a starting point for others who want to try out some scala-js(with
gradle).

##Setup

Gradle is used for the build.
The scalajs-gradle plugin is used for compiling scala into js.
The bower gradle plugin is used for downloading the required js assets.
The gradle war plugin is configured to include the bower assets.

##Structure
- src/assets/bower contains the js files downloaded by bower
- src/main/scala the scala files as usual
- src/main/webapp just an index page bootstrapping the application
-as