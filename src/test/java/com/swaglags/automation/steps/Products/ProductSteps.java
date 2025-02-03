package com.swaglags.automation.steps.Products;

import com.swaglags.automation.BaseFactory;
import com.swaglags.automation.properties.ProductProperties;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductSteps extends BaseFactory {

  @When("user click button add to cart on Product Detail Page")
  public void userClickButtonAddToCartOnProductDetailPage(){
    productPage.clickButtonATC();
  }

  @And("user should see {string} name on Product Detail Page")
  public void userShouldSeeNameOnProductDetailPage(String productName){
    ProductProperties.Product productData = productProperties.getProduct(productName);
    Assert.assertEquals(productData.getProductName(),productPage.getProductName());
  }

  @And("user should see button Add to cart on Product detail Page")
  public void userShouldSeeButtonAddToCartOnProductDetailPage(){
    Assert.assertTrue(productPage.isDisplayedButtonATC());
  }
}
