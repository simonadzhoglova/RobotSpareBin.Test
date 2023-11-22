package HomePage;

import Base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FieldsTest extends TestUtil {

    @Test
    public void fieldsTest() {

        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.click();
        usernameInput.sendKeys("maria");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.click();
        passwordInput.sendKeys("thoushallnotpass");

        WebElement loginButton = driver.findElement(By.cssSelector(".btn.btn-primary"));
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.elementToBeClickable(loginButton));

        Assert.assertTrue(loginButton.isDisplayed());
        loginButton.click();

        WebElement firstNamefield = driver.findElement(By.name("firstname"));
        firstNamefield.sendKeys("maria");

        WebElement lastNameField = driver.findElement(By.id("lastname"));
        lastNameField.sendKeys("smith");

    }
}
