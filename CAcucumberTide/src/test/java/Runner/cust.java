package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\hi\\eclipse-workspace\\CAcucumberTide\\Features",
		glue="stepdefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:Reports/report.html"}
		
		)
public class cust {

}
