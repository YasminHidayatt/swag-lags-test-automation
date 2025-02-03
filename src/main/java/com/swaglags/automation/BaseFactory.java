package com.swaglags.automation;


import com.swaglags.automation.page.CartPage;
import com.swaglags.automation.page.DashboardPage;
import com.swaglags.automation.page.LoginPage;
import com.swaglags.automation.page.OrderSummaryPage;
import com.swaglags.automation.page.ProductPage;
import com.swaglags.automation.properties.AccountProperties;
import com.swaglags.automation.properties.ProductProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseFactory {
  @Autowired
  protected CartPage cartPage;
  @Autowired
  protected DashboardPage dashboardPage;
  @Autowired
  protected OrderSummaryPage orderSummaryPage;
  @Autowired
  protected AccountProperties  accountProperties;
  @Autowired
  protected LoginPage loginPage;
  @Autowired
  protected ProductProperties productProperties;
//  @Autowired
//  protected TestingData testingData;

  @Autowired
  protected ProductPage productPage;


}
