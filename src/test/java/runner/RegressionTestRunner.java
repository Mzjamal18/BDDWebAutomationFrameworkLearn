package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/features",
        glue ={"stepDefinitions","configuration.hooks"},
        monochrome = true,
        publish = true,
        dryRun = false,
        plugin = {
                "pretty",
                "html:target/cucumber-reports/index.html",
                "json:target/cucumber-reports/cucumber-report.json",
                "junit:target/cucumber-reports/cucumber-results.xml",
                "pretty:target/cucumber-reports/cucumber-pretty.txt",
                "rerun:target/cucumber-reports/rerun.txt"
        },
        tags = "@RegressionTest and not @pending"
)

public class RegressionTestRunner extends AbstractTestNGCucumberTests {
}
