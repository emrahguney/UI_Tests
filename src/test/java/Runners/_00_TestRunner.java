package Runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = false

)



public class _00_TestRunner {

}
