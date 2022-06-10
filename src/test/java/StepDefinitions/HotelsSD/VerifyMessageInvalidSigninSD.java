package StepDefinitions.HotelsSD;

import Helper.Misc;
import Pages.Hotels.LandingPage;
import Pages.Hotels.SignInPage;
import Web.MyDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.jv.Lan;
import org.openqa.selenium.By;
import org.testng.Assert;

//TC 21
public class VerifyMessageInvalidSigninSD {

 SignInPage finalProjectTC21 = new SignInPage();

  @When("I click Sign in button")
  public void clickSingin(){
   finalProjectTC21.singInButton();
   Misc.pause(2);
  }

  @When("^I enter invalid email address (.+)$")
  public void enterInvalidEmailaddress(String value){
   finalProjectTC21.enterInvalidEmail(value);
  }
  @When("^I enter invalid password (.+)$")
  public void enterEmailPassword(String value){
   finalProjectTC21.enterLoginPassword(value);
  }

  @When ("I click sign in button")
  public void clickSinIn(){
   finalProjectTC21.clickSingInButton();
   Misc.pause(4);
  }

  @Then("I verify that the verification message is displayed")
  public void verifyMessageDisplayed(){
   Assert.assertTrue(finalProjectTC21.verifyInvalidMessageIsDisplayed(),"Is not valid");
   MyDriver.quitWindows();
  }

}
