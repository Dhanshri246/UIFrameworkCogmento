package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="src/test/java/FeatureFiles/Cogmento.feature",
		glue= {"Steps"},
		dryRun=false,
		monochrome=false	
		
		)


public class Runner extends AbstractTestNGCucumberTests{


}
