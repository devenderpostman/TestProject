
package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions
(
		features= {"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"},
		glue="stepDefinitions",
		dryRun=true,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		)
public class TestRun
{
	
}
