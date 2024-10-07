package Pages;

import PageObjectModel.Locators;
import Utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class YourCartPage {
    private WaitHelper wait;
    public YourCartPage(WebDriver driver) {
        wait = new WaitHelper(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = Locators.YourCart_Page.CARTQUANTITY)
    private List<WebElement> cartQuantity;

    @FindBy(xpath = Locators.YourCart_Page.VERIFYPRODUCTINCART)
    private WebElement verifyproductincart;

    public void verifyCartQuantity(){
        System.out.println(cartQuantity.size());
    }

    public void Verifyproductincart(){
        wait.waitForElementToBeVisible(By.xpath(Locators.YourCart_Page.VERIFYPRODUCTINCART));
        System.out.println(verifyproductincart.getText());
    }
}
