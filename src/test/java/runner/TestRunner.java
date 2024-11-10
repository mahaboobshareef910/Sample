package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resourcesSJ\\SignIn.feature",
                  glue={"StepDefinationSJ","hooksSJ"},
                   publish=true,
                   plugin= {"pretty","html:target/CucumberReportSJ.html"})
public class TestRunner {
    
}
