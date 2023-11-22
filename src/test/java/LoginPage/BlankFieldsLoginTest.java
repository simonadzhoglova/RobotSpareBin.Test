package LoginPage;

import Base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class BlankFieldsLoginTest extends TestUtil {


    @Test
    public void BlankFieldsLogin(){

        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        usernameInput.sendKeys("");
        passwordInput.sendKeys("");

        WebElement loginButton = driver.findElement(By.cssSelector(".btn.btn-primary"));
        loginButton.click();
    }
}