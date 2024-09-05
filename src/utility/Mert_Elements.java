package utility;

import org.openqa.selenium.support.PageFactory;

public class Mert_Elements extends ParentPage {

    public Mert_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }
}
