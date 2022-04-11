package com.basic.dataTableSD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		stepNotifications = true,
		//publish=false,
		monochrome=true,
		//dryRun=true,
		tags="@Smoke",
		features= {"src/test/resources/com/basic/dataTableFF/"},
		glue={"com/basic/dataTableSD"},
								
		plugin={"pretty",
				"html:target/cucumber-htmlreport4.html",
				"json:target/cucumber-report4.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/Extent_report4.html"
		}
		
		)
public class RundataTableTest {

}
