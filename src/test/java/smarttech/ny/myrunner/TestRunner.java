package smarttech.ny.myrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json" }, //plugin is nothing but generate the report.
		features = {".//Features/"}, //feature is nothing but location of the Features file.
		glue = {"smarttech.ny.stepdefinitions","smarttech.ny.hooks"} //glue is nothing but step definition package name.
		)
//runner class is used to build communication between feature file and step def.


public class TestRunner extends AbstractTestNGCucumberTests {

}
