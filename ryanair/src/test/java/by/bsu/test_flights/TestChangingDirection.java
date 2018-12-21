package by.bsu.test_flights;

import by.bsu.driver.Driver;
import by.bsu.pages.PageFlights;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestChangingDirection {
    private PageFlights pageFlights = new PageFlights();

    @BeforeClass
    public static void openDriver() {
        Driver.getDriver().get("https://www.ryanair.com/gb/en/");
    }
    @Test
    public void changingDirectionTest() {
        pageFlights.clickCookieClose();
        pageFlights.setInputDestination("Budapest");
        pageFlights.clickButtonSwapAirports();
        Assert.assertTrue(pageFlights.airportsAreSwap());
    }
    @AfterClass
    public static void closeDriver() {
        Driver.closeDriver();
    }
}
