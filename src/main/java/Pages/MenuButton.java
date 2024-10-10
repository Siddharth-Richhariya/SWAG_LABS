package Pages;

import PageObjectModel.Locators;
import Utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MenuButton {

    private final WaitHelper wait;
    public MenuButton(WebDriver driver){
        wait = new WaitHelper(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = Locators.Menu_Bar.OPENMENUBAR)
    private WebElement openMenuBar;

    @FindBy(xpath = Locators.Menu_Bar.LOGOUT)
    private WebElement logoutButton;

    @FindBy(xpath = Locators.Menu_Bar.ABOUT)
    private WebElement aboutButton;

    @FindBy(xpath = Locators.Menu_Bar.ALLITEMS)
    private WebElement allItems;

    @FindBy(xpath = Locators.Menu_Bar.CLOSEMENUBAR)
    private WebElement closeMenuBar;

    public void openMenuBar(){
        openMenuBar.click();
        System.out.println("Bar opened");
    }

    public void logOut(){
        wait.waitForElementToBeClickable((By) logoutButton).click();
        System.out.println("Successfully Logged Out");
    }
}
