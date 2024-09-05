package utility;

import org.openqa.selenium.support.PageFactory;

public class Nigar_Elements extends ParentPage {
    public Nigar_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }
}
