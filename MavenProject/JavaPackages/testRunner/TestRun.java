
package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions
(
		features= {"C:\\Users\\HP\\git\\TestProject\\MavenProject\\Feature"},
		glue="stepDefinitions",
		dryRun=true,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		)
public class TestRun
{
	
}