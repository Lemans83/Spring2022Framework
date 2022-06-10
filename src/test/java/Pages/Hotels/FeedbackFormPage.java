package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;

import java.util.Set;

public class FeedbackFormPage extends Commands {

//Locators for TC24
  By feedbackFormlocator = By.xpath("//div[text()='Feedback']");
  By submitButtonLocator = By.xpath("//button[@id='submit-button']");
  By verMessageDisplayedLocator = By.xpath("//p[text()='Please fill in the required information highlighted below.']");
  By redDottedBoxLocator = By.xpath("//*[contains(@style,'2px dotted')]");

// Methods for TC24
  public void clickfeedbacklink(){
      clickIt(feedbackFormlocator);

      String parentWindowHandle = MyDriver.getDriver().getWindowHandle();
      Set<String> allWindowHandles = MyDriver.getDriver().getWindowHandles();
      for (String handle : allWindowHandles) {
          if (!handle.equalsIgnoreCase(parentWindowHandle)) {
              MyDriver.getDriver().switchTo().window(handle);
          }
      }
      System.out.println(MyDriver.getDriver().getCurrentUrl());
  }

  public void scrollDownSubmitButton(){
      scrollToElementIntoView(submitButtonLocator);
      Misc.pause(3);
  }

  public void clickSubmitBtn() {
      clickIt(submitButtonLocator);
  }

  public boolean verifyMessIsDisplayed(){
      return isElementDisplayed(verMessageDisplayedLocator);
  }

  public boolean redDottedLine(){
      return isElementDisplayed(redDottedBoxLocator);
 }








}
