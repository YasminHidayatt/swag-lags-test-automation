package com.swaglags.automation.steps.Dashboard;

import com.swaglags.automation.BaseFactory;
import com.swaglags.automation.properties.ProductProperties;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
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
  public void userShouldSeeNameOnDashboardPage(String product){
    ProductProperties.Product productData = productProperties.getProduct(product);
    Assert.assertEquals(productData.getProductName(),dashboardPage.getProductName());
  }

  @When("user should see button filter on Dashboard Page")
  public void userShouldSeeButtonFilterOnDashboardPage(){
  }

  @And("user should see {string} price on Dashboard Page")
  public void userShouldSeePriceOnDashboardPage(String product){
    ProductProperties.Product productData = productProperties.getProduct(product);
    Assert.assertEquals(productData.getProductPrice(), dashboardPage.getProductPriceToFloat());
//    testingData.setProductPrice(productData.getProductPrice());
  }


  @When("user could be atc product on Dashboard Page")
  public void userCouldBeAtcProductOnDashboardPage(){
    dashboardPage.clickButtonAtc();
  }

  @Then("user should see count {string} product in icon basket on Dashboard Page")
  public void userShouldSeeCountProductInIconBasketOnDashboardPage(String count){
    Assert.assertEquals(count, dashboardPage.getCountProduct());
  }

  @When("user could choose filter by {string} in dropdown filter on Dashboard Page")
  public void userCouldChooseFilterByInDropdownFilterOnDashboardPage(String typeFilter){
    dashboardPage.clickButtonFiler();
    dashboardPage.selectFilterByDropDown(typeFilter);
    }

  @Then("user should see product name after filter by asc on Dashboard Page")
  public void userShouldSeeProductNameAfterFilterByAscOnDashboardPage(DataTable dataTable){
    List<String> productList = dataTable.asList();
    for (int i = 0; i < productList.size(); i++){
      Assert.assertEquals(productList.get(i++), dashboardPage.getListProductName().get(i++));
    }
  }

  @Then("user should see product name after filter by desc on Dashboard Page")
  public void userShouldSeeProductNameAfterFilterByDescOnDashboardPage(DataTable dataTable){
    List<String> productList = dataTable.asList();
    for (int i = 0; i < productList.size(); i++){
      Assert.assertEquals(productList.get(i++), dashboardPage.getListProductName().get(i++));
    }
  }

  @Then("user should see product price after filter by price on Dashboard Page")
  public void userShouldSeeProductPriceAfterFilterByPriceOnDashboardPage(DataTable dataTable){
    List<String> listProductPrice = dataTable.asList();
    for (int index = 0; index <listProductPrice.size(); index++){
      Assert.assertEquals(listProductPrice.get(index), dashboardPage.getListProductPrice().get(index));
    }
  }

  @When("user click product on Dashboard Page")
  public void userClickProductOnDashboardPage(){
    dashboardPage.clickProduct();
  }
}
