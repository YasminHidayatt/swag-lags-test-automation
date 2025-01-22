package com.swaglags.automation.page;

import com.swaglags.automation.base.BasePageObject;
import com.swaglags.automation.locator.LoginLocator;
import org.springframework.stereotype.Component;

@Component
public class LoginPage extends BasePageObject implements LoginLocator {

  public void inputUsername(String account){
    input(INPUT_USERNAME,account);
  }

  public void inputPassword(String password){
    input(INPUT_PASSWORD,password);
  }

  public void clickButtonLogin(){
    click(BUTTON_LOGIN);
  }

  public Boolean isDisplayedLoginSection() {
    try {
      return isDisplayed(INPUT_USERNAME);
    } catch (Exception e) {
      return false;
    }
  }
}
