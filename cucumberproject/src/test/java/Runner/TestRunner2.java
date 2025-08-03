package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Feature/DemoLogin.feature", glue="StepDefinition", dryRun= false,
plugin= {"pretty","html:target/cucumber-reports/hooks.html"})


public class TestRunner2 {

	}
