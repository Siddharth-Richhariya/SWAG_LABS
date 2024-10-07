package Pages;

import PageObjectModel.Locators;
import Utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class HomePage {
    private final WaitHelper wait;
    public HomePage(WebDriver driver) {
        wait = new WaitHelper(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = Locators.Home_Page.DROPDOWN)
    private WebElement dropDown;

    @FindBy(xpath = Locators.Home_Page.PRODUCTS)
    private List<WebElement> products;

    @FindBy(xpath = Locators.Home_Page.PRODUCTS_NAME)
    private List<WebElement> products_name;

    @FindBy(xpath = Locators.Home_Page.PRODUCTS_DISCRIPTION)
    private List<WebElement> products_discription;

    @FindBy(xpath = Locators.Home_Page.PRODUCTS_Price)
    private List<WebElement> products_price;

    @FindBy(xpath = Locators.Home_Page.ADDTOCART)
    private List<WebElement> addToCart;

    @FindBy(xpath = Locators.Home_Page.REMOVEBUTTON)
    private List<WebElement> removeButton;

    public void sortBy(String Value) {
        Select dropdown = new Select(dropDown);
        dropdown.selectByValue(Value);
    }

    public void addProductToCart(int index){
        if (index >=0 && index < addToCart.size()){
            wait.waitForElementToBeClickable(By.xpath(Locators.Home_Page.ADDTOCART)).click();
            System.out.println("Added product in Cart: "+ products_name.get(index).getText());
        }
        else{
            System.out.println("Invalid product index");
        }
    }

    public void printProductDetail(int index){
        if (index >=0 && index < products.size()){
            System.out.println("Added product in Cart: "+ products_name.get(index).getText());
            System.out.println("Added product in Cart: "+ products_price.get(index).getText());
            System.out.println("Added product in Cart: "+ products_discription.get(index).getText());
        }
        else{
            System.out.println("Invalid product index");
        }
    }

    public void addMultipleProductsToCart(int count){
        for(int i = 0; i < count && i < addToCart.size(); i++){
            addToCart.get(i).click();
            System.out.println("Added product in Cart: "+ products_name.get(i).getText());
        }
    }

    public void addAllProductInTheCart(){
        for(int i = 0; i < addToCart.size(); i++){
            addToCart.get(i).click();
            System.out.println("Added product in Cart: "+ products_name.get(i).getText());
            System.out.println("Added product in Cart: "+ products_price.get(i).getText());
        }
    }

    public void printAllProductName(){
        for (int i = 0; i < products_name.size(); i++){
            System.out.println("Added product in Cart: "+ products_name.get(i).getText());
            System.out.println("Added product in Cart: "+ products_price.get(i).getText());
            System.out.println("Added product in Cart: "+ products_discription.get(i).getText());
        }
    }

    public void verifyRemoveButton() {
        Assert.assertFalse(removeButton.isEmpty(),"Remove button is not displayed.");

    }
}


