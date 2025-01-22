package com.swaglags.automation.steps.Dashboard;

import com.swaglags.automation.BaseFactory;
import com.swaglags.automation.properties.ProductProperties;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DashboardSteps extends BaseFactory {

  @Given("user on Dashboard Page")
  public void userOnDashboardPage(){
    Assert.assertTrue(dashboardPage.isDisplayedHeaderPage());
  }

  @And("user should see title {string} on Dashboard Page")
  public void userShouldSeeTitleOnDashboardPage(String textSecondary){
    Assert.assertEquals(textSecondary,dashboardPage.getSubTile());
  }

  @Then("user should see list item product catalog on Dashboard Page")
  public void userShouldSeeListItemProductCatalogOnDashboardPage(){
    for (Boolean item : dashboardPage.listProductName()){
      Assert.assertTrue(item);
    }
  }

  @And("user should see {string} name on Dashboard Page")
  public void userShouldseeNameOnDashboardPage(String product){
    ProductProperties.Product productData = productProperties.getProduct(product);
    Assert.assertEquals(productData.getProductName(),dashboardPage.getProductName());
  }

  @When("user should see button filter on Dashboard Page")
  public void userShouldSeeButtonFilterOnDashboardPage(){
  }

  @And("user should see {string} price on Dashboard Page")
  public void userShouldSeePriceOnDashboardPage(String product){
    ProductProperties.Product productData = productProperties.getProduct(product);
    Assert.assertEquals(productData.getProductPrice(), dashboardPage.getProductPrice());
  }

  @When("user could be atc product on Dashboard Page")
  public void userCouldBeAtcProductOnDashboardPage(){
    dashboardPage.clickButtonAtc();
  }
}
