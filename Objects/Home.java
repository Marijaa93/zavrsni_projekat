package ZavrsniProjekat.Objects;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Home {

    public static final String URL="https://www.humanity.com/";
    private static final String FULL_NAME_XPATH="//div[@class='input-wrapper']//input[@placeholder='Full Name']";
    private static final String WORK_EMAIL_XPATH="//div[@class='input-wrapper']//input[@placeholder='Work Email']";
    private static final String START_FREE1_XPATH="//input[@id='free-trial-link-01']";
    private static final String LOGIN_XPATH="//p[contains(text(),'LOGIN')]";
    private static final String SUBMIT_LOGIN_XPATH="//button[contains(text(),'Log in')]";
    private static final String START_FREE2_XPATH="//div[@id='tryForFree']";
    private static final String ABOUT_US_XPATH="//div[@class='header-holder']";
    private static final String EMAIL_XPATH="//input[@id='email']";
    private static final String PASSWORD_XPATH="//input[@id='password']";
    private static final String URL_TEST="https://marijajovanovic1.humanity.com/app/dashboard/";



    public static WebElement getFullName(WebDriver driver) {
        return driver.findElement(By.xpath(FULL_NAME_XPATH));
    }
    public static void clickFullName(WebDriver driver) {
        getFullName(driver).click();
    }
    public static void inputFullName(WebDriver driver, String data) {
        getFullName(driver).sendKeys(data);
    }

    public static WebElement getWorkEmail(WebDriver driver) {
        return driver.findElement(By.xpath(WORK_EMAIL_XPATH));
    }
    public static void clickWorkEmail(WebDriver driver) {
        getWorkEmail(driver).click();
    }
    public static void inputWorkEmail(WebDriver driver, String data) {
        getWorkEmail(driver).sendKeys(data);
    }

    public static WebElement getStartFree1(WebDriver driver) {
        return driver.findElement(By.xpath(START_FREE1_XPATH));
    }
    public static void clickStartFree1(WebDriver driver) {
        getStartFree1(driver).click();
    }

    public static WebElement getStartFree2(WebDriver driver) {
        return driver.findElement(By.xpath(START_FREE2_XPATH));
    }
    public static void clickStartFree2(WebDriver driver) {
        getStartFree2(driver).click();
    }

    public static WebElement getAboutUs(WebDriver driver) {
        return driver.findElement(By.xpath(ABOUT_US_XPATH));
    }
    public static void clickAboutUs(WebDriver driver) {
        getAboutUs(driver).click();
    }

    public static WebElement getLogin(WebDriver driver) {
        return driver.findElement(By.xpath(LOGIN_XPATH));
    }
    public static void clickLogin(WebDriver driver) {
        getLogin(driver).click();
    }

    public static WebElement getEmail(WebDriver driver) {
        return driver.findElement(By.xpath(EMAIL_XPATH));
    }
    public static void inputEmail(WebDriver driver, String data) {
        getEmail(driver).sendKeys(data);
    }

    public static WebElement getPassword(WebDriver driver) {
        return driver.findElement(By.xpath(PASSWORD_XPATH));
    }
    public static void inputPassword(WebDriver driver, String data) {
        getPassword(driver).sendKeys(data);
    }

    public static WebElement getSLogin(WebDriver driver) {
        return driver.findElement(By.xpath(SUBMIT_LOGIN_XPATH));
    }
    public static void clickSLogin(WebDriver driver) {
        getSLogin(driver).click();
    }

    public static void Login(WebDriver driver, String email, String password) {
        driver.get(Home.URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        getLogin(driver).click();
        inputEmail(driver, email);
        inputPassword(driver, password);
        getSLogin(driver).click();
    }

    public static boolean LoginTest(WebDriver driver) {
        String url = driver.getCurrentUrl();
        if (url.equalsIgnoreCase(URL_TEST)) {
            System.out.println("Uspesno logovanje.");
            return true;
        } else {
            System.out.println("Neuspesno logovanje.");
            System.out.println(url);
            return false;
        }
    }

}

