The scripts have be ben automated through browserstack free account on below device
	     "device", "Google Pixel 3"
	      "os_version", "9.0"

The Framework and scripts consist of below Structure:-
com.example.POM-> Consist of all the Pageobject model classes Xpaths and Identifiers
com.example.Driver-> Consist of driver class to trigger application in device and desired capabilities
com.example.Productcode-> consist of basic funtion and codes
com.example.stepDef -> consist of Hooks file and Stepdefination file for cucumber
com.example.testRunner-> consist of the test runner to trigger feature file via CUcumber 
com.example.Wrapper-> consist of seleniufunction to perform action like click sendkeys etc.

src/test/resources/Features-> consist of Productcode.feature consisting of test cases and test data