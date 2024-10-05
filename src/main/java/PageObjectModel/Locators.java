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
    }



}
