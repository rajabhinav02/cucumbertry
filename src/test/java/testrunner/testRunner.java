package testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src\\resources\\java\\features",
				 glue= {"stepdefinition", "apphooks"},
				 dryRun= true)
public class testRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider
	public Object[][] scenarios() {
		
		return super.scenarios();
	}
	
}
