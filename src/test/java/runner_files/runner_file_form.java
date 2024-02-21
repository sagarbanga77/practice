package runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="C:\\Users\\Thrillophilia\\eclipse-workspace\\Cucumb_TestNG_Project\\src\\test\\resources\\form\\simple_form.feature"
,glue="step_def_files")

//tags = "@tag1"
public class runner_file_form extends AbstractTestNGCucumberTests{

}
