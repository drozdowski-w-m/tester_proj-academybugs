package TestyBdd.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{
// najpierw wykonywany jest plik .feature potem loginPage potem loginPageSteps
    @FindBy(how = How.NAME, using = "login")
    WebElement loginButton;

    @FindBy(how = How.ID, using = "username")
    WebElement loginInput;

    @FindBy(how = How.ID, using = "password")
    WebElement passwdInput;

    @FindBy(how = How.CSS, using = ".ec_product_added_to_cart")
    WebElement infoAfterAdding;
    //String color = infoAfterAdding.getCssValue("background-color");

    @FindBy(how = How.ID, using = "reg_email")
    WebElement registerLogin;

    @FindBy(how = How.NAME, using = "register")
    WebElement registerButton;

    @FindBy(how = How.ID, using = "reg_password")
    WebElement registerPassword;

    public void clickLoginButton(){
        loginButton.click();
    }
    public void clickRegisterButton(){
        registerButton.click();
    }

    public void fillLogin(String login){
        loginInput.clear();
        loginInput.sendKeys(login);
    }

    public void fillPassword(String password){
        passwdInput.clear();
        passwdInput.sendKeys(password);
    }

    public String getInfoAfterAdding(){
        return infoAfterAdding.getCssValue("background-color");
    }

    public void fillRegisterLogin(String login){
        loginInput.clear();
        loginInput.sendKeys(login);
    }

    public void fillRegisterPassword(String password){
        passwdInput.clear();
        passwdInput.sendKeys(password);
    }


}
