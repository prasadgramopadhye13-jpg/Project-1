package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= ".//Feature/TagsDemo.feature", glue=
                   "StepDefinition", dryRun=false,
                   tags = "@Smoke",
                   plugin= {"pretty","html:target/cucumber-reports/tags.html"})
public class TagRunner {

}
