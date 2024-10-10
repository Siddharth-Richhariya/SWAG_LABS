package PageObjectModel;

public class Locators {
    public static class Login_Page{
        public static final String USERNAME = "//input[@id='user-name']";
        public static final String PASSWORD = "//input[@id='password']";
        public static final String LOGINBUTTON = "//input[@id='login-button']";
        public static final String ERROR_MESSAGE = "//h3[@data-test='error']";
    }

    public static class Home_Page{
        public static final String DROPDOWN = "//select[@class='product_sort_container']";
        public static final String PRODUCTS = "//div[@class='inventory_item']";
        public static final String PRODUCTS_NAME ="//div[@class='inventory_item_name']";
        public static final String PRODUCTS_DISCRIPTION = "//div[@class='inventory_item_desc']";
        public static final String PRODUCTS_Price = "//div[@class='inventory_item_price']";
        public static final String ADDTOCART = "//button[contains(text(),'ADD TO CART')]";
        public static final String REMOVEBUTTON = "//button[contains(text(),'REMOVE')]";
        public static final String CARTBUTTON = "//div[@id='shopping_cart_container']";

    }

    public static class YourCart_Page{
        public static final String CARTQUANTITY = "//div[@class='cart_quantity']";
        public static final String VERIFYPRODUCTINCART ="//div[@class='cart_item_label']/child::a/div";
        public static final String CHECKOUTBUTTON = "//a[contains(text(),'CHECKOUT')]";

    }

    public static class Checkout_Page{
        public static final String FIRSTNAME = "//form/div[1]/input[@id='first-name']";
        public static final String LASTNAME = "//form/div[1]/input[@id='last-name']";
        public static final String ZIPCODE = "//form/div[1]/input[@id='postal-code']";
        public static final String CANCELBUTTON = "//form/div[2]/a[contains(text(),'CANCEL')]";
        public static final String CONTINUEBUTTON = "//form/div[2]/input[@value='CONTINUE']";
        public static final String ERRORMESSAGE = "//form/h3/button[@class='error-button']";
    }



}
