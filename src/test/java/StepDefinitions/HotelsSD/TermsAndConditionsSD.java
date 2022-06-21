package StepDefinitions.HotelsSD;
import Helper.Misc;
import Pages.Hotels.LandingPage;
import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

//TC 20
public class TermsAndConditionsSD {

    LandingPage finalProject = new LandingPage();

    @Given("I launch Hotels website")
    public void launchHotels() {
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com");
    }

    @When("I click Sign in link")
    public void clicksignInLink(){
        finalProject.FindHotelSigninLocator();
        Misc.pause(2);
    }

    @Then("I click Sign up link")
    public void clickSignUpLink(){
        finalProject.FindSignUpLocoator();
    }

    @When("I click Terms and Conditions link")
    public void clickTermsAndConditions(){
        finalProject.termsAndConditions();
    }

    @Then("I verify Terms and Conditions page opens in a tab")
    public void verifyTermsAndCondTitle(){
        finalProject.findTitleTermsAndConditions();
        Assert.assertTrue(finalProject.getTermsConditionsHeading());
    }

    @When("I click Privacy Statement link")
    public void clickPrivacyPage() {
        finalProject.privacyPage();
    }

    @Then("I verify Privacy Statement page opens in a tab")
    public void verifyPrivacyPageTitle() {
        finalProject.findTitlePrivacyPage();
        Assert.assertTrue(finalProject.getPrivacyHeading());
        MyDriver.getDriver().quit();
    }
}
