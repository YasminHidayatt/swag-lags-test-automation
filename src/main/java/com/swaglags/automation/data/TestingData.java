package com.swaglags.automation.data;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class TestingData {

  public Float ProductPrice;
  public Float Tax;
  public Float TotalAmount;
  public Integer Quantity;

}
