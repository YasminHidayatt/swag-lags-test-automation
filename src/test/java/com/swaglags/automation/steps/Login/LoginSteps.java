package com.swaglags.automation.steps.Login;

import com.swaglags.automation.BaseFactory;

import com.swaglags.automation.controller.BrowserController;
import com.swaglags.automation.properties.AccountProperties;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class LoginSteps extends BaseFactory {

  @Autowired
  BrowserController browserController;

  @Given("user open browser to url swag lags")
  public void userOpenBrowserToUrlSwaglags() {
    browserController.runTest();
    Assert.assertTrue(loginPage.isDisplayedLoginSection(), "Login section is not displayed.");
  }

  @And("user login to web application with {string} on Login Page")
  public void userLoginToWebApplicationWithOnLoginPage(String accountKey){
    AccountProperties.Account testUser = accountProperties.getAccount(accountKey);
    loginPage.inputUsername(testUser.getUserName());
    loginPage.inputPassword(testUser.getPassword());
    loginPage.clickButtonLogin();
  }

  @Given("user on Login Page")
  public void userOnLoginPage(){
    Assert.assertTrue(loginPage.isDisplayedLoginSection());
  }

  @And("user Input username {string} on Login Page")
  public void userInputUsernameOnLoginPage(String username){
    AccountProperties.Account user = accountProperties.getAccount(username);
    loginPage.inputUsername(user.getUserName());
  }

  @And("user Input password {string} on Login page")
  public void userInputPasswordOnLoginPage(String password){
    AccountProperties.Account user = accountProperties.getAccount(password);
    loginPage.inputPassword(user.getPassword());
  }

  @Then("user succes login with credential application")
  public void userSuccesLoginWithCredentialApplication(){
    Assert.assertTrue(dashboardPage.isDisplayedHeaderPage());
  }

  @When("user click button login on Login Page")
  public void  userClickButtonLoginOnLoginPage(){
    loginPage.clickButtonLogin();
  }

}
