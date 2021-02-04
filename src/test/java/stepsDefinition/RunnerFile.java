package stepsDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\OpenHMR.feature",
glue= "stepsDefinition"
)




public class RunnerFile {
	
	

}
