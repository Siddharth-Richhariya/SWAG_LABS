package Pages;

import PageObjectModel.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private static WebDriver driver;
    public static void setDriver(WebDriver driver){
        LoginPage.driver = driver;
    }

    public static void enterUserName(String username){
        driver.findElement(Locators.Login_Page.USERNAME).sendKeys(username);
    }

    public static void enterPassword(String password){
        driver.findElement(Locators.Login_Page.PASSWORD).sendKeys(password);
    }

    public static void clickLoginButton(){
        driver.findElement(Locators.Login_Page.LOGINBUTTON).click();
    }

    public void  getErrorMessage(){
        WebElement errorMessage = driver.findElement(Locators.Login_Page.ERROR_MESSAGE);
        System.out.println(errorMessage.getText());
    }




}
