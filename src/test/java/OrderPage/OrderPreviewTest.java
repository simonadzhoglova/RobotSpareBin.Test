package OrderPage;

import Base.TestUtil;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderPreviewTest extends TestUtil {

    @DataProvider(name = "robotCombinations")
    public Object[][] provideTestParameters() {
        List<Object[]> testParameters = new ArrayList<>();
        String head;
        String body;
        String legs;
        try {
            CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/RobotParameters.csv"));
            List<String[]> csvData;
            csvData = csvReader.readAll();
            for (String[] rowData : csvData) {
                head = rowData[0];
                body = rowData[1];
                legs = rowData[2];
                testParameters.add(new Object[]{head, body, legs});
            }
        } catch (CsvException | IOException e) {
            throw new RuntimeException(e);
        }
        return testParameters.toArray(new Object[0][3]);
    }




    @Test(dataProvider = "robotCombinations")
        public void testRobotPicPreview(String head, String body, String legs) throws InterruptedException {

        WebElement navBtn = driver.findElement(By.cssSelector("a[href='#/robot-order']"));
        navBtn.click();
        Thread.sleep(500);

        WebElement modalBodyOK = driver.findElement(By.cssSelector(".btn.btn-dark"));
        modalBodyOK.click();
        Thread.sleep(500);

        Select headDropdown = new Select(driver.findElement(By.id("head")));
        headDropdown.selectByVisibleText(head);
        Thread.sleep(500);

        WebElement bodyRadioButton = driver.findElement(By.id(body));
        bodyRadioButton.click();
        Thread.sleep(500);

        WebElement legsField = driver.findElement(By.className("form-control"));
        legsField.clear();
        legsField.sendKeys(legs);
        Thread.sleep(500);

        WebElement adressField = driver.findElement(By.id("address"));
        adressField.click();
        adressField.sendKeys("1234");

        WebElement picPreview = driver.findElement(By.id("preview"));
        picPreview.click();
        Assert.assertTrue(picPreview.isDisplayed());
        Thread.sleep(500);

        }
    }



