package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;

public class PageBase {
    protected AppiumDriver driver;
    private final int WAIT = 6;
    private final int POLLINGTIME = 250;


    public PageBase(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }


    public void waitForVisibility(WebElement element) {
        // Explicit Wait doesn't work perfectly as expected so fluent wait more controlled
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT));
        // wait.until(ExpectedConditions.presenceOfElementLocated(element));
        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(WAIT))
                .pollingEvery(Duration.ofMillis(POLLINGTIME))
                .ignoring(TimeoutException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clear(WebElement element) {
        waitForVisibility(element);
        element.clear();
    }

    public void click(WebElement element) {
        waitForVisibility(element);
        element.click();
    }

    public void sendText(WebElement element, String text) {
        waitForVisibility(element);
        element.sendKeys(text);
    }
}
