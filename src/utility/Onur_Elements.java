package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Onur_Elements extends ParentPage {
    public Onur_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "[class*='nav__userMenu navbar__user']>a span")
    public WebElement SignInBtn;

    @FindBy(xpath = "//*[text()='Sign in with IMDb']")
    public WebElement SignInWithIMDb;

    @FindBy(name = "email")
    public WebElement emailPlc;

    @FindBy(name = "password")
    public WebElement passwordPlc;

    @FindBy(id = "signInSubmit")
    public WebElement SignIn;

    @FindBy(css = "[class='a-alert-content']  li:nth-child(1) span")
    public WebElement emptyEmail;

    @FindBy(css = "[class='a-alert-content']  li:nth-child(2) span")
    public WebElement emptyPassword;

    @FindBy(xpath = "(//span[contains(text(),'password')])[1]")
    public WebElement onlyEmptyPassword;

    @FindBy(css = "[class*='account-circle ipc-btn__icon']")
    public WebElement iconBtn;

    @FindBy(css="[id='navUserMenu-contents'] :nth-child(8) span")
    public WebElement signOutBtn;

    @FindBy(xpath = "(//span[(text()='Sign In')])[1]")
    public WebElement signOutVerify;

    @FindBy(css = "[class*='navbar__user-menu-toggle--desktop']")
    public WebElement accountName;
}
