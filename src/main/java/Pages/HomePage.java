package Pages;

import PageObjectModel.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath=Locators.Home_Page.DROPDOWN)
    private WebElement dropDown;

    public void sortBy(String Value){
        Select dropdown = new Select(dropDown);
        dropdown.selectByVisibleText(Value);
    }
}
