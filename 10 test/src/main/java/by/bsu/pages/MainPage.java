package by.bsu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import by.bsu.driver.Driver;

public  abstract class MainPage {
    WebDriver driver;

    public MainPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();
    }
}
