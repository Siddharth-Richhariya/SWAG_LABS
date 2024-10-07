package TestClass;

import PageObjectModel.BaseClass;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.YourCartPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    String Url = "https://www.saucedemo.com/v1";
    @BeforeClass
    public void setUp(){
        BaseClass.intiDriver("Chrome");
        BaseClass.openURL(Url);
    }

    @Test(priority = 0)
    public void testvalidLogin(){
        LoginPage loginPage = new LoginPage(BaseClass.getDriver());
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
    }

    @Test (priority = 1)
    public void testHomePage() throws InterruptedException {
        HomePage homePage = new HomePage(BaseClass.getDriver());
        Thread.sleep(2000);
        homePage.sortBy("hilo");  //HightoLow
       // homePage.printAllProductName();
        homePage.addProductToCart(0);
        homePage.verifyRemoveButton();
    }

    @Test(priority = 2)
    public void verifyCart(){
        YourCartPage cart = new YourCartPage(BaseClass.getDriver());
        try {
            cart.verifyCartQuantity();
        }
        catch(Exception e){
            System.out.println("Message ");
            e.printStackTrace();
            e.getMessage();
        }
        cart.Verifyproductincart();
    }

    @AfterClass
    public void teardown(){
        BaseClass.quitDriver();
    }
}
