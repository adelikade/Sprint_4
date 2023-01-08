package questions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.MainOrder;
import pom.MainPage;

import java.util.concurrent.TimeUnit;

public class SamokatOrder {

    WebDriver driver;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MainOrder mainPage = new MainOrder(driver);
        mainPage.open();
    }

    @Test
    public void howMuchClickCheck() {

    }
}
