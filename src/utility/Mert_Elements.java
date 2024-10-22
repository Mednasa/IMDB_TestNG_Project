package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mert_Elements extends ParentPage {

    public Mert_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "(//*[@class='ipc-icon ipc-icon--arrow-drop-down ipc-btn__icon ipc-btn__icon--post searchCatSelector-button-post-icon'])[1]")
    public WebElement AllBtn;

    @FindBy(xpath = "//span[text()='Advanced Search']")
    public WebElement AdvancedSearchBtn;

}
