package com.swaglags.automation.controller;

import io.cucumber.java.After;
import io.cucumber.spring.ScenarioScope;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserController {

  public static WebDriver driver;

  public void setUp() {
    WebDriverManager.firefoxdriver().setup();
    driver = new FirefoxDriver();
    try {
      driver.get("https://www.saucedemo.com/");
    } catch (Exception e) {
      driver.get("https://www.saucedemo.com/");
    }
  }
  @After
  public void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  @ScenarioScope
  public void runTest() {
    try {
      setUp();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
