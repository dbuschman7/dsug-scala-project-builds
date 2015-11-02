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
* Testing - Recommend ScalaTest 
	* [ScalaTest WebSite](http://www.scalatest.org)
	* [Matchers Quick Reference](http://www.scalatest.org/user_guide/matchers_quick_reference)
	* [selecting a style](http://www.scalatest.org/user_guide/selecting_a_style)
* JavaLib
	* running a ScalaTest as a jUnit test
	* class is ScalaTest
* ScalaLib 
	* run ScalaTest in additon to jUnit 
	* ScalaFeatureSpecTest
	* ScalaFlatSpecTest
	* ScalaFunSuiteTest
* Show build systems example 
	* Maven 
	  	* JavaLib - no changes  
		* ScalaLib - added scalatest - pom.xml
		* mvn clean test
	* Gradle 
		*  build.gradle
		* JavaLib 
			* add beforeTest handle to see tests when they run
		* ScalaLib 
			* add scalatest plugin
		* gradle clean test 
	* Sbt 
		* project/build.sbt - add scalatest dependency 
		* sbt clean test 	
		 
* Testing code in ScalaTest 
	* [Pascal's Triangle](https://en.wikipedia.org/wiki/Pascal%27s_triangle)
	* Possible iterations - iterative and recursive  
	* PascalTriangleTest - look at examples 
		* Java Iterative 
			* PascalJava
			* show Java to Scala conversions of List[List[Long]]
		* Scala Recursive 
			* PascalScala
			* show prettyPrint code 
		* Scala worksheet - O Captian, My Captian
			* investigate a simpler algorithm
			* determine structure to use 
			* need a structure to generate the next value on the fly 
			 
				
			 
					 	