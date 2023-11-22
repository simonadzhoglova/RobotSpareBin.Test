package LoginPage;

import Base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class IncorrectCredentialsTest extends TestUtil {

    @Test
    public void IncorrectCredentials() {

        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.click();
        usernameInput.clear();
        usernameInput.sendKeys("bunny");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("1234");

        Assert.assertEquals(usernameInput.getAttribute("value"), "maria", "Username input field value is incorrect.");
        //Assert.assertEquals(passwordInput.getAttribute("value"), "thoushallnotpass", "Password input field value is incorrect.");

        WebElement loginButton = driver.findElement(By.cssSelector(".btn.btn-primary"));
        loginButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement alertMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.alert.alert-warning")));

    }
}