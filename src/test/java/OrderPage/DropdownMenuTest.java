package OrderPage;

import Base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DropdownMenuTest extends TestUtil {

    @Test
    public void dropdownMenu() {

        WebElement navBtn = driver.findElement(By.cssSelector("a[href='#/robot-order']"));
        navBtn.click();

        WebElement modalBodyOK = driver.findElement(By.cssSelector(".btn.btn-dark"));
        modalBodyOK.click();

        WebElement dropdownMenu = driver.findElement(By.id("head"));
        Assert.assertTrue(dropdownMenu.isDisplayed());
        dropdownMenu.click();

        for (int i = 1; i <= 6; i++) {
            Select select = new Select(dropdownMenu);
            select.selectByValue(String.valueOf(i));
        }
    }
}
