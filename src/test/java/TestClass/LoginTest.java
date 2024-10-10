package TestClass;

import PageObjectModel.BaseClass;
import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.YourCartPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.NoSuchElementException;

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
        homePage.sortBy("hilo");  //HighToLow
       // homePage.printAllProductName();
        homePage.addProductToCart(0);
        homePage.verifyRemoveButton();
        try{
            homePage.clickCartButton();
            System.out.println("Cart is opened");
        }
        catch (NoSuchElementException e){
            System.out.println("No such Element ");
        }
    }

    @Test(priority = 2)
    public void verifyCart(){
        YourCartPage cart = new YourCartPage(BaseClass.getDriver());
        try {
            cart.verifyCartQuantity();
        }
        catch(Exception e){
            System.out.println("Trace: ");
            e.printStackTrace();
            String msg= e.getMessage();
            System.out.println("Message: "+ msg);
        }
        cart.Verifyproductincart();
        cart.clickCheckoutButton();
    }

    @Test(priority = 3)
    public void setCheckoutPage(){
        CheckoutPage checkoutPage = new CheckoutPage(BaseClass.getDriver());
        checkoutPage.enterFirstName("John");
        checkoutPage.enterLastName("Dev");
        checkoutPage.enterZipcode(284121);
        checkoutPage.continueButton();
    }

    @AfterClass
    public void teardown(){
        BaseClass.quitDriver();
    }
}