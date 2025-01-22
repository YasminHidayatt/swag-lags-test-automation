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
@ConfigurationProperties(prefix = "data")
public class ProductProperties {

  private Map<String, Product> product;

  public Product getProduct(String key){
    return product.get(key);
  }

  @Data
  @Component
  public static class Product{
    private String productName;
    private float productPrice;
  }

}
