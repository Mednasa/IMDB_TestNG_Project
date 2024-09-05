package utility;

import org.openqa.selenium.support.PageFactory;

public class Kaan_Elements extends ParentPage {

    public Kaan_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }
}
