package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SignInPage extends Commands {
  // Locator for TC21
    By signInPageLocator = By.xpath("//a[text()='Sign in']");
    By enterInvalidEmailLocator = By.xpath("//*[@id='loginFormEmailInput']");
    By enterPasswordLocator = By.xpath("//*[@id='loginFormPasswordInput']");
    By clickSignInLocator = By.xpath("//button[@id='loginFormSubmitButton']");
    By verfMessagelocator = By.xpath("//h3[@class='uitk-error-summary-heading']");

  // Locator for TC22
    By entEmailLocator = By.xpath("//input[@id='signupFormEmailInput']");
    By invalidEmailMessageLocator = By.xpath("//div[@id='signupFormEmailInput-error']");
    By invalidNameLocator = By.xpath("//input[@id='signupFormFirstNameInput']");
    By invalidLastNameLocator = By.xpath("//input[@id='signupFormLastNameInput']");
    By invalidPasswordlocator = By.xpath("//input[@id='signupFormPasswordInput']");
    By invalidFirstNameLocator = By.xpath("//div[@id='signupFormFirstNameInput-error']");
    By keepMysignedInlocator = By.xpath("//span[@class='uitk-flex-item uitk-flex-shrink-0 uitk-switch-control']");
    By conitnueButtonLocator = By.xpath("//button[@id='signupFormSubmitButton']");
    By firstNameInputLocator = By.xpath("//*[@id='signupFormFirstNameInput']");
    By lastNameInputLocator = By.xpath("//*[@id='signupFormLastNameInput']");



    // Methods for TC 22
    public void enterEmail(String value){
        clickIt(entEmailLocator);
        MyDriver.getDriver().findElement(entEmailLocator).sendKeys(value);
    }

    public boolean invalidErrorEmail(){
        return isElementDisplayed(invalidEmailMessageLocator);
   }
    public void enterInvalidName(String value){
        type(invalidNameLocator, value);
  }
    public void enterLastName(String value){
        type(invalidLastNameLocator, value);
  }
    public void invalidPassword(String value){
        type(invalidPasswordlocator, value);
  }
    public boolean errorNameDisplayed(){
        return isElementDisplayed(invalidFirstNameLocator);
   }
    public boolean signedInCheckBox(){
        return isElementEnabled(keepMysignedInlocator);
   }
    public boolean continueButtonDisabled(){
        return isElementEnabled(conitnueButtonLocator);
   }







    // Methods for TC21
    public void singInButton(){
        clickIt(signInPageLocator);
    }

    public void enterInvalidEmail(String value) {
        MyDriver.getDriver().findElement(enterInvalidEmailLocator).sendKeys(value);
    }

    public void enterLoginPassword(String value) {
        MyDriver.getDriver().findElement(enterPasswordLocator).sendKeys(value);
    }

    public void enterFirstName(String firstName) {
        type(firstNameInputLocator, firstName);
    }

    public void enterLastName2(String lastName) {
        type(lastNameInputLocator, lastName);
    }

    public void clickSingInButton(){
        clickIt(clickSignInLocator);
    }

    public boolean verifyInvalidMessageIsDisplayed(){
     return isElementDisplayed(verfMessagelocator);
   }


}