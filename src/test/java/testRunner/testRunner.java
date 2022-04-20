package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="../AbstractaTest/src/test/resources/feature/busquedaML.feature",
		glue= {"stepDefinition"},
		strict = true,
		dryRun = false
		)

public class testRunner {

}
