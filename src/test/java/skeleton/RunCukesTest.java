package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/skeleton/total.feature",glue="cucumber-project-skeleton1",plugin="json:target\\Jsonreport.json")
public class RunCukesTest {

}
