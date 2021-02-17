package com.it.cucumbercode;

import com.it.domasna.FillComponent;
import com.it.pop.FillForm;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllSeps extends FillForm {

    @Given("^user is on form page$")
    public void user_is_on_form_page() {
        setUp();
    }

    @When("^user fill in name and job title$")
    public void user_fill_in_name_and_job_title() {
        //Type in first name
        TypeFirstName("Ana");

        //Type in last name
        TypeLastName("Manjana");

        //Type in job title
        TypeJobTitle("Volshebnik");
    }
    @When("^user enters level of education$")
    public void user_enters_level_of_education() {
        ChooseEducation(gradsschool);
    }
    @When("^user enters gender$")
    public void user_enters_gender() {
        ChooseGender(preferNotSay);
    }
    @When("^user enters years of experience$")
    public void user_enters_years_of_experience() {
        ChooseYearsOfExperience(3);
    }
    @When("^add date$")
    public void add_date() {
        ChooseDate("10/23/2020");
    }
    @When("^press submit button$")
    public void press_submit_button() {

        //click Submit button
        PresSubmit();
    }
    @Then("^success message is displayed$")
    public void success_message_is_displayed() {
        //Test that url is correct
        String url = driver.getCurrentUrl();
        String currentUrl = "https://formy-project.herokuapp.com/thanks";
        assertEquals(url, currentUrl);

        //Test that title is correct
        String title = driver.getTitle();
        String currentTitle = "Formy";
        assertEquals(title, currentTitle);

        //close the driver
        teardown();
    }

}
