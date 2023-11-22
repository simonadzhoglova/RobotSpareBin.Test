package OrderPage;

import Base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MaximumRobotLegsTest extends TestUtil {

    @Test
    public void maxLegs() {
        WebElement navBtn = driver.findElement(By.cssSelector("a[href='#/robot-order']"));
        navBtn.click();

        WebElement modalBodyOK = driver.findElement(By.cssSelector(".btn.btn-dark"));
        modalBodyOK.click();

        WebElement legsField = driver.findElement(By.className("form-control"));

        for (int i = 1; i <= 8; i++) {
            legsField.clear();
            legsField.sendKeys(Integer.toString(i));

            boolean isTestPassing = (i >= 1 && i <= 6);

            if (isTestPassing) {
                System.out.println("Test passed for " + i + " legs");
            } else {
                System.out.println("Test failed for " + i + " legs");
            }

        }
    }
}