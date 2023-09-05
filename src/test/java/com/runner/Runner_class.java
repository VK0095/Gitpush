package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "E:\\Vinod Java\\Lime_Road_Project\\src\\test\\java\\com\\features\\lime.feature", 
							glue = "com.step", 
//							monochrome = true, 
//							dryRun = false,
//							strict = true,
					        //tags = "smoke",
							plugin ={"pretty",
							"json:Reso/lime.json",
							"html:Res/limeroad.html",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							})
public class Runner_class extends Baseclass {

	@BeforeClass
	public static void Launch_Browser() {
		Launch_Browser("Chrome");
	}

	
	
	
}

