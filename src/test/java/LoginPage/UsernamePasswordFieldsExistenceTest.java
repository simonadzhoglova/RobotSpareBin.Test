package LoginPage;

import Base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsernamePasswordFieldsExistenceTest extends TestUtil {


    @Test
    public void FieldsExistenceTest() {

        WebElement usernameField = driver.findElement(By.cssSelector(".mb-3"));
        Assert.assertTrue(usernameField.isDisplayed());

        WebElement passwordField = driver.findElement(By.cssSelector(".mb-3"));
        Assert.assertTrue(passwordField.isDisplayed());

    }

}
