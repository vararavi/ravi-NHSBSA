package BaseDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class PajeObjects extends DriverManager{
    public void searchText(String searchString){
        driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys(searchString);
        driver.findElement(By.name("btnK")).click();
    }

    public boolean isOnHomePage() {
        String title = driver.getTitle();
        Assert.assertEquals("Title does not have Google","Google", title);
        return  true;
    }

    public boolean isResultFound() {
        String result = driver.findElement(By.id("resultStats")).getText();
        Assert.assertTrue("result not found", Integer.parseInt(result.split(" ")[1].replace(",", "")) > 1);
        return true;
    }

    public void startButton(){
        driver.findElement(By.id("next-button")).click();
    }

    public void nextButton(){
        driver.findElement(By.id("next-button")).click();
    }

    public void selectYes() {
        driver.findElement(By.id("label-yes")).click();
    }

    public void selectNo() {
        driver.findElement(By.id("label-no")).click();
    }

    public void selectWale(){
        driver.findElement(By.id("label-wales")).click();
        nextButton();
    }

    public void selectDob(String year){
        driver.findElement(By.id("dob-day")).sendKeys("31");
        driver.findElement(By.id("dob-month")).sendKeys("01");
        driver.findElement(By.id("dob-year")).sendKeys(year);
        nextButton();
    }

    public void selectFullTimeEducation(){
        selectYes();
        nextButton();
    }

    public void verifyEligibilityCheck(){
        String result = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals("Done",result);
    }

    public void selectPartner(){
        selectNo();
        nextButton();
    }

    public void selectTaxBenfits(){
        selectYes();
        nextButton();
    }

    public void slectuniversalCredit(){
        driver.findElement(By.xpath("//input[@id='different-benefit']/parent::label")).click();
        nextButton();
        driver.findElement(By.xpath("//input[@id='penCredit']/parent::label")).click();
        nextButton();
        driver.findElement(By.xpath("//input[@id='guaranteecreditwithsavingcredit']/parent::label")).click();
        nextButton();
    }

}
