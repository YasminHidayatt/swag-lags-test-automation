package com.swaglags.automation.page;

import com.swaglags.automation.base.BasePageObject;
import com.swaglags.automation.locator.DashboardLocator;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.springframework.stereotype.Component;

@Component
public class DashboardPage extends BasePageObject implements DashboardLocator {

  public Boolean isDisplayedHeaderPage(){
    try {
      return isDisplayed(LABEL_TITLE_HEADER);
    } catch (Exception e){
      return false;
    }
  }

  public void clickButtonAtc(){
    findAllElement(BUTTON_ATC).get(0).click();
  }

  public String getProductName(){
    waitUntilPresent(LABEL_PRODUCT_NAME);
    return getText(LABEL_PRODUCT_NAME);
  }

  public List<Boolean> listProductName(){
    return findAllElement(LABEL_PRODUCT_NAME).stream()
        .map(WebElement::isDisplayed).collect(Collectors.toList());
  }

  public Float getProductPrice(){
    return dollarNormalizer(LABEL_PRODUCT_PRICE);
  }
  public String getSubTile(){
    return getText(LABEL_SECONDARY_HEADER);
  }

  public void clickIconCart(){
    click(ICON_CART);
  }
}
