package Pages.Hotels;

import Pages.Commands;
import org.openqa.selenium.By;

public class SearchPage extends Commands {

//Task5
//Locator
  By searchLocator = By.xpath("//button[@id='undefined__btn']");

// Method
  public String returnAfter(){
      String var = findWebElement(searchLocator).getText().split(", ")[1];
      return var;
  }

}
