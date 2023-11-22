package OrderPage;

import Base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalBodyAndButtonsTest extends TestUtil {

    @Test
    public void modalBodyButtons(){
        WebElement navBtn = driver.findElement(By.cssSelector("a[href='#/robot-order']"));
        navBtn.click();

        WebElement modalBody= driver.findElement(By.className("modal-body"));
        Assert.assertTrue(modalBody.isDisplayed());

        WebElement btn1 = driver.findElement(By.cssSelector(".btn.btn-dark"));
        btn1.click();

        //WebElement btn2 = driver.findElement(By.cssSelector(".btn.btn-warning"));
        //btn2.click();

        //WebElement btn3 = driver.findElement(By.cssSelector(".btn.btn-danger"));
        //btn3.click();

        //WebElement btn4 = driver.findElement(By.cssSelector(".btn.btn-success"));
        //btn4.click();

    }
}
