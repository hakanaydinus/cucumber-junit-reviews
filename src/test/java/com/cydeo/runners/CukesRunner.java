package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumbers-report.html",   //this generates default cucumber html report
                "rerun:target/rerun.txt",                //this generates rerun.txt for keep tracking of failed tests
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",//this plugin generates the "MAVEN CUCUMBER REPORTING"
                "pretty"                                //used to print out additional information about the scenario currently executed
        },

        features = "src/test/resources/features",       // we paste path of features folder
        glue = "com/cydeo/step_definitions",            // this is step_definitions folder path
        tags = "@invalidLoginWithParamsSceOutLine",     // it will run only tags of our choice
        dryRun = false,                                 // in order to get just snippets by making it true.
        publish = true                                  // in order to generate public link for reports

)

public class CukesRunner {
}
