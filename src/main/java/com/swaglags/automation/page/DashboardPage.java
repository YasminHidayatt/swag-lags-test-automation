package com.swaglags.automation.page;

import com.swaglags.automation.base.BasePageObject;
import com.swaglags.automation.locator.DashboardLocator;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebElement;
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

  public String getCountProduct(){
    return getText(COUNT_PRODUCT);
  }

  public void selectFilterByDropDown(String selectFilter){
    findAllElement(DROPDOWN_FILTER).stream().filter(f->f.getText().equalsIgnoreCase(selectFilter))
        .findFirst().get().click();
  }

  public void clickButtonFiler(){
    click(BUTTON_FILTER);
  }

  public List<String> getListProductName(){
    return findAllElement(LABEL_PRODUCT_NAME).stream().map(WebElement::getText)
        .collect(Collectors.toList());
  }

  public List<String> getListProductPrice() {
    return findAllElement(LABEL_PRODUCT_PRICE).stream()
        .map(WebElement::getText)
        .map(price -> price.replace("$", ""))
        .collect(Collectors.toList());
  }

  public void clickProduct(){
    findAllElement(LABEL_PRODUCT_NAME).get(0).click();
  }
}
