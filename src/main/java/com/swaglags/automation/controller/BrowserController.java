package com.swaglags.automation.controller;

import io.cucumber.java.After;
import io.cucumber.spring.ScenarioScope;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.stereotype.Component;


@Component
public class BrowserController {

  public static WebDriver driver;


  public void setUp() {
    WebDriverManager.firefoxdriver().setup();
    driver = new FirefoxDriver();
    driver.get("https://www.saucedemo.com/");
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