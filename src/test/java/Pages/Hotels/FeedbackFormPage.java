package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;

import java.util.Set;
import java.util.logging.XMLFormatter;

public class FeedbackFormPage extends Commands {

//Locators for TC24
  By feedbackFormlocator = By.xpath("//div[text()='Feedback']");
  By submitButtonLocator = By.xpath("//button[@id='submit-button']");
  By verMessageDisplayedLocator = By.xpath("//p[text()='Please fill in the required information highlighted below.']");
  By redDottedBoxLocator = By.xpath("//*[contains(@style,'2px dotted')]");

// Locators for TC25
  By selectStarLocator = By.xpath("//label[@for='page-rating-4']");
  By enterCommentsBoxlocator = By.xpath("//textarea[@id='verbatim']");
  By dropDownLocator = By.xpath("//select[@id='will-you-return']");
  By selectYesLocator = By.xpath("//span[@data-localization='booked-before-yes']");
  By selectNoLocator = By.xpath("//span[@data-localization='were-you-successful-no']");
  By submitButtnLocator = By.xpath("//button[@id='submit-button']");
  By verifyMessageLocator = By.xpath("//h5[text()='THANK YOU FOR YOUR FEEDBACK.']");

// Methods for TC25
 public void selectStarBox(){
     clickIt(selectStarLocator);
 }
 public void enterComment(String value){
     type(enterCommentsBoxlocator, value);
 }
 public void clickDropDownOption(){
     clickIt(dropDownLocator);
     selectInDropdown(dropDownLocator,"Somewhat likely");
 }
 public void selectYesOption(){
     clickIt(selectYesLocator);
 }
 public void selectNoOption(){
     clickIt(selectNoLocator);
 }
 public void clickSubmitButton(){
     clickIt(submitButtnLocator);
 }
 public boolean verifyMessagDisplayed(){
     return isElementDisplayed(verifyMessageLocator);
 }











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
      //System.out.println(MyDriver.getDriver().getCurrentUrl());
      Misc.pause(3);
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
