package LoginPage;

import Base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CredentialsVisibilityTest extends TestUtil {

    @Test
    public void CredentialsVisibility() {

        WebElement HelpBlock = driver.findElement(By.id("passwordHelpBlock"));
        Assert.assertTrue(HelpBlock.isDisplayed());

    }
}