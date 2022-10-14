package ZavrsniProjekat.Tests;

import ZavrsniProjekat.Objects.Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogIn {
    @Test

    public void TestLogin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Nenad\\Desktop\\Chrome drive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            Home.Login(driver, "mayaj93@gmail.com", "maja123");
            Thread.sleep(3000);
            Assert.assertTrue(Home.LoginTest(driver));
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            Thread.sleep(5000);
            driver.close();
        }
    }
}

