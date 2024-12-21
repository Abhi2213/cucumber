package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/final.feature",

glue={"stepDefinition"},
monochrome = true,
dryRun=false,
plugin={"pretty",
		"html:target/HtmlReports",
		"json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber.xml",
		"rerun:target/failedrerun.txt"}
				)
public class failedRunner{

}