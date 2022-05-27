package Test.Darksky;

import Helper.Misc;
import Pages.Darksky.LandingPage;
import Web.MyDriver;
import io.cucumber.java.jv.Lan;
import io.cucumber.plugin.event.TestSourceParsed;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;

import static Web.MyDriver.getDriver;

public class LandingPageTest {

     @Test
       public void darkskyTest(){
         LandingPage test = new LandingPage();
         test.dSkyLandingPage();
         Misc.pause(2);

         test.scrollToTimeMachineBypixel();

         Misc.pause(5);
         Assert.assertEquals(test.dateFromTimeMachine(), test.verifyTodayDate(), "not equal");
         test.quitDarksky();
     }

     @Test
       public void darkskyTest2() {
         LandingPage test1 = new LandingPage();
         test1.dSkyLandingPage();
         Misc.pause(1);

         test1.scrollToTodayBarBypixel();
         Misc.pause(2);
         test1.clickTodayBar();

         Assert.assertEquals(test1.findMinTemp(),test1.findLowTemp(), "Is not equal");
         Assert.assertEquals(test1.findMaxTemp(), test1.findHighTemp(),"Is not equal");
         test1.quitDarksky();
     }


}

