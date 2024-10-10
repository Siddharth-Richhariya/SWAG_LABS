package Pages;

import PageObjectModel.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public CheckoutPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = Locators.Checkout_Page.FIRSTNAME)
    private WebElement firstName;

    @FindBy(xpath = Locators.Checkout_Page.LASTNAME)
    private WebElement lastname;

    @FindBy(xpath= Locators.Checkout_Page.ZIPCODE)
    private WebElement postalcode;

    @FindBy(xpath = Locators.Checkout_Page.CANCELBUTTON)
    private WebElement cancelButton;

    @FindBy(xpath = Locators.Checkout_Page.CONTINUEBUTTON)
    private WebElement continueButton;

    @FindBy(xpath = Locators.Checkout_Page.ERRORMESSAGE)
    private WebElement errorMessage;

    public void  enterFirstName(String firstname){
        firstName.sendKeys(firstname);
    }

    public void enterLastName(String lastName){
        lastname.sendKeys(lastName);
    }

    public void enterZipcode(int zipcode){

        if (String.valueOf(zipcode).length() == 6 ){
            postalcode.sendKeys(String.valueOf(zipcode));
        }
        else {
            System.out.println("Invalid zip code: Must be exactly 6 digits.");
        }
    }

    public void enterZipcode(String zipcode){
        if (zipcode.length() == 6 && isNumeric(zipcode)){
        //if (zipcode.matches("//d{6}")){
            postalcode.sendKeys(zipcode);
        }
        else {
            System.out.println("Invalid zip code: Input must be a 6-digit number.");
        }
    }

    public void enterZipcode(Object zipcode){
        System.out.println("Invalid zip code: Input must be a 6-digit number.");
    }

    public void cancelButton(){
        cancelButton.click();
    }

    public void continueButton(){
        continueButton.click();
    }

    public void getErrorMessage(){
        System.out.println(errorMessage.getText());
    }

    private boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;  // Return false if a non-digit character is found
            }
        }
        return true;  // All characters are digits
    }
}
