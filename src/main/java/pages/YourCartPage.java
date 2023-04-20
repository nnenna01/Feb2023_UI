package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage extends BasePage{
    public YourCartPage(WebDriver driver) {
        super(driver);
    }


@FindBy(id="checkout") private WebElement checkOutButtonLocator;


////////////////////////METHODS////////////////////////////////////////

public void clickOnCheckOutButton() {
    checkOutButtonLocator.click();

}

        }

