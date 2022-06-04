package Pages.Darksky;

import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

import static Web.MyDriver.getDriver;

public class LandingPage extends Commands {


    // My Xpaths
    By todayBar = By.xpath("(//span[@class='bar'])[1]");
    By findMinTemp = By.xpath("(//span[@class='minTemp'])[1]");
    By findMaxTemp = By.xpath("(//span[@class='maxTemp'])[1]");
    By findHighTemp = By.xpath("(//span[@class='maxTemp'])[1]");
    By findLowTemp = By.xpath("(//*[@class='lowTemp swap'])[1]//span[1]");

    //My methods
    public void clickTimeMcahine(){
        findWebElement(By.xpath("//a[text()='Time Machine']")).click();
    }

    public String dateFromTimeMachine(){
        //findWebElement(By.xpath("//a[text()='Time Machine']")).click();
        String currentDate = findWebElement(By.xpath("//td[@class='is-today']")).getText();
        //System.out.println(currentDate);
        return currentDate;
    }

    public String verifyTodayDate(){
        Date td = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("d");
        String today = sdf.format(td);
        return today;
    }

    public void dSkyLandingPage() {
        MyDriver.launchUrlOnNewWindow("https://www.darksky.net");
    }

    public void quitDarksky() {
        MyDriver.quitWindows();
    }

    public void scrollToTimeMachineBypixel() {
        JavascriptExecutor scrollBypixel = (JavascriptExecutor) getDriver();
        scrollBypixel.executeScript("scrollBy(0,900)");
    }

    public void scrollToTodayBarBypixel() {
        JavascriptExecutor scrollByPix = (JavascriptExecutor) getDriver();
        scrollByPix.executeScript("scrollBy(0,800)");
    }

    public void clickTodayBar() {
        findWebElement(todayBar).click();
    }

    public String findMinTemp() {
        String tempSplit = findWebElement(By.xpath("(//span[@class='minTemp'])[1]")).getText();
        String temBar = tempSplit.split("˚")[0];
      // System.out.println(temBar);
        return temBar;
    }

    public String findMaxTemp() {
        String tempSplit1 = findWebElement(By.xpath("(//span[@class='maxTemp'])[1]")).getText();
        String temBar1 = tempSplit1.split("˚")[0];
        //System.out.println(temBar1);
        return temBar1;
    }

    public String findLowTemp(){
        String tempSplit2 = findWebElement(By.xpath("(//span[@class='highTemp swip'])[1]")).getText();
        String temBar2 = tempSplit2.split("˚")[0];
       // System.out.println(temBar2);
        return temBar2;
    }

    public String findHighTemp(){
        String tempSplit3 = findWebElement(By.xpath("(//*[@class='lowTemp swap'])[1]//span[1]")).getText();
        String temBar3 = tempSplit3.split("˚")[0];
       // System.out.println(temBar3);
        return temBar3;
    }



}




