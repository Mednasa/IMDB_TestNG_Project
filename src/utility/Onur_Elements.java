package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Onur_Elements extends ParentPage {
    public Onur_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "[class='nav__userMenu navbar__user sc-jHNiPY jEwaYR']>a span")
    public WebElement SignInBtn;

    @FindBy(xpath = "//*[text()='Sign in with IMDb']")
    public WebElement SignInWithIMDb;

    @FindBy(name = "email")
    public WebElement emailPlc;

    @FindBy(name = "password")
    public WebElement passwordPlc;

    @FindBy(id = "signInSubmit")
    public WebElement SignIn;

}
