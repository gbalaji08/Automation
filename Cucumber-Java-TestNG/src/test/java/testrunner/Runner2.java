package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
    features = "src/test/java/Features/dataset.feature",
    glue = {"stepdefinitions"},
    tags = "@RegressionTest", 
    plugin = {
                    "pretty",
                    "html:target/cucumber-reports/cucumber-pretty",
                    "json:target/cucumber-reports/CucumberTestReport.json",
                    "rerun:target/cucumber-reports/rerun.txt",
                    "json:target/cucumber-reports/CucumberTestReport.json"})
 
public class Runner2 extends AbstractTestNGCucumberTests
{
	
}