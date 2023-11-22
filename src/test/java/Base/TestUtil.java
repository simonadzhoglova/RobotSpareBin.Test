package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestUtil {
    public WebDriver driver;
    public String appURL, browser;

    @AfterMethod
    public void TearDown() {
        driver.quit();
    }


    @BeforeMethod
    public void setupDriverAndTestURL(){
        readProperties("src/test/resources/properties");
        setupWebDriver();
        driver.get(appURL);
    }

    private void readProperties(String propertiesFile) {
        try {
            FileInputStream fileInputStream = new FileInputStream(propertiesFile);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            appURL = properties.getProperty("testURL");
            browser = properties.getProperty("browser");

        } catch (IOException e) {
            System.out.println(e);

        }
    }

    private void setupWebDriver() {
        switch (browser) {
            case "chrome":
                driver = setupChromedriver();
                break;

            case "firefox":
                driver = setupFirefoxdriver();
                break;
        }
    }

    private WebDriver setupChromedriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private WebDriver setupFirefoxdriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();

    }
}
