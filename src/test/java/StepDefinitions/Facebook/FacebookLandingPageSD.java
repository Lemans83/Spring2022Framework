package StepDefinitions.Facebook;

import Pages.Facebook.LandingPage;
import Web.MyDriver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLandingPageSD{

    //Task 3
   LandingPage FBpage = new LandingPage();

    @Given("I launch Facebook")
    public void launchFBpage(){MyDriver.launchUrlOnNewWindow("https://www.facebook.com");}

    @When("I click on Facebook Pay, Oculus, Instagram, Portal and Bulletin")
    public void clickLinks() {FBpage.clickLinks();}

    @Then("I close all windows except Instagram")
    public void closeWindows(){FBpage.enhancedLoop();}

    @And("I quit windows")
    public void quitWindows(){MyDriver.quitWindows();}














}
