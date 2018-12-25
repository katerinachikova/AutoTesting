package by.bsu.test_flights;

import by.bsu.driver.Driver;
import by.bsu.pages.PageFlights;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestDateFlyBackCannotBeEarlierThanDateFlyOut {
    private PageFlights pageFlights = new PageFlights();

    @BeforeClass
    public static void openDriver() {
        Driver.getDriver().get("https://www.ryanair.com/gb/en/");
    }
    @Test
    public void ifSelectOneWayThatNoFieldFleBackTest() {
        pageFlights.clickCookieClose();
        pageFlights.setInputDestination("Budapest");
        pageFlights.setDateFlyBack(0);
        pageFlights.setDateFlyOut(2);
        Assert.assertTrue(pageFlights.DateFlyBackIsEmpty());
    }
    @AfterClass
    public static void closeDriver() {
        Driver.closeDriver();
    }
}
