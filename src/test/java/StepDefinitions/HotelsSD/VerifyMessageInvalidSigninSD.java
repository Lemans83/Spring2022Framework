package StepDefinitions.HotelsSD;

import Helper.Misc;
import Pages.Hotels.LandingPage;
import Pages.Hotels.SignInPage;
import Web.MyDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.jv.Lan;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.security.PublicKey;

//TC 21
public class VerifyMessageInvalidSigninSD {

 SignInPage finalProjectTC21 = new SignInPage();


 @When("I click Sign in button")
 public void clickSingin() {
  finalProjectTC21.singInButton();
  Misc.pause(3);
 }

 @When("^I enter invalid email address (.+)$")
 public void enterInvalidEmailaddress(String value) {
  finalProjectTC21.enterInvalidEmail(value);
 }

 @When("^I enter first name (.+) in sign up form$")
 public void enterSignUpFirstName(String userInput) {
  finalProjectTC21.enterFirstName(userInput);
 }

 @When("^I enter last name (.+) in sign up form$")
 public void enterSignUpLastName(String userInput) {
  finalProjectTC21.enterLastName2(userInput);
 }


 @When("^I enter invalid password (.+)$")
 public void enterEmailPassword(String value) {
  finalProjectTC21.enterLoginPassword(value);
 }

 @When("I click sign in button")
 public void clickSinIn() {
  finalProjectTC21.clickSingInButton();
  Misc.pause(4);
 }

 @Then("I verify that the verification message is displayed")
 public void verifyMessageDisplayed() {
  Assert.assertTrue(finalProjectTC21.verifyInvalidMessageIsDisplayed(), "Is not valid");
  MyDriver.quitWindows();
 }


 // TC 22
  @When("^I enter invalid signup email address (.+)$")
  public void enterMyInvalidEmail(String value) {
  finalProjectTC21.enterEmail(value);
 }
  @And("^Enter invalid first name (.+)$")
  public void enterInvalidName(String value) {
  finalProjectTC21.enterInvalidName(value);
 }
  @Then("I verify error is displayed")
  public void emailAddressError(){
  Assert.assertTrue(finalProjectTC21.invalidErrorEmail());
 }
  @And("^Enter invalid last name (.+)$")
  public void enterMyLastName(String value){
  finalProjectTC21.enterLastName(value);
 }
  @And("^Enter password (.+)$")
  public void enterInvalidPassword(String value) {
  finalProjectTC21.invalidPassword(value);
 }
  @Then("Verify error is displayed")
  public void errorFirstName(){
   Assert.assertTrue(finalProjectTC21.errorNameDisplayed());
  }
  @Then("Verify “Keep me signed in” checkbox is displayed and enabled")
  public void verifSignedBox() {
   Assert.assertTrue(finalProjectTC21.signedInCheckBox());
  }
  @Then("Verify “Continue” button is displayed but NOT enabled")
  public void verifContinueButton(){
 //System.out.println(finalProjectTC21.continueButtonDisabled());
   Assert.assertFalse(finalProjectTC21.continueButtonDisabled(),"Test Failed - because it was disabled");
 }
}
