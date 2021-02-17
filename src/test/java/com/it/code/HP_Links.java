package com.it.code;

import com.it.domasna.FillComponent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HP_Links extends FillComponent {
    @Given("^user is on Home page$")
    public void user_is_on_Home_page(){
        setUp();
        goToHomePage();
    }
    @When("^user clicks on link Utbildningar$")
    public void user_clicks_on_link_Utbildningar(){
        driver.findElement(By.xpath(utbildningar)).click();
    }
    @Then("^page Utbildningar is opened$")
    public void page_Utbildningar_is_opened(){
        String actualTxt = driver.findElement(By.xpath("//*[@id=\"main\"]/div/h1")).getText();

        assertEquals(driver.getCurrentUrl(),"https://www.iths.se/courses/");
        assertEquals("Utbildningar",actualTxt);
        teardown();
    }
    @When("^user clicks on link OmOss$")
    public void user_clicks_on_link_OmOss(){
        driver.findElement(By.xpath(omOss)).click();
    }
    @Then("^page OmOss is opened$")
    public void page_OmOss_is_opened(){
        String actualTxt = driver.findElement(By.xpath("//*[@id=\"page\"]/div/div[2]/div[2]/div[2]/div/h1")).getText();

        assertEquals(driver.getCurrentUrl(),"https://www.iths.se/om-oss/");
        assertEquals("Hos oss startar din IT-karriär",actualTxt);
        teardown();
    }

    @When("user clicks on link Nyheter")
    public void user_clicks_on_link_nyheter() {
        driver.findElement(By.xpath(nyheter)).click();

    }

    @Then("page Nyheter is opened")
    public void page_nyheter_is_opened() {
        String actualTxt = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/h1")).getText();

        assertEquals(driver.getCurrentUrl(),"https://www.iths.se/nyheter/");
        assertEquals("Nyheter",actualTxt);
        teardown();
    }
}
