Scala Project Builds in Gradle, SBT, and Maven
===========

 A sample multi-module project that compiles and builds in Gradle, SBT, and Maven to show the various ways to get Scala code built.

# Why Scala: 
Martin Odersky -- We are in the middle of a paradigm shift [in] the industry, 
                  and there will be a new equilibrium between functional and 
                  object-driven programming, and Scala is leading that.

#Features
* Build tools of JEE, Maven and Gradle.
	* multi-module builds
	* multi-multi-multi modules builds 
	* need to add Scala into these environments
	* cross compiling can be tricky, but manageable
		* mixing means java first or scala first
		* keeps things seperate, at least in main and test   
* SBT is the Simple (or Scala) Build Tool
	* Default build tool for Scala, 
	* Martin Odersky says Scala will continue to allow all three.
* Describe the project layout, libraries and jars 
	* Java Library
	* Scala Library
	* PlayApp
* Describe the Play! framework directory structure
	* app and test directories  
	* public directory       
	* conf dir - application.conf and routes    
* Example Scala file, Java File, and Play Controller     
	* File.java
	* File.scala
	* Application controller
* Go through gradle build 
	* settings.gradle 
	* build.gradle 
	* run command line build  -- gradle clean build 
* Go through Maven build 
	* root pom
	* JavaLib pom.xml 
	* ScalaLib pom.xml 
	* PlayApp pom.xml
	* run command line build -- mvn clean verify
* Go through the SBT build 
	* build.sbt 
	* Project directory
	* run command line -- sbt ;clean ;cleanFiles ;test 
* Run the PlayApp
	* sbt run -- localhost:9000		 
	