package by.bsu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageCars extends MainPage{
    @FindBy(xpath = "//label[@for='search-type-selector-cars']")
    private WebElement tabCars;

    @FindBy(css = ".cookie-popup__close")
    private WebElement cookieClose;

    @FindBy(css = ".col-departure-airport")
    private WebElement inputReturnLocation;

    public void clickTabCars(){
        tabCars.click();
    }
    public void clickCookieClose() {
        cookieClose.click();
    }
    public void clickRadioButtonReturnToDifferentLocation(){
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("label[for='car-search-type-option-one-way']>.rad>span"))).click();
    }
    public boolean inputReturnLocationIsDisplayed(){
        return true;
    }
}
