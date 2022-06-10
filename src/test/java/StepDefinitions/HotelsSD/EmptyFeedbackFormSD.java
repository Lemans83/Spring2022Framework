package StepDefinitions.HotelsSD;

import Pages.Hotels.FeedbackFormPage;
import Pages.Hotels.LandingPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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





}
