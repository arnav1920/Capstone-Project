package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.WaitUtils;

public class HomePage {

    WebDriver driver;
    WaitUtils wait;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    By departureCity = By.name("fromPort");
    By destinationCity = By.name("toPort");
    By findFlightsBtn = By.cssSelector("input[type='submit']");

    public void selectDeparture(String city)
    {
        Select select = new Select(driver.findElement(departureCity));
        select.selectByVisibleText(city);
        wait.sleep();
    }

    public void selectDestination(String city)
    {
        Select select = new Select(driver.findElement(destinationCity));
        select.selectByVisibleText(city);
        wait.sleep();
    }

    public void clickFindFlights()
    {
        driver.findElement(findFlightsBtn).click();
        wait.sleep();
    }
}