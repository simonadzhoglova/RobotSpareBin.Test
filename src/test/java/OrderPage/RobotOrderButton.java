package OrderPage;

import Base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RobotOrderButton extends TestUtil {

    @Test
    public void RobotOrderBtn(){

        WebElement orderBtn = driver.findElement(By.cssSelector("a[href='#/robot-order']"));
        Assert.assertTrue(orderBtn.isDisplayed());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(orderBtn));

        Assert.assertTrue(orderBtn.isEnabled());

        orderBtn.click();
    }
}
