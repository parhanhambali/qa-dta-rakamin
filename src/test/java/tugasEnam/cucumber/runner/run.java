package tugasEnam.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/tugasEnam/cucumber/resources/features",
        glue = "tugasEnam.cucumber.stepDef",
        plugin = {"html:target/HTML_report.html"}
)
public class run {
}
