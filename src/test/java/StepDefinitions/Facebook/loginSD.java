package StepDefinitions.Facebook;

import Web.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSD {

    @Given("I am on Facebook")
    public void launch() {
        MyDriver.launchUrlOnNewWindow("https://www.facebook.com/");
    }

    @When("I get page title")
    public void title() {
        System.out.println(MyDriver.getDriver().getTitle());
    }

    @Then("I quit")
    public void quit() {
        MyDriver.quitWindows();
    }

}
