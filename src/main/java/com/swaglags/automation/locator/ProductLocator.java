package com.swaglags.automation.locator;

import org.openqa.selenium.By;

public interface ProductLocator {
  By LABEL_PRODUCT_PRICE = By.xpath("//div[@class='inventory_details_desc large_size']/following-sibling::div[1]");
  By LABEL_PRODUCT_NAME  = By.xpath("//div[@data-test='inventory-item-name']");
  By IMG_PRODUCT = By.className("inventory_details_img");
  By BUTTON_ATC = By.xpath("//button[@data-test='add-to-cart']");


}
