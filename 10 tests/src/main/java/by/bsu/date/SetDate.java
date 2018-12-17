package by.bsu.date;

import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SetDate {
    public static void setDate(int count, WebElement day, WebElement month, WebElement year){
        Calendar calendar = Calendar.getInstance();
        if(count != 0){
            calendar.add(Calendar.DAY_OF_YEAR, count);
        }
        Date date = calendar.getTime();
        day.sendKeys(new SimpleDateFormat("dd").format(date));
        month.sendKeys(new SimpleDateFormat("MM").format(date));
        year.sendKeys(new SimpleDateFormat("yyyy").format(date));
    }
}
