package OrderPage;

import Base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButtonsTest extends TestUtil {

    @Test
    public void RadioBtns() {
        WebElement navBtn = driver.findElement(By.cssSelector("a[href='#/robot-order']"));
        navBtn.click();

        WebElement modalBodyOK = driver.findElement(By.cssSelector(".btn.btn-dark"));
        modalBodyOK.click();

        for  (int i = 1; i <= 6; i++) {
            WebElement radioBtn = driver.findElement(By.id("id-body-" + i));
            radioBtn.click();
        }
    }
}
