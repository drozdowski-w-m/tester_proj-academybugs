package TestyBdd.StepDefinitions;

import TestyBdd.Pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginPageSteps {
    // najpierw wykonywany jest plik .feature potem loginPage potem loginPageSteps
    //w tym pliku tutaj to opisujemy co sie ma stac
    LoginPage loginPage = new LoginPage();

    @When("I fill login input with {string}")
    public void i_fill_login_input_with(String string) {
        loginPage.fillLogin(string);
    }

    @When("I fill password input with {string}")
    public void iFillPasswordInputWith(String string) {
        loginPage.fillPassword(string);
    }

    @When("I click Login button")
    public void iClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I check if information after login is {string}")
    public void iCheckIfInformationAfterLoginIs(String zaciagniete) {
        String information = loginPage.getInfoAfterAdding();
        Assertions.assertEquals(zaciagniete, information);

    }

    @When("I fill registration email input with {string}")
    public void iFillRegistrationEmailInputWith(String email) {
        loginPage.fillRegisterLogin(email);
    }

    @When("I fill registration password input with {string}")
    public void iFillRegistrationPasswordInputWith(String password) {
        loginPage.fillRegisterPassword(password);
    }

    @When("I click registration button")
    public void iClickRegistrationButton() {
        loginPage.clickRegisterButton();
    }

    @Then("I check if color of information div after adding is {string}")
    public void iCheckIfInformationAfterAddingIs(String pobrane) {
        String information = loginPage.getInfoAfterAdding();
        Assertions.assertEquals(pobrane, information);
    }
}
