package Pages;

import PageObjectModel.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = Locators.Login_Page.USERNAME)
    private WebElement userName;

    @FindBy(xpath = Locators.Login_Page.PASSWORD)
    private WebElement passWord;

    @FindBy(xpath = Locators.Login_Page.LOGINBUTTON)
    private WebElement clickLoginBtn;

    @FindBy(xpath = Locators.Login_Page.ERROR_MESSAGE)
    private WebElement errorMessage;

    public void enterUserName(String username){
        userName.sendKeys(username);
    }

    public void enterPassword(String password){
        passWord.sendKeys(password);
    }

    public void clickLoginButton(){
        clickLoginBtn.click();
    }

    public void  getErrorMessage(){
        String errorMsg =errorMessage.getText();
        System.out.println(errorMsg);
    }




}
