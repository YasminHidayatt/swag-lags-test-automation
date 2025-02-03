package com.swaglags.automation.page;

import com.swaglags.automation.base.BasePageObject;
import com.swaglags.automation.locator.ProductLocator;

public class ProductPage extends BasePageObject implements ProductLocator {

  public String getProductName(){
    return getText(LABEL_PRODUCT_NAME);
  }
  public String getProductPrice(){
    return getText(LABEL_PRODUCT_PRICE);
  }

  public void clickButtonATC(){
    click(BUTTON_ATC);
  }

  public Boolean isDisplayedImageProduct(){
    try {
      return isDisplayed(IMG_PRODUCT);
    } catch (Exception e){
      return false;
    }
  }

  public Boolean isDisplayedButtonATC(){
    try {
      return isDisplayed(BUTTON_ATC);
    } catch (Exception e){
      return false;
    }
  }

}
