  package Runner;				

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, glue = "Testcases",
					tags = "@Run",

					
						//	features ="src/test/resources/Workflow.feature",
					
					features ="src/test/resources/DesignProject.feature" ,
					
			//	   features ="src/test/resources/Role.feature",			

				   plugin = { "pretty", "html:target/cucumber-report/cucumber.html",
					   		"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm",
					   		"json:target/cucumber-report/cucumber.json",
							"junit:target/cucumber-report/cucumber.xml",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"html:target/cucumber-reports" })
	
			




					 	
						
  			
		


 


public class TigerKrionRunner {

}	


