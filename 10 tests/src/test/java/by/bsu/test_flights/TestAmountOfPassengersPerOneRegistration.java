package by.bsu.test_flights;

import by.bsu.driver.Driver;
import by.bsu.pages.PageFlights;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAmountOfPassengersPerOneRegistration {
    private PageFlights pageFlights = new PageFlights();

    @BeforeClass
    public static void openDriver() {
        Driver.getDriver().get("https://www.ryanair.com/gb/en/");
    }
    @Test
    public void amountOfPassengersPerOneRegistrationTest() {
        pageFlights.clickCookieClose();
        pageFlights.setInputDestination("Budapest");
        pageFlights.clickArrow();
        pageFlights.clickPlusAdults(25);
        Assert.assertEquals(pageFlights.getError(),"The maximum number of passengers is 25. If there are more than 25 passengers please use our group booking form.");
    }
    @AfterClass
    public static void closeDriver() {
        Driver.closeDriver();
    }
}
