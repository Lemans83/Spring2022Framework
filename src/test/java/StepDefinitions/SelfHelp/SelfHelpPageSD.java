package StepDefinitions.SelfHelp;

import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelfHelpPageSD {

    @Given("I am on self help home page")
    public void launch() {
        MyDriver.launchUrlOnNewWindow("https://selfhelp.net/");
    }

    @When("I check self help page title")
    public void title() {
        System.out.println(MyDriver.getDriver().getTitle());
    }

    @Then("I verify its correct")
    public void verifySelfHelp() {
       MyDriver.quitWindows();
    }


}
