import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStep {
    WebDriver driver;

    @Given("^navigate to Gmail page$")
    public void navigate_to_Gmail_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:\\Ravindra\\chromedriver_92-4515\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
    }

    @When("^user logged in using username as “userA” and password as “password”$")
    public void user_logged_in_using_username_as_userA_and_password_as_password() throws Throwable {
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("label-england")).click();
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("label-no")).click();
        driver.findElement(By.id("next-button")).click();
    }

    @Then("^home page should be displayed$")
    public void home_page_should_be_displayed() throws Throwable {
        driver.quit();
    }

}
