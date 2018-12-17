package by.bsu.test_car_hire;

import by.bsu.driver.Driver;
import by.bsu.pages.PageCars;
import by.bsu.pages.PageRyanairRooms;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFieldForReturnToDifferentLocationIsAppeared {
    private PageCars pageCars = new PageCars();

    @BeforeClass
    public static void openDriver() {
        Driver.getDriver().get("https://www.ryanair.com/gb/en/");
    }
    @Test
    public void fieldForReturnToDifferentLocationIsAppearedTest() {
        pageCars.clickTabCars();
        pageCars.clickCookieClose();
        pageCars.clickRadioButtonReturnToDifferentLocation();
        Assert.assertTrue(pageCars.inputReturnLocationIsDisplayed());
    }
    @AfterClass
    public static void closeDriver() {
        Driver.closeDriver();
    }
}
