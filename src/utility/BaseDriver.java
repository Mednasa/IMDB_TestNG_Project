package utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;


public class BaseDriver {

    public static Logger logger = LogManager.getLogger();
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Onur_Elements o_imdb;
    public static Nigar_Elements n_imdb;
    public static Oguzhan_Elements oz_imdb;
    public static Kaan_Elements k_imdb;
    public static Mert_Elements m_imdb;
    public static Zehra_Elements z_imdb;

    @BeforeClass(groups = {"Regression Test", "Smoke Test"})
    public void InitialProcedure() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        o_imdb = new Onur_Elements();
        n_imdb = new Nigar_Elements();
        oz_imdb = new Oguzhan_Elements();
        k_imdb = new Kaan_Elements();
        m_imdb = new Mert_Elements();
        z_imdb = new Zehra_Elements();
        DashBoardPage();
    }

    @AfterClass(groups = {"Regression Test", "Smoke Test"})
    public void CloseProcedure() {
        ParentPage.wait(2);
        driver.quit();
        logger.info("Driver Closed");
    }

    public void DashBoardPage() {
        logger.info("Dashboard Page Procedure Started");
        driver.get(ConfigReader.getProperty("URL"));
        logger.info("Dashboard Page Procedure Finished");
    }

    @BeforeMethod
    public void beforeMethod() {
        logger.info("Method started");
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        logger.info(result.getName() + " Method finished " + (result.getStatus() == 1 ? "Passed" : "failed"));
    }
}
