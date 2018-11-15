import org.junit.Assert;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Tests {
    @Test
    public void WrongDestination() {
        System.setProperty("webdriver.chrome.driver", "../../main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://www.ryanair.com/gb/en/");
        WebElement Destination = driver.findElement(By.cssSelector(".route-selector-destination>.field-type>.field-value>.disabled-wrap>input"));
        Destination.sendKeys("Belarus");
        WebElement button = driver.findElement(By.cssSelector(".col-flight-search-right>button"));
        button.click();
        WebElement err = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".validation-messages>ul>li")));
        String error = err.getText();
        String expError = "Please enter a valid airport.";
        driver.quit();
        Assert.assertEquals(error,expError);
    }
}
