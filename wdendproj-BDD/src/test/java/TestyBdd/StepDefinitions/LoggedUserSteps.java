package TestyBdd.StepDefinitions;

import TestyBdd.Pages.LoggedUserPage;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class LoggedUserSteps {

    LoggedUserPage loggedUserPage = new LoggedUserPage();

    @Then("I am registered")
    public void iAmRegistered() {
        Assertions.assertTrue(loggedUserPage.checkIfDisplayed());
    }
}