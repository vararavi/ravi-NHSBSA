package BaseDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by prkum on 08-07-2017.
 */
public class DriverManager {
    public static WebDriver driver;

    public void openBrowser(){
        //Download Webdriver from http://www.seleniumhq.org/download/ and provide unzipped exe path
        File file = new File("src/test/resources/seleniumdrivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsoluteFile().toString());
        driver=new ChromeDriver();
        driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("nhsuk-cookie-banner__link_accept_analytics")).click();
        driver.manage().window().maximize();
    }

    public void closeBrowser(){
        driver.quit();
    }
}
