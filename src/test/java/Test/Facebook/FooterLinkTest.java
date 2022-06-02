package Test.Facebook;

import Helper.Misc;
import Pages.Facebook.LandingPage;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class FooterLinkTest{
    @Test
       public void launchMultipleWindowhandles() {
        MyDriver.launchUrlOnNewWindow("https://www.facebook.com/");

        LandingPage obj = new LandingPage();
        obj.clickLinks();
        obj.enhancedLoop();

        Assert.assertFalse(MyDriver.getDriver().findElement(By.xpath("//button[@disabled]")).isEnabled());
        MyDriver.quitWindows();
    }

}

