package by.bsu.test_flights;

import by.bsu.driver.Driver;
import by.bsu.pages.PageFlights;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSearchForTicketsToTheSelectedCity {
    private PageFlights pageFlights = new PageFlights();

    @BeforeClass
    public static void openDriver() {
        Driver.getDriver().get("https://www.ryanair.com/gb/en/");
    }
    @Test
    public void searchForTicketsToTheSelectedCityTest() {
        pageFlights.clickCookieClose();
        pageFlights.setInputDestination("Budapest");
        pageFlights.setDateFlyOut(0);
        pageFlights.setDateFlyBack(2);
        pageFlights.clickButtonLetsGo();
        pageFlights.clickButtonOkInfo();
        Assert.assertEquals(pageFlights.getRealRoute(), "Dublin to Budapest");
    }
    @AfterClass
    public static void closeDriver() {
        Driver.closeDriver();
    }

}
