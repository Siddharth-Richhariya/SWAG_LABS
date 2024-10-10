package Pages;

import PageObjectModel.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalPage {
    public FinalPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = Locators.Final_Page.CONFIRMATIONMESSAGE1)
    private WebElement getConfirmation1;

    @FindBy(xpath = Locators.Final_Page.CONFIRMATIONMESSAGE2)
    private WebElement getConfirmation2;

    public void getConfirmationMeassge(){
        String one = getConfirmation1.getText();
        String two = getConfirmation2.getText();
        System.out.println(one+"\n"+two);
    }
}
