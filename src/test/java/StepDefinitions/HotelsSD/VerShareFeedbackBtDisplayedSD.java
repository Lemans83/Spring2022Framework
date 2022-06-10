package StepDefinitions.HotelsSD;

import Pages.Hotels.LandingPage;
import Web.MyDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VerShareFeedbackBtDisplayedSD {

    LandingPage finalProjectTC19 = new LandingPage();

    @When("I verify the text Tell us how we can improve our site is displayed")
    public void verTextMessagePage() {
        Assert.assertTrue(finalProjectTC19.verifyTextMessage());
    }

    @When("I verify the button share feedback is displayed and enabled")
    public void verShareFeedbackButton() {
        Assert.assertTrue(finalProjectTC19.verifyTextMessage());
        MyDriver.quitWindows();
    }


}
