package ZavrsniProjekat.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoard {

    public static final String SHIFT_PLANING_URL = "https://itbootcampxgeneration.humanity.com/app/schedule/employee/week/overview/overview/7%2c5%2c2021/";
    public static final String TIME_CLOCK_URL = "https://itbootcampxgeneration.humanity.com/app/timeclock/";
    public static final String LEAVE_URL = "https://itbootcampxgeneration.humanity.com/app/requests/vacation/";
    public static final String TRAINING_URL = "https://itbootcampxgeneration.humanity.com/app/training/";
    public static final String STAFF_URL = "https://itbootcampxgeneration.humanity.com/app/staff/list/load/true/";
    public static final String AVAILABILITY_URL = "https://itbootcampxgeneration.humanity.com/fe/availability/#/requests/week/2021-05-30/1";
    public static final String PAYROLL_URL = "https://itbootcampxgeneration.humanity.com/app/payroll/scheduled-hours/";
    public static final String REPORTS_URL = "https://itbootcampxgeneration.humanity.com/app/reports/dashboard/";
    public static final String DASHBOARD_XPATH = "//*[@id=\"sn_dashboard\"]/span/i";
    public static final String SHIFT_PLANING_XPATH = "//*[@id=\"sn_schedule\"]/span/p";
    public static final String TIME_CLOCK_XPATH = "//*[@id=\"sn_timeclock\"]/span/p";
    public static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span/p";
    public static final String TRAINING_XPATH = "//*[@id=\"sn_training\"]/span";
    public static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]/span";
    public static final String AVAILABILITY_XPATH = "//*[@id=\"sn_availability\"]/span/i";
    public static final String PAYROLL_XPATH = "//*//*[@id=\"sn_payroll\"]/span";
    public static final String REPORTS_XPATH = "//*//*[@id=\"sn_reports\"]/span";
    public static final String SETTINGS_XPATH = "//*[@id=\"sn_admin\"]/span/i";
    public static final String PROFIL_BUTTON_XPATH = "//*[@id=\"wrap_us_menu\"]";
    public static final String PROFIL_LINK_XPATH = "//*[@id=\"userm\"]/div/a[1]";



    // Dashboard element
    public static WebElement getDashboardFromMenu(WebDriver driver) {
        WebElement we = driver.findElement(By.xpath(DASHBOARD_XPATH));
        return we;
    }

    public static void clickDashboardFromMenu(WebDriver driver) {
        getDashboardFromMenu(driver).click();
    }

    // ShifPlaning element
    public static WebElement getShiftPlaningFromMenu(WebDriver driver) {
        WebElement we = driver.findElement(By.xpath(SHIFT_PLANING_XPATH));
        return we;
    }

    public static void clickShiftPlaningFromMenu(WebDriver driver) {
        getShiftPlaningFromMenu(driver).click();
    }

    // TimeClock element
    public static WebElement getTimeClockFromMenu(WebDriver driver) {
        return driver.findElement(By.xpath(TIME_CLOCK_XPATH));
    }

    public static void clickTimeClockFromMenu(WebDriver driver) {
        getTimeClockFromMenu(driver).click();
    }

    // Leave-Vacations element
    public static WebElement getLeaveFromMenu(WebDriver driver) {
        return driver.findElement(By.xpath(LEAVE_XPATH));
    }

    public static void clickLeaveFromMenu(WebDriver driver) {
        getLeaveFromMenu(driver).click();
    }

    // Training element
    public static WebElement getTrainingFromMenu(WebDriver driver) {
        return driver.findElement(By.xpath(TRAINING_XPATH));
    }

    public static void clickTrainingFromMenu(WebDriver driver) {
        getTrainingFromMenu(driver).click();
    }

    // Staff element
    public static WebElement getStaffFromMenu(WebDriver driver) {
        return driver.findElement(By.xpath(STAFF_XPATH));
    }

    public static void clickStaffFromMenu(WebDriver driver) {
        getStaffFromMenu(driver).click();
    }

    // Availability element
    public static WebElement getAvailabilityFromMenu(WebDriver driver) {
        return driver.findElement(By.xpath(AVAILABILITY_XPATH));
    }

    public static void clickAvailabilityFromMenu(WebDriver driver) {
        getAvailabilityFromMenu(driver).click();
    }

    // Payroll element
    public static WebElement getPayrollFromMenu(WebDriver driver) {
        return driver.findElement(By.xpath(PAYROLL_XPATH));
    }

    public static void clickPayrollFromMenu(WebDriver driver) {
        getPayrollFromMenu(driver).click();
    }

    // Reports element
    public static WebElement getReportsFromMenu(WebDriver driver) {
        return driver.findElement(By.xpath(REPORTS_XPATH));
    }

    public static void clickReportsFromMenu(WebDriver driver) {
        getReportsFromMenu(driver).click();
    }

    // Settings element
    public static WebElement getSettingsFromMenu(WebDriver driver) {
        return driver.findElement(By.xpath(SETTINGS_XPATH));
    }

    public static void clickSettingsButton(WebDriver driver) {
        getSettingsFromMenu(driver).click();
    }

    // Profil element
    public static WebElement getProfilButton(WebDriver driver) {
        return driver.findElement(By.xpath(PROFIL_BUTTON_XPATH));
    }

    public static void clickProfilButton(WebDriver driver) {
        getProfilButton(driver).click();
    }

    public static WebElement getHoverProfilLink(WebDriver driver) {
        return driver.findElement(By.xpath(PROFIL_LINK_XPATH));
    }

    public static void clickProfilLInk(WebDriver driver) {
        getHoverProfilLink(driver).click();
    }

}


