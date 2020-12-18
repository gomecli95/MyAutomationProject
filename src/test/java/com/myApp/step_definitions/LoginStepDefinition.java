package com.myApp.step_definitions;

import io.cucumber.java.en.*;

public class LoginStepDefinition {

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println("User is on landing page");
    }


    @When("user enters credentials")
    public void user_enters_credentials() {
        System.out.println("User enters credentials");
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        System.out.println("User clicks login button");
    }
    @Then("user supposed to see welcome message")
    public void user_supposed_to_see_welcome_message() {
        System.out.println("User supposed to see welcome message");
    }

}
