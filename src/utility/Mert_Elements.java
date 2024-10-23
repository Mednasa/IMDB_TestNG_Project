package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mert_Elements extends ParentPage {

    public Mert_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//label[@data-testid='category-selector-button']")
    public WebElement AllBtn;

    @FindBy(xpath = "//span[text()='Advanced Search']")
    public WebElement AdvancedSearchBtn;

    @FindBy(xpath = "(//label[@class='ipc-accordion__item__label ipc-accordion__item__label--indent-full'])[1]")
    public WebElement TitleNameBtn;

    @FindBy(xpath = "(//input[@class='ipc-textinput__input'])[1]")
    public WebElement TitleNameInput;

    @FindBy(xpath = "//span[text()='See results']")
    public WebElement SeeResultBtn;

    @FindBy(xpath = "//h3[text()='1. Baba']")
    public WebElement filmName;

    @FindBy(xpath = "//div[text()='Title type']")
    public WebElement titleType;

    @FindBy(xpath = "//span[text()='Movie']")
    public WebElement movie;

    @FindBy(xpath = "//span[text()='TV Series']")
    public WebElement tvSeries;

    @FindBy(css = "[class='sc-d1bbe268-0 eZzkdn ipc-chip ipc-chip--on-base']")
    public WebElement filmNameBtn;

    @FindBy(xpath = "//h3[text()='1. Terrifier 3']")
    public WebElement filmName1;

    @FindBy(xpath = "(//span[text()='Movie'])[1]")
    public WebElement movieBtn;

    @FindBy(xpath = "(//span[text()='TV Series'])[1]")
    public WebElement tvSeriesBtn;

    @FindBy(xpath = "//div[text()='IMDb ratings']")
    public WebElement imdbRatings;

    @FindBy(css = "[name='imdb-ratings-max-input']")
    public WebElement minRatings;

    @FindBy(css = "[name='imdb-ratings-min-input']")
    public WebElement maxRatings;

    @FindBy(xpath = "//span[text()='8.8']")
    public WebElement firstMovieRating;

    @FindBy(css = "[class='sc-d1bbe268-0 eZzkdn ipc-chip ipc-chip--on-base']")
    public WebElement closeRatingBtn;

    @FindBy(xpath = "//div[text()='Genre']")
    public WebElement genreBtn;

    @FindBy(xpath = "//span[text()='Music']")
    public WebElement genreMusic;

    @FindBy(xpath = "//span[text()='Thriller']")
    public WebElement genreThriller;

}
