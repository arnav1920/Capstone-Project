package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class PurchasePage {

    WebDriver driver;
    WaitUtils wait;

    public PurchasePage(WebDriver driver)
    {
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    By name = By.id("inputName");
    By address = By.id("address");
    By city = By.id("city");
    By state = By.id("state");
    By zip = By.id("zipCode");
    By cardNumber = By.id("creditCardNumber");
    By month = By.id("creditCardMonth");
    By year = By.id("creditCardYear");
    By nameOnCard = By.id("nameOnCard");
    By purchaseBtn = By.cssSelector("input[type='submit']");

    public void enterDetails()
    {
        driver.findElement(name).sendKeys("Arnav");
        wait.sleep();

        driver.findElement(address).sendKeys("Pune");
        wait.sleep();

        driver.findElement(city).sendKeys("Pune");
        wait.sleep();

        driver.findElement(state).sendKeys("Maharashtra");
        wait.sleep();

        driver.findElement(zip).sendKeys("411014");
        wait.sleep();

        driver.findElement(cardNumber).sendKeys("1234567812345678");
        wait.sleep();

        driver.findElement(month).clear();
        driver.findElement(month).sendKeys("12");
        wait.sleep();

        driver.findElement(year).clear();
        driver.findElement(year).sendKeys("2028");
        wait.sleep();

        driver.findElement(nameOnCard).sendKeys("Arnav Gupta");
        wait.sleep();
    }

    public void purchaseFlight()
    {
        driver.findElement(purchaseBtn).click();
        wait.sleep();
    }
}