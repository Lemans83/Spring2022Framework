package Pages.Hotels;

import Helper.DateLib;
import Helper.Misc;
import Pages.Commands;
import Web.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class LandingPage extends Commands {

    //Deepak's Locators
    By checkInDoneLocator = By.xpath("//button[@data-stid='apply-date-picker']");
    By checkInDateBoxLocator = By.id("d1-btn");
    By checkOutDateBoxLocator = By.id("d2-btn");
    By checkInDisabledDatesLocator = By.xpath("//table[@class='uitk-date-picker-weeks']//button[@disabled]");


    By june2022DatesLocator = By.xpath("//h2[text()='June 2022']/following-sibling::table//button[@data-day]");
    /*
        monthYear = August 2022
        "//h2[text()='" + monthYear + "']/following-sibling::table//button[@data-day]"
        monthDates_1 + monthYear + monthDates_2
     */
    String monthDates_1 = "//h2[text()='";
    String monthDates_2 = "']/following-sibling::table//button[@data-day]";

    By calendarHeading = By.xpath("(//div[@data-stid='date-picker-month'])[1]//h2");
    By nextMonthArrow = By.xpath("(//button[@data-stid='date-picker-paging'])[2]");
    By backMonthLocator = By.xpath("(//button[@data-stid='date-picker-paging'])[1]");

    By destinationInputBoxLocator = By.xpath("//button[@aria-label='Going to']");
    By destinationInputLocator = By.id("location-field-destination");
    By destinationSuggestions = By.xpath("//div[@class='uitk-typeahead-results']//div[contains(@class,'truncat') and not(contains(@class,'uitk'))]");

    By moreTravelDropdownLocator = By.xpath("//nav/div/button");
    By dealsPageLinkLocator = By.xpath("//nav//div[@class='uitk-list']/a[@href='/hotel-deals/']");


    public void clickMoreTravelDropdown() {
        clickIt(moreTravelDropdownLocator);
        Misc.pause(2);
    }

    public void clickDealsPageOption () {
        clickIt(dealsPageLinkLocator);
        Misc.pause(4);
    }


    //Deepak's methods
    public void clickCheckInBox() {
        clickIt(checkInDateBoxLocator);
    }

    public List<WebElement> getAllDisabledDates() {
        return findWebElements(checkInDisabledDatesLocator);
    }

    public void selectDateInJune2022(String dateToSelect) {
        selectDateInCalendar(june2022DatesLocator, dateToSelect);
    }

    public void enterDestination(String destination) {
        clickIt(destinationInputBoxLocator);
        type(destinationInputLocator, destination);
    }

    public void selectFromDestinationSuggestion(String userChoice) {
        selectFromSuggestions(destinationSuggestions, userChoice);
    }

    public void goToMonth(String monthYear) {
        for (int i = 0; i < 12; i++) {
            if (getTextOfWebElement(calendarHeading).equalsIgnoreCase(monthYear)) {
                break;
            }
            clickIt(nextMonthArrow);
        }
    }

    public void selectDateFromAnyMonth(String monthYear, String dateValue) {
        goToMonth(monthYear);
        By allDatesLocator = By.xpath(monthDates_1 + monthYear + monthDates_2);
        selectDateInCalendar(allDatesLocator, dateValue);
    }

    public void selectDateFromAnyMonth(String dateMonthYear) {
        String[] dateValues = dateMonthYear.split(" ");
        goToMonth(dateValues[1] + " " + dateValues[2]);
        By allDatesLocator = By.xpath(monthDates_1 + dateValues[1] + " " + dateValues[2] + monthDates_2);
        selectDateInCalendar(allDatesLocator, dateValues[0]);
    }

    //My locators
    By searchbutton = By.id("submit_button");
    By errorbox = By.xpath("//h3[@class='uitk-error-summary-heading']");

    By travelerbutton = By.xpath("//button[@type='button' and contains(text(),'travelers')]");
    By selecttraveler = By.xpath("//input[@aria-label='Children Ages 0 to 17']/following-sibling::button");
    By agerrorlocator = By.xpath("//h3[@class='uitk-error-summary-heading']");
    By clickdonebutton = By.xpath("//button[@id='traveler_selector_done_button']");
    By childgebox = By.xpath("//select[@id='child-age-input-0-0']");

    By destinationLocator = By.xpath("//button[@aria-label='Going to']");
    By destinationInput = By.id("destination_form_field");
    By destinationSuggestions1 = By.xpath("//div[@class='uitk-typeahead-results']//div[contains(@class,'truncat') and not(contains(@class,'uitk'))]");

    By travelerCountLocator = By.xpath("//button[@data-testid='travelers-field-trigger']");
    String initialCount = "";

    //Locators for TC 20
    By hotelSigninLocator = By.xpath("//button[@tabindex='0']");
    By hotelsSignupLocator = By.xpath("//a[@data-stid='link-header-account-signup']");
    By termsAndConditionsLocator = By.xpath("//a[text()='Terms and Conditions']");
    By tilelocator = By.xpath("//h1[text()='Terms and Conditions']");

    //Locator for Privacy Statement
    By privacyPageLinkLocator = By.xpath("//a[text()='Privacy Statement']");
    By privacyPageHeadingLocator = By.xpath("//h2[text()='Privacy Statement']");

    //Locators for TC 19
    By checkDatelocator = By.id("date_form_field-btn");
    By verifTextMessageLocator = By.xpath("//span[text()='Tell us how we can improve our site']");
    By veriShareFeedbackLocator = By.xpath("//a[text()='Share feedback']");

    // --------- Calendar ----------
    // Check in/out related locators
    By checkInBoxLocator = By.id("date_form_field-btn");
    By checkOutBoxLocator = By.id("d2-btn");
    By checkOutDaysLocator = By.xpath("//h2[text()='June 2022']/following-sibling::table//button[@data-day]");

    // Calendar related locators
    By currentMonthYear = By.xpath("(//div[@class='uitk-date-picker-month']/h2)[1]"); // <-- change this, not h2, target div
    By nextMonthBtnLocator = By.xpath("(//button[@data-stid='date-picker-paging'])[2]");
    By calendarDoneBtnLocator = By.xpath("//button[@data-stid='apply-date-picker']");

    //By secondChildAgeDropdownLocator = By.xpath("//select[@id='child-age-input-0-1']");
    //By travelerDoneBtnLocator = By.xpath("//button[@data-testid='guests-done-button']");

    //Locators for TC18
    By addNumberOfAdultsLocator = By.xpath("(//span[@class='uitk-step-input-button'])[2]");
    By totalTravelerCountLocator = By.xpath("//button[@data-testid='travelers-field-trigger']");
    By addChildAge = By.xpath("//select[@id='child-age-input-0-1']");


    //-------------------------------------------------------------------------------------------------------------------

    //My Methods
    public void launchHotels() {
        MyDriver.launchUrlOnNewWindow("https://www.hotels.com");
    }

    public void clickSearch() {
        clickIt(searchbutton);
    }

    public boolean errorbox() {
        return isElementEnabled(errorbox);
    }

    public void clickTravButton() {
        Misc.pause(1);
        clickIt(travelerbutton);
    }

    public boolean ageErrordisplayed() {
        try {
            findWebElement(agerrorlocator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void childAgeBox() {
        selectInDropdown(childgebox, "5");
    }

    public void clickDoneBttn() {
        clickIt(clickdonebutton);
    }

    public void typeDestination(String input) {
        clickIt(destinationLocator);
        Misc.pause(2);
        type(destinationInput, input);
        Misc.pause(2);
    }

    public void clickDestinationSuggestion(String destination) {
        selectFromSuggestions(destinationSuggestions1, destination);
        Misc.pause(1);
    }

    public void getTravelerCount() {
        String travelers = findWebElement(travelerCountLocator).getText();
        initialCount = travelers.split(", ")[1];
    }

    public String returnBefore() {
        return initialCount;
    }

    //------------------------------------------------------------------------------------------------------------------

    //Methods for TC 20
    public void FindHotelSigninLocator() {
        clickIt(hotelSigninLocator);
    }

    public void FindSignUpLocoator() {
        clickIt(hotelsSignupLocator);
        Misc.pause(3);
    }

    public void termsAndConditions() {
        clickIt(termsAndConditionsLocator);
    }

    public void privacyPage() {
        clickIt(privacyPageLinkLocator);
    }

    String parentWindowHandle;

    public void findTitleTermsAndConditions() {
        parentWindowHandle = MyDriver.getDriver().getWindowHandle();
        Set<String> allHandles = MyDriver.getDriver().getWindowHandles();
        for (String i : allHandles) {
            if (!i.equalsIgnoreCase(parentWindowHandle)) {
                MyDriver.getDriver().switchTo().window(i);
            }
        }
    }

    public boolean getTermsConditionsHeading() {
        boolean heading = isElementDisplayed(tilelocator);
        MyDriver.getDriver().close();
        MyDriver.getDriver().switchTo().window(parentWindowHandle);
        return heading;
    }

    public void findTitlePrivacyPage() {
        String landingPagehandle = MyDriver.getDriver().getWindowHandle();
        Set<String> allHandles = MyDriver.getDriver().getWindowHandles();
        for (String i : allHandles) {
            if (!i.equalsIgnoreCase(landingPagehandle)) {
                MyDriver.getDriver().switchTo().window(i);
            }
        }
    }

    public boolean getPrivacyHeading() {
        return isElementDisplayed(privacyPageHeadingLocator);
    }

    //--------------------------------------------------------------------------------------------------------------------

    // Methods for TC19
    public void clickDate() {
        clickIt(checkDatelocator);
    }

    public boolean verifyTextMessage() {
        scrollToElementIntoView(verifTextMessageLocator);
        return isElementDisplayed(verifTextMessageLocator);
    }

    public boolean verShareFeedbackButton() {
        return isElementEnabled(veriShareFeedbackLocator);
    }

    // Check in/out related methods
    public void clickCheckInBtn() {
        clickIt(checkInBoxLocator);
        Misc.pause(1);
    }

    public void clickCheckOutBtn() {
        clickIt(checkOutBoxLocator);
        Misc.pause(1);
    }

    public void selectCheckoutDay(String day) {
        List<WebElement> daysToSelect = MyDriver.getDriver().findElements(checkOutDaysLocator);
        for (WebElement value : daysToSelect) {
            if (value.getAttribute("data-day").equals(day)) {
                value.click();
            }
        }
    }

    // Calendar scrolling related methods
    public void clickNextMonthBtn() {
        clickIt(nextMonthBtnLocator);
        Misc.pause(1);
    }

    public void selectDayMonthYear(String date) {
        String monthYear = date.split(" ")[1] + " " + date.split(" ")[2];
        String day = date.split(" ")[0];
        By dayLocator = By.xpath("(//div[@class='uitk-date-picker-month'])[1]/h2[text()='" + monthYear + "']/following-sibling::table//button[@data-day='" + day + "']");
        for (int i = 0; i < 12; i++) {
            if (MyDriver.getDriver().findElement(currentMonthYear).getText().equalsIgnoreCase(monthYear)) {
                clickIt(dayLocator);
                break;
            }
            clickNextMonthBtn();
        }
    }

    public void clickCalendarDoneBtn() {
        clickIt(calendarDoneBtnLocator);
        Misc.pause(1);
    }

    //------------------------------------------------------------------------------------------------------------------

    // Methods for TC17
    public void clickCheckinDateBox() {
        clickIt(checkDatelocator);
    }

    public int verifyDisabledDatesCalendar() {
        List<WebElement> disabledDates = findWebElements(checkInDisabledDatesLocator);
        int DatesDisabled = disabledDates.size();
        return DatesDisabled;
    }

    public boolean backMonthArrow() {
        return isElementEnabled(backMonthLocator);
    }

    public void clickCheckinDoneButtn() {
        clickIt(checkInDoneLocator);
    }

    public void clickCheckOutDateBox() {
        clickIt(checkOutDateBoxLocator);
    }


    //-------------------------------------------------------------------------------------------------------------------

        // Methods for TC18
        static int totalAdults = 0;
        static int totalOfChildren = 0;
        public void selectNumberOfAdults ( int value){
            for (int i = 0; i < value; i++) {
                clickIt(addNumberOfAdultsLocator);
            }
            totalAdults = Integer.valueOf(value);
        }

        public void addNumberofChild ( int number){
            for (int i = 0; i < number; i++) {
                clickIt(selecttraveler);
            }
            totalOfChildren = Integer.valueOf(number);
        }

        public void selectFirstChildAge () {
            selectInDropdown(childgebox, "4");
        }

        public void selectSecondChildAge () {
            selectInDropdown(addChildAge, "1");
        }

        public boolean sumTotalNumberChildAndAdult () {
            String numberOfTravelers = findWebElement(totalTravelerCountLocator).getText().split(" ")[2];
            int people = (totalAdults + 2) + totalOfChildren;
            return Integer.valueOf(numberOfTravelers) == people;
        }


    }












