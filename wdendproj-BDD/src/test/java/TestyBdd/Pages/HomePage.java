package TestyBdd.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
    private static String HOMEPAGE_URL = "https://academybugs.com/find-bugs/";

    @FindBy(how = How.CSS, using = ".sq-site-title")
    WebElement HomePageName;

    @FindBy(how = How.ID, using = "ec_add_to_cart_5")
    WebElement AddToCartButton;

    public void openHomePage() {
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(HomePageName));
    }
    public String getHomepageName() {
        return HomePageName.getText();
    }

    public void clickAddToCartButton(){
        AddToCartButton.click();
    }
}
