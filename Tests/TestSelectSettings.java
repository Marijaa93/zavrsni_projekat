package ZavrsniProjekat.Tests;

import ZavrsniProjekat.Objects.Home;
import ZavrsniProjekat.Objects.Menu;
import ZavrsniProjekat.Objects.Settings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelectSettings {
    @Test
    public void testSelection() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Nenad\\Desktop\\Chrome drive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String zemlja = "Serbia";
        String jezik = "Serbian (machine)";
        String vreme = "24 hour";

        try {
           Home.Login(driver, "mayaj93@gmail.com", "maja123");
            Thread.sleep(1000);
            Menu.clickSettings(driver);
            Thread.sleep(1000);
            Settings.SelectAll(driver, zemlja, jezik, vreme);
            Thread.sleep(1000);
            Assert.assertTrue(Settings.SelectAll(driver, zemlja, jezik, vreme));
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            Thread.sleep(3000);
            driver.close();
        }
    }
}

