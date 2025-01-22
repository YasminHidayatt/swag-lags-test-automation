package com.swaglags.automation;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberContextConfiguration
@CucumberOptions(
    glue = {"com.swaglags.automation"},
    features = {"src/test/resources/features"},
    plugin = {"json:build/cucumber1.json", "pretty"},
    stepNotifications = true,
    tags = "",
    publish = true
)

public class Cucumber_runner extends AbstractTestNGCucumberTests {
  @BeforeClass
  public static void beforeClass() {

  }
  @AfterClass
  public static void afterClass(){

  }
}
