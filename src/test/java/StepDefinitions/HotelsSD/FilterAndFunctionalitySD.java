package StepDefinitions.HotelsSD;

import Pages.Hotels.FilterAndSort;
import Pages.Hotels.LandingPage;
import Web.MyDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FilterAndFunctionalitySD {

    LandingPage lp = new LandingPage();
    FilterAndSort filter = new FilterAndSort();

    @And("^I select destination Manhat$")
    public void addDestination() {
        lp.typeDestination("Manhat");
    }
    @When("I select destination from suggestion")
    public void typeDestination() {
        lp.clickDestinationSuggestion("Manhattan");
    }
    @When("I select August 10-15, 2022 from calendar")
    public void selectDate() {
        lp.clickCheckInBtn();
        lp.selectDayMonthYear("10 August 2022");
        lp.selectDayMonthYear("15 August 2022");
        lp.clickCalendarDoneBtn();
    }
    @When("^Click on (.+) from star-rating filter$")
    public void clickStarRating(String input){
        filter.selectStarRating(input);
    }
    @When("^Select (.+) from sort-by dropdown$")
    public void selectSortByOption(String input){
        filter.selectPrice(input);
    }
    @Then("I verify all hotels in search results are *-rated as selected in above step")
    public void verifyStarFilterDescription() {
        Assert.assertTrue(filter.verifyAppliedStarFilter(),"Test Fail - Star filter was wrong");
    }
    @Then("I verify all hotels are listed in increasing order price")
    public void verifyPriceFilterValues() {
        Assert.assertTrue(filter.verifyAppliedPriceFilter(),"Test Fail - Price filter was not correct");
        MyDriver.quitWindows();
    }


}
