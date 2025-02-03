package com.swaglags.automation.page;

import com.swaglags.automation.base.BasePageObject;
import com.swaglags.automation.locator.OrderSummaryLocator;
import org.springframework.stereotype.Component;

@Component
public class OrderSummaryPage extends BasePageObject implements OrderSummaryLocator {

  public void inputFistName(){
    input(INPUT_FISTNAME, "TEST");
  }

  public void inputLasName(){
    input(INPUT_LASTNAME, "test2");
  }

  public void portalCode(){
    input(INPUT_PORTAL_CODE,"12345");
  }

  public void clickButtonContinue(){
    click(BUTTON_CONTINUE);
  }

}
