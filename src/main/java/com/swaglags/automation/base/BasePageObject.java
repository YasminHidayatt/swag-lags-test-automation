package com.swaglags.automation.base;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.swaglags.automation.controller.BrowserController.driver;

public class BasePageObject {

  public WebDriver getDriver(){
    return driver;
  }

  public WebElement find(By locator){
    return getDriver().findElement(locator);
  }

  public void click(By locator){
    find(locator).click();
  }

  public void input(By locator, String value){
    WebElement element = find(locator);
    element.sendKeys(value);
  }

  public String getText(By locator){
    return find(locator).getText();
  }

  public Boolean isDisplayed(By locator){
    return find(locator).isDisplayed();
  }

  public List<WebElement> findAllElement(By locator){
    return getDriver().findElements(locator);
  }

  public void waitUntilPresent(By locator){
    WebDriverWait wait = new WebDriverWait(driver, 15);
    wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
  }

  public Float dollarNormalizer(By locator){
    return Float.parseFloat(getText(locator).replace("$",""));
  }
}
