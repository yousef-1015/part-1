package fitness24;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "useCases//program_monitoring.feature", glue = "fitness24")
public class cucumbertestrunner {

}
