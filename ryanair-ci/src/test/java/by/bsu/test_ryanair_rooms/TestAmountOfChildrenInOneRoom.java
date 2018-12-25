package by.bsu.test_ryanair_rooms;

import by.bsu.driver.Driver;
import by.bsu.pages.PageRyanairRooms;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAmountOfChildrenInOneRoom {
    private PageRyanairRooms pageRyanairRooms = new PageRyanairRooms();

    @BeforeClass
    public static void openDriver() {
        Driver.getDriver().get("https://www.ryanair.com/gb/en/");
    }
    @Test
    public void amountOfChildrenInOneRoomTest() {
        pageRyanairRooms.clickRyanairRooms();
        pageRyanairRooms.clickCookieClose();
        pageRyanairRooms.clickArrowGuests();
        pageRyanairRooms.clickPlusChildren(3);
        Assert.assertTrue(pageRyanairRooms.buttonPlusChildrenIsDisabled());

    }
    @AfterClass
    public static void closeDriver() {
        Driver.closeDriver();
    }
}
