package TestClass;

import PageObjectModel.BaseClass;
import Pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest {
    String Url = "https://www.saucedemo.com/v1";
    @BeforeMethod
    public void setUp(){
        BaseClass.intiDriver("Chrome");
        BaseClass.openURL(Url);
    }

    @Test
    public void testvalidLogin(){
        LoginPage.setDriver(BaseClass.getDriver());
        LoginPage.enterUserName("standard_user");
        LoginPage.enterPassword("secret_sauce");
        LoginPage.clickLoginButton();
    }

    @AfterMethod
    public void teardown(){
        BaseClass.quitDriver();
    }
}
