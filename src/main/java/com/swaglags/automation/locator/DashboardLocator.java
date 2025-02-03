package com.swaglags.automation.locator;

import org.openqa.selenium.By;

public interface DashboardLocator {
  By LABEL_TITLE_HEADER = By.xpath("//div[text()='Swag Labs']");
  By ICON_CART  = By.xpath("//a[@data-test='shopping-cart-link']");
  By BUTTON_MENU = By.xpath("//button[@type='button']");
  By LABEL_PRODUCT_NAME = By.xpath("//div[@data-test='inventory-item-name']");
  By LABEL_PRODUCT_PRICE = By.xpath("//div[@class='inventory_item_price']");
  By BUTTON_ATC = By.xpath("//div[@data-test='inventory-item-price']");
  By BUTTON_FILTER = By.xpath("//div[@class='right_component']//span");
  By DROPDOWN_FILTER = By.xpath("//select[@data-test='product-sort-container']/option");
  By COUNT_PRODUCT  = By.xpath("//span[@data-test='shopping-cart-badge']");
  By LABEL_SECONDARY_HEADER = By.xpath("//div[@data-test='secondary-header']//span");

}
