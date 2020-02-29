package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith( Cucumber .class)
    @CucumberOptions(  // features and glue specifications have to be here

            features = "src/test/resources/features",  //we are connecting features to features folder in the framework
            glue = "step_definitions",  //specifiying steps definitions here specifications make connection between code and steps
            plugin = "html:target/cucumber-reports",  // it generates html reports in target folder
            dryRun = false,  //  you use dryRun = true do not execute the steps to see required implementations you can copy and implement in stepDefs
//by default dryRun is false it means run the scenario and execute the steps
            tags = "@configSalesChannel" // when you want to run specific scenario

    )

    public class CukesRunner{



    }



