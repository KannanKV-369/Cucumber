package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Login.feature",
				 glue="stepdefinitions",
				 monochrome= true ,
				 publish = true )
public class RunCucumberTests extends AbstractTestNGCucumberTests{

}
