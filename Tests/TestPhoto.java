package ZavrsniProjekat.Tests;

import ZavrsniProjekat.Objects.Home;
import ZavrsniProjekat.Objects.Profile;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPhoto {
    @Test
    public void testPhoto() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Nenad\\Desktop\\Chrome drive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            Home.Login(driver, "mayaj93@gmail.com", "maja123");
            Thread.sleep(3000);

            String putanja = "\"C:\\Users\\Nenad\\Desktop\\New folder (2)\\pngwing.com.png\"";
            Profile.clickProfile(driver);
            Profile.clickSettings(driver);
            Thread.sleep(3000);
            Profile.clickDetails(driver);
            Thread.sleep(3000);
            Profile.uploadPhoto(driver, putanja);
            Thread.sleep(3000);
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,2000)");
            Thread.sleep(1000);
            Profile.clickSaveChg(driver);
            Assert.assertTrue(Profile.testPhoto(driver));
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            Thread.sleep(5000);
            driver.close();
        }
    }
}

