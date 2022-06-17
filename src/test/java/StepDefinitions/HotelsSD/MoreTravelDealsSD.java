package StepDefinitions.HotelsSD;

import Pages.Hotels.DealsPage;
import Pages.Hotels.LandingPage;
import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MoreTravelDealsSD {

    LandingPage lPage = new LandingPage();
    DealsPage deals = new DealsPage();

    @Given("^I launch Hotels.com/deals$")
    public void launchPage(){
        deals.launchHotelDealsPg();
    }
//    @When("I click on more travel dropdown")
//    public void clickMoreTravel() {
//        lPage.clickMoreTravelDropdown();
//    }
//
//    @When("I click on Deals page link")
//    public void clickDealsPageLink() {
//        lPage.clickDealsPageOption();
//    }

    @Then("^Verify “Manage your booking anytime, anywhere” is displayed and enabled$")
    public void manageBookingIsDisplayedAndEnabled() {
        Assert.assertTrue(deals.manageTripIsDisplayed(), "text failed");
        Assert.assertTrue(deals.manageTripIsEnabled(), "text failed");
    }

    @Then("^Verify “Stay Flexible with free cancellation” is displayed and enabled$")
    public void freeCancellationIsDisplayedAndEnabled() {
        Assert.assertTrue(deals.freeCancellationIsDisplayed(), "text failed");
        Assert.assertTrue(deals.freeCancellationIsEnabled(), "text failed");
    }

    @Then("^Verify “Save on your next trip to the great outdoors” is displayed and enabled$")
    public void saveNextTripIsDisplayedAndEnabled() {
        Assert.assertTrue(deals.saveNextTripIsDisplayed(), "text failed");
        Assert.assertTrue(deals.saveNextTripIsEnabled(), "text failed");
    }

    @When("^Click on Manage your booking anytime anywhere$")
    public void clickManageTrip(){
        deals.clickManageTrip();
    }
    @Then("^Verify “Search, book and Save on the go!” title is displayed$")
    public void isHeaderSearchDisplayed(){
        Assert.assertTrue(deals.isHeaderDisplayed());
    }
    @When("^Go back$")
    public void back(){
        deals.goBack();
    }

    @When("^Click on Stay Flexible with free cancellation$")
    public void clickFreeCancellation(){
        deals.clickSaveTrip();
    }
    @Then("^Verify “Amazing deals with free cancellation” OR “Stay Flexible with free cancellation” title is displayed$")
    public void isHeaderDisplayed(){
        Assert.assertTrue(deals.isSaveTripHeaderDisplayed());
    }

    @When("^Click on “Save on your next trip to the great outdoors”$")
    public void clickSaveNextTrip(){
        deals.clickSaveOnNextTrip();
    }
    @Then("^Verify “Save on your next trip to the great outdoors” title is displayed$")
    public void isSearchHeaderDisplayed(){
        Assert.assertTrue(deals.isSaveOnNextTripHeaderDisplayed());
        MyDriver.quitWindows();
    }










}
