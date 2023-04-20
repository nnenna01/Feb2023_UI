package pages2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class NewtourGetNotePage extends BasePage {
    public NewtourGetNotePage(WebDriver driver) {
        super(driver);
    }


@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")
private WebElement getNoteMsgLocator;






//////////////////METHODS/////////////////////




public String getNoteMsg() {

   return getNoteMsgLocator.getText();

}


}