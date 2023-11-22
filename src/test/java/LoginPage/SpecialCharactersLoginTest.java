package LoginPage;

import Base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SpecialCharactersLoginTest extends TestUtil {

    @Test
    public void SpecialCharactersLogin() {

        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        usernameInput.sendKeys("####m@r||@@@");
        passwordInput.sendKeys("////&&&&$$@...");

        WebElement loginButton = driver.findElement(By.cssSelector(".btn.btn-primary"));
        loginButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement alertMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.alert.alert-warning")));
        Assert.assertTrue(alertMessage.isDisplayed());
    }
}