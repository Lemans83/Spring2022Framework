package Pages.Hotels;

import Helper.Misc;
import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FilterAndSort extends Commands {
// Locators for TC 23
//    By destinationInputBoxLocator = By.xpath("//button[@aria-label='Going to']");
//    By enterTextDestination = By.xpath("//div/input[contains(@class, 'uitk-typeahead-input') and contains(@id,\"destination\")] ");
    By sortByBoxLc = By.xpath("//select[@id='sort']");
    By selectedStarFilterVerificationLocator = By.xpath("//div[@class='all-b-padding-half']//div/span");
    By finalHotelPrice = By.xpath("//*[@data-test-id='price-summary-message-line']//div[contains(text(),'The price is')]/following-sibling::span/div");

// Methods for TC23
    public void selectStarRating(String value){
        scrollByPixel("650");
        By selectStar = By.xpath("//label[contains(@aria-label,'" + value+ "')]");
        clickIt(selectStar);
    }
    public void selectPrice(String value){
        selectInDropdown(sortByBoxLc,"Price");
        Misc.pause(3);
    }
    public boolean verifyAppliedPriceFilter() {
        List<WebElement> hotelPrices = findWebElements(finalHotelPrice);
        boolean isPriceFilterCorrect = true;
        for (int i = 0; i < hotelPrices.size() - 1; i++) {
            String currentPrice = hotelPrices.get(i).getText().substring(1);
            String nextPrice = hotelPrices.get(i + 1).getText().substring(1);
            if (Integer.valueOf(currentPrice) > Integer.valueOf(nextPrice)) {
                isPriceFilterCorrect = false;
            }
//            System.out.println("Current = "+currentPrice + " | " + "Next = " + nextPrice);
//            System.out.println("");
        }
        //System.out.println(isPriceFilterCorrect);
        return isPriceFilterCorrect;
    }
    public boolean verifyAppliedStarFilter() {
        List<WebElement> starFilterDescription = findWebElements(selectedStarFilterVerificationLocator);
        boolean isStarFilterCorrect = true;
        for (WebElement description : starFilterDescription) {
            if (!description.getText().equalsIgnoreCase("5 out of 5")) {
                isStarFilterCorrect = false;
            }
        }
        return isStarFilterCorrect;
    }









}
