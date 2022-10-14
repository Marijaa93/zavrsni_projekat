package ZavrsniProjekat.Tests;

import ZavrsniProjekat.Objects.Home;
import ZavrsniProjekat.Objects.Profile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVersion {
    @Test
    public void VersionPrintTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Nenad\\Desktop\\Chrome drive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            Home.Login(driver, "mayaj93@gmail.com", "maja123");
            Thread.sleep(3000);
            Profile.getProfileLink(driver);
            Profile.clickProfile(driver);
            Profile.getVersion(driver);
            Profile.printVersion(driver);

            String rez = driver.findElement(By.tagName("b")).getText();
            Assert.assertEquals(rez, Profile.printVersion(driver));
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            Thread.sleep(3000);
            driver.close();
        }

    }
}


