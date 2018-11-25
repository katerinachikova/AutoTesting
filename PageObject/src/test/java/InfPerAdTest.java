package tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

public class InfPerAdTest {
    public static WebDriver driver;
    public static MainPage mp;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mp = new MainPage(driver);
        driver.get("https://www.ryanair.com/gb/en/");
    }
    @Test
    public void infantsPerAdultsTest() {
        mp.setInputDestination("Budapest");
        mp.clickContinue();
        mp.clickArrow();
        mp.clickPlus();
        mp.clickOk();
        mp.clickPlus();
        String expectedError = "You can't travel with more infants than adults";
        Assert.assertEquals(mp.getError(), expectedError);
    }
}

