package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/parallel-cucumber4.json",
        },
        features = "src/test/resources/features/lostreasons.feature",
        glue = "step_definitions"

)
public class LostReasonsParallelRunner {
}

