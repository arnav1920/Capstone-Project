package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class ConfirmationPage {

    WebDriver driver;
    WaitUtils wait;

    public ConfirmationPage(WebDriver driver)
    {
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    By confirmationText = By.tagName("h1");

    public String getConfirmationMessage()
    {
        wait.sleep();
        return driver.findElement(confirmationText).getText();
    }
}