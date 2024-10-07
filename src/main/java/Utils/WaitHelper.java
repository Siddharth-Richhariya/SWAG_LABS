package Utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper {
    private final WebDriverWait wait;

    // Constructor to initialize WebDriver and WebDriverWait
    public WaitHelper(WebDriver driver, Duration timeoutInSeconds) {
        this.wait = new WebDriverWait(driver, timeoutInSeconds);
    }

    // Wait for element to be visible
    public WebElement waitForElementToBeVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Wait for element to be clickable
    public WebElement waitForElementToBeClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Wait for an element to be present in the DOM
    public WebElement waitForElementToBePresent(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Wait for an element to disappear from the DOM
    public boolean waitForElementToDisappear(By locator) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    // Wait for a specific title
    public boolean waitForTitleToBe(String title) {
        return wait.until(ExpectedConditions.titleIs(title));
    }

    // Wait for an alert to be present
    public Alert waitForAlert() {
        return wait.until(ExpectedConditions.alertIsPresent());
    }

    // Wait for the URL to contain a specific text
    public boolean waitForURLToContain(String partialUrl) {
        return wait.until(ExpectedConditions.urlContains(partialUrl));
    }
}
