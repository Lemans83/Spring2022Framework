package StepDefinitions.HotelsSD;

import Pages.Commands;
import Pages.Hotels.LandingPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class NumberOfGuesstsSD extends Commands {

    LandingPage finalProject18 = new LandingPage();

    @When("^I select 6 Adults traveler$")
    public void increaseNumberOfAdults(){
        finalProject18.selectNumberOfAdults(4);
    }
    @When("^I select second child age under 1$")
    public void increaseSecondChildAge(){
        finalProject18.selectSecondChildAge();
    }

    @Then("Verify total number of guests in sum of adults and children as same as selected on step #3 and #4.")
    public void verifyTotalNumberOfGuestAndChild(){
       Assert.assertTrue(finalProject18.sumTotalNumberChildAndAdult());
    }








}
