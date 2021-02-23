package com.it.code;

import com.it.pop.FillComponent;
import io.cucumber.java.en.When;

public class HP_Buttons extends FillComponent {
    @When("user clicks on button Alla Utbildningar")
    public void userClicksOnButtonAllaUtbildningar() {
        testHomePageAllUtbBtn();
    }
}
