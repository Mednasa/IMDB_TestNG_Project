package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Oguzhan_Elements extends ParentPage {
    public Oguzhan_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "[class='imdb-header-search__input searchTypeahead__input react-autosuggest__input']")
    public WebElement searchBox;
    @FindBy(css = "[class='nav-search__search-submit searchform__submit']")
    public WebElement searchButton;
    @FindBy(xpath = "//div[text()='1980']")
    public WebElement listBox;
    @FindBy(css = "[class='hero__primary-text']")
    public WebElement starWarsAssert;
    @FindBy(xpath = "//label[@data-testid='category-selector-button']")
    public WebElement allButton;
    @FindBy(linkText = "Kötü Adam Olmak")
    public WebElement breakingBadAssert;
    @FindBy(xpath = "(//span[text()='Titles'])")
    public WebElement titlesButton;
    @FindBy(xpath = "(//span[text()='TV Episodes'])")
    public WebElement tvEpisodesButton;
    @FindBy(linkText = "Sons of Anarchy")
    public WebElement sonsOfAnarcyAssert;
    @FindBy(css = "[class='ipc-menu mdc-menu ipc-menu--not-initialized ipc-menu--on-baseAlt ipc-menu--anchored ipc-menu--open ipc-menu--expand-from-top-left searchCatSelector-menu ipc-menu--anim-appear-done ipc-menu--anim-enter-done'] ul li+li+li+li")
    public WebElement celebsButton;
    @FindBy(css = "[class='ipc-btn ipc-btn--single-padding ipc-btn--center-align-content ipc-btn--default-height ipc-btn--core-base ipc-btn--theme-base ipc-btn--on-textPrimary ipc-text-button searchCatSelector-button searchCatSelector__opener searchform__categories nav-search-form__categories'] span")
    public WebElement celebsButton2;
    @FindBy(linkText = "Tom Hanks")
    public WebElement tomHanksAssert;
    @FindBy(css = "[class='ipc-list searchCatSelector ipc-list--baseAlt'] li+li+li+li+li")
    public WebElement companiesButton;
    @FindBy(css = "[class='ipc-btn ipc-btn--single-padding ipc-btn--center-align-content ipc-btn--default-height ipc-btn--core-base ipc-btn--theme-base ipc-btn--on-textPrimary ipc-text-button searchCatSelector-button searchCatSelector__opener searchform__categories nav-search-form__categories'] span")
    public WebElement companiesButton2;
    @FindBy(linkText = "Warner Bros.")
    public WebElement warnerBrosAssert;
    @FindBy(xpath = "(//span[text()='Keywords'])")
    public WebElement keywordsButton;
    @FindBy(linkText = "dark comedy")
    public WebElement comedyAssert;











}


