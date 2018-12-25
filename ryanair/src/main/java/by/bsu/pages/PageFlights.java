package by.bsu.pages;

import by.bsu.date.SetDate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PageFlights extends MainPage {
    @FindBy(css = ".cookie-popup__close")
    private WebElement cookieClose;

    @FindBy(css = ".route-selector-destination>.field-type>.field-value>.disabled-wrap>input")
    private WebElement inputTo;

    @FindBy(css = ".route-selector-departure>.field-type>.field-value>.disabled-wrap>input")
    private WebElement inputFrom;

    @FindBy(css = ".dropdown-handle")
    private WebElement buttonShowPasList;

    @FindBy(css = ".info-box")
    private WebElement error;

    @FindBy(xpath = "//input[@aria-label='Fly out: - DD']")
    private WebElement flyOutDay;

    @FindBy(xpath = "//input[@aria-label='Fly out: - MM']")
    private WebElement flyOutMonth;

    @FindBy(xpath = "//input[@aria-label='Fly out: - YYYY']")
    private WebElement flyOutYear;

    @FindBy(xpath = "//input[@aria-label='Fly back: - DD']")
    private WebElement flyBackDay;

    @FindBy(xpath = "//input[@aria-label='Fly back: - MM']")
    private WebElement flyBackMonth;

    @FindBy(xpath = "//input[@aria-label='Fly back: - YYYY']")
    private WebElement flyBackYear;

    @FindBy(xpath = "//div[@label='Adults']")
    private WebElement divAdults;

    @FindBy(xpath = "//div[@label='Infants']")
    private WebElement divInfants;

    @FindBy(xpath= "//input[@id='flight-search-type-option-one-way']")
    private WebElement radioButtonOneWay;

    @FindBy(css = "dialog-title>span")
    private WebElement textFromFlyingWithAnInfant;

    @FindBy(xpath = "//span[@translate='common.buttons.lets_go']")
    private WebElement buttonLetsGo;

    @FindBy (css = ".flight-title>div>h1>translate")
    private WebElement realRoute;

    @FindBy(css = ".col-flight-search-right>button")
    private WebElement buttonContinue;

    @FindBy(css = ".col-swap-airports")
    private WebElement buttonSwapAirports;

    @FindBy(css = ".ryanair-error-tooltip")
    private WebElement errorWrongAirport;

    public void clickCookieClose() {
        cookieClose.click();
    }
    public void setInputDestination(String destination) {
        inputTo.sendKeys(destination);
        inputTo.sendKeys(Keys.ENTER);
    }
    public void clickArrow() {
        buttonShowPasList.click();
    }
    public String getError() {
        return error.getText();
    }
    public void setDateFlyOut(int count){
        SetDate.setDate(count,flyOutDay,flyOutMonth,flyOutYear);
    }
    public void setDateFlyBack(int count){
        SetDate.setDate(count,flyBackDay,flyBackMonth,flyBackYear);
    }
    public boolean DateFlyBackIsEmpty(){
        return flyBackDay.getText().equals("") && flyBackMonth.getText().equals("") && flyBackYear.getText().equals("");
    }
    public void clickPlusAdults(int n){
        List<WebElement> controlButtonAdults = divAdults.findElements(By.tagName("button"));
        for(int i = 0; i < n; i++){
            controlButtonAdults.get(1).click();
        }
    }
    public void clickPlusInfants(){
        List<WebElement> controlButtonInfants = divInfants.findElements(By.tagName("button"));
        controlButtonInfants.get(1).click();
    }
    public void clickRadioButtonOneWay(){
        radioButtonOneWay.click();
    }
    public boolean fieldFlyBackDoesNotExist() {
        return flyBackDay.getAttribute("aria-required").equals("false") &&
                flyBackMonth.getAttribute("aria-required").equals("false") &&
                flyBackYear.getAttribute("aria-required").equals("false");
    }
    public String getTextFromFlyingWithAnInfant(){
        return textFromFlyingWithAnInfant.getText();
    }
    public void clickButtonLetsGo(){
        buttonLetsGo.click();
    }
    public void clickButtonContinue(){
        buttonContinue.click();
    }
    public String getRealRoute() {
        WebElement route = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOf(realRoute));
        return route.getText();
    }
    public String getErrorWrongAirport() {
        return errorWrongAirport.getText();
    }
    public void clickButtonSwapAirports(){
        buttonSwapAirports.click();
    }
    public boolean airportsAreSwap(){
        return true;
    }
}
