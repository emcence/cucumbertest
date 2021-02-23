package com.it.code;

import com.it.pop.FillComponent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AP_Stages extends FillComponent {
    @When("^user clicks on stage 1$")
    public void user_clicks_on_stage_1(){
        driver.findElement(By.xpath(stage1)).click();
    }

    @Then("^text for stage 1 is shown$")
    public void text_for_stage_1_is_shown(){
        String actualTxt = driver.findElement(By.xpath("//*[@id=\"steps__description--0\"]/h3")).getText();

        assertEquals(driver.getCurrentUrl(),"https://www.iths.se/ansokan-it-hogskolan/");
        assertEquals("1. Ansöka", actualTxt);
        teardown();

    }
    @When("^user clicks on stage 2$")
    public void user_clicks_on_stage_2(){
        driver.findElement(By.id("steps__box--1")).click();
    }

    @Then("^text for stage 2 is shown$")
    public void text_for_stage_2_is_shown(){
        String actualTxt = driver.findElement(By.xpath("//*[@id=\"steps__description--1\"]/h3")).getText();

        assertEquals(driver.getCurrentUrl(),"https://www.iths.se/ansokan-it-hogskolan/");
        assertEquals("2. Behörighet",actualTxt);
        teardown();
    }
    @When("^user clicks on stage 3$")
    public void user_clicks_on_stage_3(){
        driver.findElement(By.id("steps__box--2")).click();
    }

    @Then("^text for stage 3 is shown$")
    public void text_for_stage_3_is_shown(){
        String actualTxt = driver.findElement(By.xpath("//*[@id=\"steps__description--2\"]/h3")).getText();

        assertEquals(driver.getCurrentUrl(),"https://www.iths.se/ansokan-it-hogskolan/");
        assertEquals("3. Antagningsprov",actualTxt);
        teardown();
    }
    @When("^user clicks on stage 4$")
    public void user_clicks_on_stage_4(){
        driver.findElement(By.id("steps__box--3")).click();
    }

    @Then("^text for stage 4 is shown$")
    public void text_for_stage_4_is_shown(){
        String actualTxt = driver.findElement(By.xpath("//*[@id=\"steps__description--3\"]/h3")).getText();

        assertEquals(driver.getCurrentUrl(),"https://www.iths.se/ansokan-it-hogskolan/");
        assertEquals("4. Antagning",actualTxt);
        teardown();
    }
    @When("^user clicks on stage 5$")
    public void user_clicks_on_stage_5(){
        driver.findElement(By.id("steps__box--4")).click();
    }

    @Then("^text for stage 5 is shown$")
    public void text_for_stage_5_is_shown(){
        String actualTxt = driver.findElement(By.xpath("//*[@id=\"steps__description--4\"]/h3")).getText();

        assertEquals(driver.getCurrentUrl(),"https://www.iths.se/ansokan-it-hogskolan/");
        assertEquals("5. Utbildningsstart",actualTxt);
        teardown();
    }

    @And("^user clicks on apply here button$")
    public void user_clicks_on_apply_here_button(){
        String mainWindow = driver.getWindowHandle();

        //Go to Ansök här button
        driver.findElement(By.xpath(ansokBtn)).click();

        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
        driver.get("https://iths.alvis.se/Student/kurskatalog.aspx");
//Perform whatever actions you want done on the secondary tab, let’s pretend we’re logging in somewhere
        assertEquals(driver.getCurrentUrl(),"https://iths.alvis.se/Student/kurskatalog.aspx");

        driver.switchTo().window(mainWindow);
        assertEquals(driver.getCurrentUrl(),"https://iths.alvis.se/Student/kurskatalog.aspx");
//Perform whatever actions you want done on the main tab, we’ll click a button

        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");

    }
    @Then("^kurskatalog page is opened$")
    public void kurskatalog_page_is_opened() {
        teardown();
    }
}
