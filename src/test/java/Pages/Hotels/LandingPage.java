package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class LandingPage extends Commands {


    //My locators
    By searchbutton = By.xpath("//button[@data-testid='submit-button']");
    By errorbox = By.xpath("//h3[@class='uitk-error-summary-heading']");

    By travelerbutton = By.xpath("//button[@data-testid='travelers-field-trigger']");
    By selecttraveler = By.xpath("(//span[@class='uitk-step-input-button'])[4]");
    By agerrorlocator = By.xpath("//h3[@class='uitk-error-summary-heading']");
    By clickdonebutton = By.xpath("//button[@data-testid='guests-done-button']");
    By childgebox = By.xpath("//select[@id='child-age-input-0-0']");

    By destinationLocator = By.xpath("//button[@aria-label='Going to']");
    By destinationInput = By.xpath("//input[@data-stid='location-field-destination-menu-input']");
    By destinationSuggestions = By.xpath("//div[@class='uitk-typeahead-results']//div[contains(@class,'truncat') and not(contains(@class,'uitk'))]");

    By travelerCountLocator = By.xpath("//button[@data-testid='travelers-field-trigger']");
    String initialCount = "";



    //My Methods
    public void launchHotels(){
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com");
    }
    public void clickSearch(){clickIt(searchbutton);}
    public boolean errorbox(){return isElementEnabled(errorbox);}

    public void clickTravButton(){clickIt(travelerbutton);}
    public void addNumberofChild(){clickIt(selecttraveler);}
    public boolean ageErrordisplayed(){
        try {
            findWebElement(agerrorlocator);
            return true;
        } catch (NoSuchElementException e) {
              return false;
            }
        }
    public void childAgeBox(){selectInDropdown(childgebox,"5");}

    public void clickDoneBttn(){clickIt(clickdonebutton);}
    public void typeDestination(String input){
        clickIt(destinationLocator);
        Misc.pause(2);
        type(destinationInput,input);
        Misc.pause(2);
    }
    public void clickDestinationSuggestion(String destination) {
        selectFromSuggestions(destinationSuggestions, destination);
        Misc.pause(1);
    }

    public void getTravelerCount() {
        String traverlers = findWebElement(travelerCountLocator).getText();
        initialCount = traverlers.split(", ")[1];
    }

    public String returnBefore() {
        return initialCount;
    }






}
