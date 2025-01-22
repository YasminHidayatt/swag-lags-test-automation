package com.swaglags.automation.properties;

import java.util.Map;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "account")
public class AccountProperties {

  private Map<String, Account> service;

  public Account getAccount(String key) {
    return service.get(key);
  }

  @Data
  @Component
  public static class Account {

    private String userName;
    private String password;
  }
}