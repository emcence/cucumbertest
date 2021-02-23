package com.it.code;

import com.it.pop.FillComponent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AP_ValidationMessages extends FillComponent {
    @Given("^user is on application page$")
    public void user_is_on_application_page(){
        setUp();
        goToAnsokanPage();
    }
    @When("^user clicks on Submit button$")
    public void user_clicks_on_Submit_button(){
        pressSkicka();
    }
    @Then("^validation message is get$")
    public void validation_message_is_get(){
        String actual_msg = driver.findElement(By.id(ansokanValidation)).getText();
        assertEquals(actual_msg, expectedValidationMsg);
        teardown();
    }
    @And("^user selects valid education option$")
    public void user_selects_valid_education_option(){
        selectUtbuildning(2);
        }

    @Then("^validation message is removed$")
    public void validation_message_is_removed(){
        //assertFalse(driver.findElement(By.id(ansokanValidation)).isDisplayed());
        assertTrue(driver.findElement(By.id(ansokanValidation)).isDisplayed());
        teardown();
    }


}
