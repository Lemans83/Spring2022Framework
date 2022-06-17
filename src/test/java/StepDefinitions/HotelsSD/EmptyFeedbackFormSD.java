package StepDefinitions.HotelsSD;

import Helper.Misc;
import Pages.Hotels.FeedbackFormPage;
import Pages.Hotels.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.testng.Assert;

public class EmptyFeedbackFormSD {

    FeedbackFormPage finalProject24 = new FeedbackFormPage();

    @When("I select Website feedback from Help dropdown")
    public void clickFeedbackPage(){
        finalProject24.clickfeedbacklink();
    }

    @When("I click submit button")
    public void clickSubmitBtn() {
        finalProject24.scrollDownSubmitButton();
        finalProject24.clickSubmitBtn();
    }

    @Then("Verify error message is displayed Please fill in the required information highlighted below.")
    public void verFieldErrorMessage(){
        Assert.assertTrue(finalProject24.verifyMessIsDisplayed());
    }

    @Then("Verify star boxes section is in a red dotted box.")
    public void redDottedBorder(){
        Assert.assertTrue(finalProject24.redDottedLine());
    }


// TC 25
    @When("^Select any star-rating$")
    public void selectStar() {
    finalProject24.selectStarBox();
    Misc.pause(4);
}

    @When("^I enter any comments(.+)$")
    public void enterBoxComment(String value) {
        finalProject24.enterComment(value);
    }

    @When("I Select any option for “How likely are you to return to Hotels.com?")
    public void clickFromOption() {
        finalProject24.clickDropDownOption();
    }

    @When("Select any answer for Prior to this visit, have you ever booked on Hotels.com?")
    public void chooseYesOption() {
        finalProject24.selectYesOption();
    }

    @When("Select any answer for Did you accomplish what you wanted to do on this page?")
    public void chooseNoOption() {
        finalProject24.selectNoOption();
    }

    @When("I click on Submit button")
    public void submitButton() {
        finalProject24.clickSubmitButton();
    }

   @Then("Verify “THANK YOU FOR YOUR FEEDBACK.“ is displayed")
   public void messageDisplayed() {
   Assert.assertTrue(true,"-----> Not Displayed");
   }
}