package TestyBdd.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoggedUserPage extends BasePage{

    @FindBy(how = How.CSS, using = ".woocommerce-MyAccount-content")
    WebElement infoAfterRegistration;

    public boolean checkIfDisplayed(){
        return infoAfterRegistration.isDisplayed();
    }

}
