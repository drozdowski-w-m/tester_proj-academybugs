package TestyBdd.StepDefinitions;

import TestyBdd.Pages.HomePage;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Given("Browser is open")
    public void browser_is_open() {
        homePage.openHomePage();
    }

    @Then("I am on the main site")
    public void i_am_on_the_main_site() {
        String nazwa = homePage.getHomepageName();
        Assertions.assertEquals("AcademyBugs.com", nazwa);
    }

    @When("I click add to cart button")
    public void iClickAddToCartButton() {homePage.clickAddToCartButton();}
}
