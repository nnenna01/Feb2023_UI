package pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class NewtourRegistrationHomePage extends BasePage {
    public NewtourRegistrationHomePage(WebDriver driver) {
        super(driver);
    }


@FindBy(linkText = "REGISTER") private WebElement registerButtonLocator;






//////////////////METHODS/////////////////////




public void clickOnRegisterButton() {
    registerButtonLocator.click();


        }

        }