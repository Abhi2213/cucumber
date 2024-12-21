// test runner file executes the Cucumber feature files and 
// coordinates the steps defined in those feature files with the corresponding step definitions
package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

//tells JUnit to use the Cucumber class as the test runner
@RunWith(Cucumber.class)

//used in configuring various parameters
@CucumberOptions(features="src/test/resources/Features/AdminPanelLoginPage.feature",

//glue describes the location and path of the step definition file
glue={"stepDefinition"},

//Junit console me each step ka flow dikhata h
stepNotifications=true,

//monochrome used for better readable console output
monochrome = true,

//Cucumber will only check that every Step mentioned in the Feature File has corresponding code written in Step Definition file or not.
dryRun=false,

//Pretty Format generates the Cucumber test report in the HTML format, i.e. an HTML file.
//for other formats we can use different format as below
plugin={"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		//creates a txt file of failed features to run after
		"rerun:target/failedrerun.txt"
		},
//we can run particular tags from feature file also as below
//tags="@tagname"
tags="@s2"			
				)
public class TestRunnerFinal{
	// This class is usually left empty
}