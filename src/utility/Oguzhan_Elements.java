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
    @FindBy(xpath = "(//span[@class='ipc-list-item__text'])[51]")
    public WebElement celebsButton;
    @FindBy(linkText = "Tom Hanks")
    public WebElement tomHanksAssert;
    @FindBy(css = "[class='ipc-list searchCatSelector ipc-list--baseAlt'] li+li+li+li+li")
    public WebElement companiesButton;
    @FindBy(xpath = "(//span[text()='Keywords'])")
    public WebElement keywordsButton;






}


