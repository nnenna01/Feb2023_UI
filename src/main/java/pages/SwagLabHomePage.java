package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabHomePage extends BasePage {
    public SwagLabHomePage(WebDriver driver) {
        super(driver);
    }

    ///Locators (FINDING PART)
    @FindBy(xpath = "//input[@placeholder='Username']") private WebElement usernameLocator;

    @FindBy(xpath = "//input[@placeholder='Password']") private WebElement passwordLocator;

    @FindBy(id="login-button") private WebElement loginButtonLocator;


    ///Methods (DOING PART)



    public void enterUserName(String username){
        usernameLocator.sendKeys(username);
    }
    public void enterPassword(String password){
        passwordLocator.sendKeys(password);
    }

    public void clickOnLoginButton(){
        loginButtonLocator.click();
    }

}
