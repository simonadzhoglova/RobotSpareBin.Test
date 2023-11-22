package LoginPage;

import Base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InformationBoxTest extends TestUtil {

    @Test
    public void InformationBox(){

        WebElement infoBox = driver.findElement(By.cssSelector(".alert.alert-info"));
        Assert.assertTrue(infoBox.isDisplayed());

        WebElement robocorpLink = driver.findElement(By.cssSelector("a[href='https://www.robocorp.com']"));
        Assert.assertTrue(robocorpLink.isEnabled());
        robocorpLink.click();
        driver.navigate().back();

        WebElement visitUslink = driver.findElement(By.cssSelector("a[href='https://hub.robocorp.com'"));
        Assert.assertTrue(visitUslink.isEnabled());
        visitUslink.click();
        driver.navigate().back();

    }
}
