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
    @FindBy(xpath = "//ul[@class='react-autosuggest__suggestions-list anim-enter-done']//li[1]//a")
    public WebElement listBox;
    @FindBy(xpath = "(//span[text()='All'])[1]")
    public WebElement allButton;
    @FindBy(xpath = "(//span[text()='Titles'])")
    public WebElement titlesButton;
    @FindBy(xpath = "(//span[text()='TV Episodes'])")
    public WebElement tvEpisodesButton;
    @FindBy(xpath = "(//span[text()='Celebs'])")
    public WebElement celebsButton;
    @FindBy(xpath = "(//span[text()='Companies'])")
    public WebElement companiesButton;
    @FindBy(xpath = "(//span[text()='Keywords'])")
    public WebElement keywordsButton;

}


