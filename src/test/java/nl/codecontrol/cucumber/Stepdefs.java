package nl.codecontrol.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class LoginHelperMethods {
    static String createRegisteredUser() {
        // create user magic
        return "new user";
    }

    static void login(String user) {
        // login magic
    }

    public static String getCurrentLoggedInUser() {
        // return current logged in user
        return "new user";
    }
}

public class Stepdefs {
    private String currentUser;

    @Given("I am registered")
    public void i_am_registered() {
        this.currentUser = LoginHelperMethods.createRegisteredUser();
    }

    @When("I login")
    public void i_login() {
        LoginHelperMethods.login(this.currentUser);
    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        assertThat(LoginHelperMethods.getCurrentLoggedInUser(), is(this.currentUser));
    }
}