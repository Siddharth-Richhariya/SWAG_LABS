package Pages;


import PageObjectModel.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {
    public CheckoutOverviewPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = Locators.CheckOutOverview_Page.ITEMTOTAL)
    private WebElement itemTotal;

    @FindBy(xpath = Locators.CheckOutOverview_Page.TAX)
    private WebElement tax;

    @FindBy(xpath = Locators.CheckOutOverview_Page.TOTALAMMOUNT)
    private WebElement totalAmmount;

    @FindBy(xpath = Locators.CheckOutOverview_Page.FINISHBUTTON)
    private WebElement finishButton;

    @FindBy(xpath = Locators.CheckOutOverview_Page.CANCELBUTTON)
    private WebElement cancelButton;

    public void getItemtotal(){
        String itemtotal = itemTotal.getText();
        System.out.println(itemtotal);
    }

    public void getTotalTax(){
        String totalTax = tax.getText();
        System.out.println(totalTax);
    }

    public void getTotalAmmount(){
        String totalAmmount = this.totalAmmount.getText();
        System.out.println(totalAmmount);
    }

    public void clickFinishButton(){
        finishButton.click();
    }

    public void clickCancelButton(){
        cancelButton.click();
    }


}
