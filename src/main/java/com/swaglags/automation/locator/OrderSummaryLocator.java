package com.swaglags.automation.locator;

import org.openqa.selenium.By;

public interface OrderSummaryLocator {

  By INPUT_FISTNAME = By.xpath("//input[@data-test='firstName']");
  By INPUT_LASTNAME = By.xpath("//input[@data-test='lastName']");
  By INPUT_PORTAL_CODE = By.xpath("//input[@data-test='postalCode']");
  By BUTTON_CONTINUE = By.xpath("//input[@data-test='continue']");
  By LABEL_PRODUCT_QTY = By.xpath("//div[@data-test='item-quantity']");
  By LABEL_SUBTOTAL_PRODUCT = By.xpath("//div[@data-test='inventory-item-price']");
  By LABEL_TAX = By.xpath("//div[@data-test='tax-label']");
  By LABEL_TOTAL_AMOUNT = By.xpath("//div[@data-test='total-label']");
  By BUTTON_FINISH = By.xpath("//button[@data-test='finish']")
  By LABEL_SUCCES_ORDER = By.xpath("//h2[@data-test='complete-header']");
}
