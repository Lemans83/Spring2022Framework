package StepDefinitions.HotelsSD;

import Helper.Misc;
import Pages.Hotels.LandingPage;
import Pages.Hotels.SearchPage;
import Web.MyDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HotelsLandingPageSD {
    LandingPage myHotels = new LandingPage();
    SearchPage sPage = new SearchPage();


    //Task 4
//    @Given("^I launch Hotels website$")
//    public void launchPage() {
//        //myHotels.launchHotels();
//        MyDriver.launchUrlOnNewWindow("https://www.hotels.com");
//    }

//    @Given("I launch Hotels website")
//    public void launchHotelsPage(){myHotels.launchHotels();
//    }
    @When("I click search button")
    public void clickSearchButton(){
        myHotels.clickSearch();
        Misc.pause(5);
    }

    @Then("I verify if the destination box is displayed")
    public void errorBoxdisplayed(){
        Assert.assertTrue(myHotels.errorbox());
        MyDriver.quitWindows();
    }

 //Task 5
     @When("I click the travelers box")
      public void clickTravbutton(){myHotels.clickTravButton();
    }
    @When("I select child traveler")
    public void selectTravButton() {
        myHotels.addNumberofChild(2);
    }

    @Then("I verify the age error is displayed")
    public void errorAgeIsdispalyed(){Assert.assertTrue(myHotels.ageErrordisplayed());}

    @And("I select age in the age-box")
    public void childAge(){myHotels.childAgeBox();}

    @Then("I verify the age error is not displayed")
    public void errorAgeIsNotDispalyed(){
        Misc.pause(3);
        Assert.assertFalse(myHotels.ageErrordisplayed());}

    @And ("I click done button")
    public void clickDone(){
        myHotels.clickDoneBttn();
        Misc.pause(1);
        myHotels.getTravelerCount();
    }

    @And ("^I type destination$")
    public void addDestination(){myHotels.typeDestination("Bora Bora"); }

    @And("I select destination")
    public void selectMyDetsination(){myHotels.clickDestinationSuggestion("Bora Bora");}

    @Then("verify numbers of travelers before and after is the same")
    public void verifyTravelerCountRemainsSame() {
        Misc.pause(3);
        Assert.assertEquals(sPage.returnAfter(),myHotels.returnBefore());
        MyDriver.quitWindows();
    }


    // TC21 - Calendar
    @When("I select August 1, 2022 as Check-in")
    public void selectDate() {
        myHotels.clickCheckInBtn();
        myHotels.selectDayMonthYear("1 August 2022");
        myHotels.clickCalendarDoneBtn();
    }

    @When("I select August 10, 2022 as Check out")
    public void selectCheckOutDate() {
        myHotels.clickCheckOutBtn();
        myHotels.selectDayMonthYear("10 August 2022");
        myHotels.clickCalendarDoneBtn();
    }


}
