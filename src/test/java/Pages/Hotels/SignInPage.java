package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SignInPage extends Commands {
    // Locator for TC21
    By signInPageLocator = By.xpath("//a[text()='Sign in']");
    By enterInvalidEmailLocator = By.xpath("//input[@id='loginFormEmailInput']");
    By enterPasswordLocator = By.xpath("//input[@id='loginFormPasswordInput']");
    By clickSignInLocator = By.xpath("//button[@id='loginFormSubmitButton']");
    By verfMessagelocator = By.xpath("//h3[@class='uitk-error-summary-heading']");

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

    public void clickSingInButton(){
        clickIt(clickSignInLocator);
    }

    public boolean verifyInvalidMessageIsDisplayed(){
     return isElementDisplayed(verfMessagelocator);
   }


}