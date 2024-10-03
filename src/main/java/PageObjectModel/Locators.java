package PageObjectModel;

import org.openqa.selenium.By;

public class Locators {
    public static class Login_Page{
        public static By USERNAME = By.xpath("//input[@id='user-name']");
        public static By PASSWORD = By.xpath("//input[@id='password']");
        public static By LOGINBUTTON = By.xpath("//input[@id='login-button']");
        public static By ERROR_MESSAGE = By.xpath("//h3[@data-test='error']");
    }

}
