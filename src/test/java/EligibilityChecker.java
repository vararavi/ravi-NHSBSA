import BaseDriver.PajeObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EligibilityChecker {
    PajeObjects objects;

    public EligibilityChecker(){
        objects = new PajeObjects();
    }
    @Given("^I am a person from Wales$")
    public void i_am_a_person_from_Wales() throws Throwable {
        objects.startButton();
    }

    @Then("^I should get a result of whether I will get help or not$")
    public void i_should_get_a_result_of_whether_I_will_get_help_or_not() throws Throwable {
        objects.verifyEligibilityCheck();
    }

    @When("^I entered DOB for (\\d+) years$")
    public void iEnteredDOBForYears(int age) {
        int year = 2021-age;
        if(age == 16 ){
            objects.selectWale();
            objects.selectDob(Integer.toString(year));
            objects.selectFullTimeEducation();
        }
        else if(age > 16 && age < 60){
            objects.selectWale();
            objects.selectDob(Integer.toString(year));
            objects.selectPartner();
            objects.selectTaxBenfits();
            objects.slectuniversalCredit();
        }
        else if(age > 60){
            objects.selectWale();
            objects.selectDob(Integer.toString(year));
            objects.selectFullTimeEducation();
        }
    }
}
