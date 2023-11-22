package LoginPage;

import Base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SuccessfulLogoutTest extends TestUtil {

    @Test
    public void successfulLogin() {

        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.click();
        usernameInput.clear();
        usernameInput.sendKeys("maria");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("thoushallnotpass");

        WebElement loginButton = driver.findElement(By.cssSelector(".btn.btn-primary"));
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.elementToBeClickable(loginButton));

        Assert.assertTrue(loginButton.isDisplayed());
        loginButton.click();

        WebElement logOutBtn = driver.findElement(By.id("logout"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(logOutBtn));

        Assert.assertTrue(loginButton.isEnabled());
        logOutBtn.click();
    }
}
