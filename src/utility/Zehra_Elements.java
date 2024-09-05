package utility;

import org.openqa.selenium.support.PageFactory;

public class Zehra_Elements extends ParentPage {
    public Zehra_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }
}
