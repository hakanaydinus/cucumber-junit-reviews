package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",       // we paste path of features folder
        glue = "com/cydeo/step_definitions"   // this is step_definitions folder path

)

public class FailedTestRunner {
}
