package TestClass;

import PageObjectModel.BaseClass;
import Pages.HomePage;
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
        LoginPage loginPage = new LoginPage(BaseClass.getDriver());
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
    }

    @Test (enabled = false)
    public void testHomePage(){
        HomePage homePage = new HomePage(BaseClass.getDriver());

    }

    @AfterMethod
    public void teardown(){
        BaseClass.quitDriver();
    }
}
