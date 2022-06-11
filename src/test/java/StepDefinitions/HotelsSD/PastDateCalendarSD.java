package StepDefinitions.HotelsSD;

import Helper.DateLib;
import Helper.Misc;
import Pages.Commands;
import Pages.Hotels.LandingPage;
import Web.MyDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PastDateCalendarSD extends Commands {

    LandingPage finalProject17 = new LandingPage();

    @When("I click on Check-in Calendar")
    public void clickAndSelectDate() {
        finalProject17.clickCheckinDateBox();
        Misc.pause(4);
    }

    @Then("Verify Past dates are disabled")
    public void PastDateCalendar() {
        Assert.assertEquals(DateLib.verifyDisabledDates() - 1, finalProject17.verifyDisabledDatesCalendar(), "is invalid");
    }

    @Then("Verify Back button on current month is disabled")
    public void backMonthArrow() {
       Assert.assertTrue(!finalProject17.backMonthArrow());
//        System.out.println(finalProject17.backMonthArrow());
    }
    @Then("Click on Done button on calendar")
    public void checkInDoneButton(){
        finalProject17.clickCheckinDoneButtn();
    }

    @When("Click on Checkout Calendar")
    public void checkOutDateBox(){
        finalProject17.clickCheckOutDateBox();
//        MyDriver.quitWindows();
    }


}