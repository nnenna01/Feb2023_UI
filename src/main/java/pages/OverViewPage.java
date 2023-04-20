package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverViewPage extends BasePage{
    public OverViewPage(WebDriver driver) {
        super(driver);
    }


@FindBy(id="finish") private WebElement finishButtonLocator;






//////////////////METHODS/////////////////////




public void clickOnFinishButton() {
    finishButtonLocator.click();


        }

        }