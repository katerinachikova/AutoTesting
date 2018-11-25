package pages;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;
    @FindBy(css = ".route-selector-destination>.field-type>.field-value>.disabled-wrap>input")
    private WebElement inputDestination;
    @FindBy(css = ".col-flight-search-right>button")
    private WebElement buttonContinue;
    @FindBy(css = ".dropdown-handle")
    private WebElement buttonShowPasList;
    @FindBy(css = ".last>.details-controls>.core-btn-wrap")
    private WebElement buttonPlus;
    @FindBy(css = "button.core-btn-primary>span")
    private WebElement buttonOkInfo;
    @FindBy(css = ".info-box")
    private WebElement error;

    public void setInputDestination(String destination) {
        inputDestination.sendKeys(destination);
    }
    public void clickContinue() {
        buttonContinue.click();
    }
    public void clickArrow() {
        buttonShowPasList.click();
    }
    public void clickPlus() {
        buttonPlus.click();
    }
    public void clickOk() {
        buttonOkInfo.click();
    }
    public String getError() {
        return error.getText();
    }
}
