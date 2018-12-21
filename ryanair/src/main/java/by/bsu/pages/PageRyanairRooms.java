package by.bsu.pages;

import by.bsu.date.SetDate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PageRyanairRooms extends MainPage {
    @FindBy(css = ".hotels")
    private WebElement ryanairRooms;

    @FindBy(css = ".cookie-popup__close")
    private WebElement cookieClose;

    @FindBy(css = ".field-type>.field-value>.disabled-wrap>input")
    private WebElement inputDestination;
    @FindBy(xpath = "//input[@aria-label='Check-in: - DD']")
    private WebElement checkInDay;

    @FindBy(xpath = "//input[@aria-label='Check-in: - MM']")
    private WebElement checkInMonth;

    @FindBy(xpath = "//input[@aria-label='Check-in: - YYYY']")
    private WebElement checkInYear;

    @FindBy(xpath = "//input[@aria-label='Check-out: - DD']")
    private WebElement checkOutDay;

    @FindBy(xpath = "//input[@aria-label='Check-out: - MM']")
    private WebElement checkOutMonth;

    @FindBy(xpath = "//input[@aria-label='Check-out: - YYYY']")
    private WebElement checkOutYear;

    @FindBy(css = "room-inc-dec[label='Adults']>.details>.details-controls")
    private WebElement divAdults;

    @FindBy(css = "room-inc-dec[label='Children']>.details>.details-controls")
    private WebElement divChildren;

    @FindBy(xpath = "//div[@name='guests']")
    private WebElement inputGuests;

    public void clickCookieClose() {
        cookieClose.click();
    }
    public void clickRyanairRooms(){
        ryanairRooms.click();
    }
    public void clickArrowGuests(){
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(inputGuests));
        inputGuests.findElement(By.cssSelector(".dropdown-handle>.chevron>div>svg")).click();
    }
    public void clickPlusAdults(int n){
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(divAdults));
        List<WebElement> controlButtonAdults = divAdults.findElements(By.tagName("button"));
        for(int i = 0; i < n; i++){
            controlButtonAdults.get(1).click();
        }
    }
    public void clickPlusChildren(int n){
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(divChildren));
        List<WebElement> controlButtonChildren = divChildren.findElements(By.tagName("button"));
        for(int i = 0; i < n; i++){
            controlButtonChildren.get(1).click();
        }
    }
    public boolean buttonPlusAdultsIsDisabled(){
        List<WebElement> controlButtonAdults = divAdults.findElements(By.tagName("button"));
        return controlButtonAdults.get(1).getAttribute("class").equals("core-btn inc core-btn-wrap disabled");
    }
    public boolean buttonPlusChildrenIsDisabled(){
        List<WebElement> controlButtonAdults = divChildren.findElements(By.tagName("button"));
        return controlButtonAdults.get(1).getAttribute("class").equals("core-btn inc core-btn-wrap disabled");
    }
}
