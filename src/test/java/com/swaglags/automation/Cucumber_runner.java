package com.swaglags.automation;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
import org.junit.BeforeClass;

@CucumberOptions(
    glue = {"com.swaglags.automation.steps"},
    features = {"src/test/resources/features"},
    plugin = {"json:build/cucumber1.json", "pretty"},
    stepNotifications = true,
    tags = "",
    publish = true
)

public class Cucumber_runner extends AbstractTestNGCucumberTests {
  @BeforeClass
  public static void beforeClass() {
    // Initialization code if needed
  }

  @Override
  public Object[][] scenarios() {
    return super.scenarios();
  }

  @AfterClass
  public static void afterClass() {
    // Cleanup code if needed
  }
}
