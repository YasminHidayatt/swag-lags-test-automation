package com.swaglags.automation.locator;

import org.openqa.selenium.By;

public interface LoginLocator {
  By LABEL_HEADER_LOGIN = By.xpath("//div[@class='login_container']//div");
  By INPUT_USERNAME = By.xpath("//input[@placeholder='Username']");
  By INPUT_PASSWORD = By.xpath("//input[@placeholder='Password']");
  By BUTTON_LOGIN = By.xpath("//input[@value='Login']");
  By LABEL_LOG_ERROR = By.xpath("//div[@class='error-message-container error']");
}
