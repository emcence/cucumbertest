package com.it.code;

import com.it.pop.FillComponent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AP_SendApplication extends FillComponent {

    @And("user selects gender$")
    public void user_selects_gender(){
        chooseGender(man);
    }
    @And("^user types first name$")
    public void user_types_first_name(){
        typeFirstName("Emilija");
    }
    @And("^user types last name$")
    public void user_types_last_name(){
        typeLastName("Petreska");
    }
    @And("^user types personal number$")
    public void user_types_personal_number(){
        typePN("159512235546");
    }
    @And("^user types post number$")
    public void user_types_post_number(){
        typePostNumber("54879");
    }
    @And("^user types postaddress$")
    public void user_types_postaddress(){
        typePostAdress("Morbudalen");
    }
    @And("^user types email address$")
    public void user_types_email_address(){
        typeEMail("testadd@test.com");
    }
    @And("^user types telefonNumber$")
    public void user_types_telefonNumber(){
        typePhone("+46732008564");
    }

    @Then("^successful message is displayed$")
    public void successful_message_is_displayed(){
        assertEquals(driver.getCurrentUrl(), ansokanUrl);
        String actual_msg = driver.findElement(By.id(ansokanValidMsg)).getText();
        assertThat(actual_msg, containsString("Tack för din ansökan,"));
        teardown();
    }

    @And("user enters following data")
    public void userEntersFollowingData(DataTable dt) {
    List<Map<String, String>> users = dt.asMaps(String.class, String.class);
   // users = dt.asList(User.class);

    for (int i=0; i<users.size(); i++){
        typeFirstName(users.get(i).get("firstName"));
        typeLastName(users.get(i).get("lastName"));
        typePN(users.get(i).get("personalNumber"));
        typePostAdress(users.get(i).get("postNumber"));
        typePostNumber(users.get(i).get("postAddress"));
        typeEMail(users.get(i).get("email"));
        typePhone(users.get(i).get("telNumber"));

    }

    }

    @Then("^validation message is shown$")
    public void validationMessageIsShown() {
        System.out.println("Validation message should be shown for invalid values");
        teardown();
    }

    @And("^user enters ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$")
    public void userEntersFirstNameAndLastNameAndPersonalNumberAndPostNumberAndPostAddressAndEmailAndTelNumber(String firstName, String lastName, String personalNumber, String postNumber, String postAddress, String email, String telNumber) {
        typeFirstName(firstName);
        typeLastName(lastName);
        typePN(personalNumber);
        typePostAdress(postAddress);
        typePostNumber(postNumber);
        typeEMail(email);
        typePhone(telNumber);
    }
}
