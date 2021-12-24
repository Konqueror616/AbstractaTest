package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="../SimetrikTest/src/test/resources/feature/busqueda.feature",
		glue= {"stepDefinition"},
		strict = true,
		dryRun = false
		)

public class testRunnerSimetrik {

}
