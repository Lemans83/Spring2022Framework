package Pages.Facebook;

import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Set;

public class LandingPage extends Commands {

    // Variables (Locators)
    By loginEmailLocator = By.id("email");
    By loginPassLocator = By.id("pass");
    By loginButtonLocator = By.tagName("button");
    By createNewAccountBtnLocator = By.xpath("//a[@data-testid='open-registration-form-button']");

    By fbLink = By.xpath("//a[text()='Facebook Pay']");
    By oculLink = By.xpath("//a[text()='Oculus']");
    By instagramLink = By.xpath("//a[text()='Instagram']");
    By portalLink = By.xpath("//a[text()='Portal']");
    By bulletinLink = By.xpath("//a[text()='Bulletin']");


    // Methods (to interact with webElements present on this webpage)
    public void clickLinks (){
        clickIt(fbLink);
        clickIt(oculLink);
        clickIt(instagramLink);
        clickIt(portalLink);
        clickIt(bulletinLink);
    }

    public void enhancedLoop(){
        Set<String> windowID = MyDriver.getDriver().getWindowHandles();
        String instagramID = "";
        for (String id : windowID) {
            MyDriver.getDriver().switchTo().window(id);
            Misc.pause(3);
            if (MyDriver.getDriver().getTitle().equalsIgnoreCase("instagram")) {
                instagramID = MyDriver.getDriver().getWindowHandle();
            }
            if (!MyDriver.getDriver().getTitle().equalsIgnoreCase("instagram")) {
                MyDriver.getDriver().close();
            }
        }
        MyDriver.getDriver().switchTo().window(instagramID);
    }

    public void enterLoginEmail(String loginEmail) {
        // MyDriver.getDriver().findElement(loginEmailLocator).sendKeys(loginEmail);
        type(loginEmailLocator, loginEmail);
    }

    public void enterLoginPassword(String loginPwd) {
        // MyDriver.getDriver().findElement(loginPassLocator).sendKeys(loginPwd);
        type(loginPassLocator, loginPwd);
    }

    public void clickLoginButton() {
        // MyDriver.getDriver().findElement(loginButtonLocator).click();
        clickIt(loginButtonLocator);
    }

    public void clickCreateNewAccountBtn() {
        // MyDriver.getDriver().findElement(createNewAccountBtnLocator).click();
        clickIt(createNewAccountBtnLocator);
    }

    public boolean isLoginBtnEnabled() {
        return MyDriver.getDriver().findElement(loginButtonLocator).isEnabled();
    }

    public boolean isCreateNewAccountBtnEnabled() {
        return isElementEnabled(createNewAccountBtnLocator);
    }

}
