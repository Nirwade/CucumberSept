package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
		
		plugin= {"html:target/html-cucumber"},

		features= "src/test/java/features",
		tags= {"@Sanity"},  // to run the single tags
		
		//tags= {"@Sanity , @Regression"}, // to run multiple tags(scenarios) using  // {"@Sanity or @Regression"}
		// here we are using OR condition
		
				// tags= {"@Sanity", "@Rapid"},
		
			                    // tags= {"@Sanity", "@Rapid"} ==> @Rapid to execute most imp test cases 
		                           // here we are using And condition // {"@Sanity and @Regression"}
				  
	  //tags= {"@Sanity or (@Regression and @Rapid)"}
	//To run both sanity and rapid regression we can use the above annotation
	// this logic will work on multiple feature files as well		
		
		//tags={"@Unit and not @Ignore"}, // executes @unit and skips @ignore scenarios
				  
		glue= {"stepDefs"}
		
		
		//cmd to run specific tags from command line : mvn test -Dcucumber.options="--tags @Sanity"
		//to change tag value from cmd we use
		
)

public class TestRunner {

}