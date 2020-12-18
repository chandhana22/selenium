package com.bdd.example.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
				 glue = "com.bdd.example.steps", 
				 monochrome = true, 
				 plugin = { "pretty","json:target/cucumber-jvm-report/cucumber.json" })
public class TestRunner {

}
