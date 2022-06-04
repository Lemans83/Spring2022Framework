package StepDefinitions.Darksky;

import Helper.Misc;
import Pages.Darksky.LandingPage;
import Web.MyDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TimeMachineSD {
//Task 1
    LandingPage obj = new LandingPage();

    @Given("I launch Darksky webpage")
    public void launchDarksky(){
        MyDriver.launchUrlOnNewWindow("https://www.darksky.net");
    }

    @When("I scroll down to Time Machine button")
    public void scrollDowntoTimeMachine(){
        //scrollDowntoTimeMachine();
        obj.scrollToTimeMachineBypixel();

        Misc.pause(4);
    }

    @And("I click the Machine Time button")
    public void clickTimeMachine(){
        obj.clickTimeMcahine();

        Misc.pause(2);
    }

    @And("I verify if the current date is highlighted")
    public void veifytheDate(){
        //obj.dateFromTimeMachine();
        Assert.assertEquals(obj.dateFromTimeMachine(), obj.verifyTodayDate(), "not equal");
        MyDriver.quitWindows();
    }

//Task 2
   @When ("I scroll down to Temperature bar")
    public void scroltoTempbar(){
        obj.scrollToTodayBarBypixel();
        Misc.pause(2);
   }

  @And("I click the the Temperture bar")
    public void clickTempbar(){
        obj.clickTodayBar();
  }
  @Then("I verify if the values are displayed in Today's date")
    public void verValuesDisplayed(){
      Assert.assertEquals(obj.findMinTemp(),obj.findLowTemp(), "Is not equal");
      Assert.assertEquals(obj.findMaxTemp(), obj.findHighTemp(),"Is not equal");
      MyDriver.quitWindows();
  }










}




