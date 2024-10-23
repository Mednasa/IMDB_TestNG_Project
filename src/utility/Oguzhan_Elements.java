package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Oguzhan_Elements extends ParentPage {
    public Oguzhan_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    //SearchBox

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

    //HamburgerMenü

    @FindBy(css = "[class='ipc-responsive-button__text']")
    public WebElement hamburgerMenuButton;
    @FindBy(linkText = "Release Calendar")
    public WebElement releaseCalendarButton;
    @FindBy(xpath = "(//span[text()='Upcoming releases'])")
    public WebElement releaseCalendarButtonAssert;
    @FindBy(linkText = "Top 250 Movies")
    public WebElement top250MoviesButton;
    @FindBy(css = "[class='ipc-title__text chart-layout-specific-title-text']")
    public WebElement top250MoviesButtonAssert;
    @FindBy(linkText = "Most Popular Movies")
    public WebElement mostPopularMoviesButton;
    @FindBy(css = "[class='ipc-title__text chart-layout-specific-title-text']")
    public WebElement mostPopularMoviesButtonAssert;
    @FindBy(linkText = "Browse Movies by Genre")
    public WebElement browseMoviesbyGenreButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement browseMoviesbyGenreButtonAssert;
    @FindBy(linkText = "Top Box Office")
    public WebElement topBoxOfficeButton;
    @FindBy(css = "[class='ipc-title__text chart-layout-specific-title-text']")
    public WebElement topBoxOfficeButtonAssert;
    @FindBy(linkText = "Showtimes & Tickets")
    public WebElement showtimesTicketsButtonButton;
    @FindBy(linkText = "Showtimes")
    public WebElement showtimesTicketsButtonButtonAssert;
    @FindBy(linkText = "Movie News")
    public WebElement movieNewsButton;
    @FindBy(css = "[id='news-card-section']")
    public WebElement movieNewsButtonAssert;
    @FindBy(linkText = "India Movie Spotlight")
    public WebElement indiaMovieSpotlightButton;
    @FindBy(css = "[class='ipc-title ipc-title--base ipc-title--subsection-title ipc-title--on-textPrimary'] h3")
    public WebElement indiaMovieSpotlightButtonAssert;
    @FindBy(linkText = "What's on TV & Streaming")
    public WebElement whatsonTVStreamingButton;
    @FindBy(linkText = "WHAT'S ON TV AND STREAMING")
    public WebElement whatsonTVStreamingButtonAssert;
    @FindBy(linkText = "Top 250 TV Shows")
    public WebElement top250TVShowsButton;
    @FindBy(css = "[class='ipc-title__text chart-layout-specific-title-text']")
    public WebElement top250TVShowsButtonAssert;
    @FindBy(linkText = "Most Popular TV Shows")
    public WebElement mostPopularTVShowsButton;
    @FindBy(css = "[class='ipc-title__text chart-layout-specific-title-text']")
    public WebElement mostPopularTVShowsButtonAssert;
    @FindBy(linkText = "Browse TV Shows by Genre")
    public WebElement browseTVShowsbyGenreButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement browseTVShowsbyGenreButtonAssert;
    @FindBy(linkText = "TV News")
    public WebElement tVNewsButton;
    @FindBy(css = "[id='news-card-section']")
    public WebElement tVNewsButtonAssert;
    @FindBy(linkText = "Oscars")
    public WebElement oscarsButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement oscarsButtonAssert;
    @FindBy(linkText = "Halloween")
    public WebElement halloweenButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement halloweenButtonAssert;
    @FindBy(linkText = "Hispanic Heritage Month")
    public WebElement hispanicHeritageMonthButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement hispanicHeritageMonthButtonAssert;
    @FindBy(linkText = "MAMI")
    public WebElement mamiButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement mamiButtonAssert;
    @FindBy(linkText = "STARmeter Awards")
    public WebElement sTARmeterAwardsButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement sTARmeterAwardsButtonAssert;
    @FindBy(linkText = "Awards Central")
    public WebElement awardsCentralButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement awardsCentralButtonAssert;
    @FindBy(linkText = "Festival Central")
    public WebElement festivalCentralButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement festivalCentralButtonAssert;
    @FindBy(linkText = "All Events")
    public WebElement allEventsButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement allEventsButtonAssert;
    @FindBy(linkText = "Born Today")
    public WebElement bornTodayButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement bornTodayButtonAssert;
    @FindBy(linkText = "Most Popular Celebs")
    public WebElement mostPopularCelebsButton;
    @FindBy(css = "[class='ipc-title__text chart-layout-specific-title-text']")
    public WebElement mostPopularCelebsButtonAssert;
    @FindBy(linkText = "Celebrity News")
    public WebElement celebrityNewsButton;
    @FindBy(css = "[id='news-card-section']")
    public WebElement celebrityNewsButtonAssert;
    @FindBy(linkText = "What to Watch")
    public WebElement whattoWatchButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement whattoWatchButtonAssert;
    @FindBy(linkText = "Latest Trailers")
    public WebElement latestTrailersButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement latestTrailersButtonAssert;
    @FindBy(linkText = "IMDb Originals")
    public WebElement iMDbOriginalsButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement iMDbOriginalsButtonAssert;
    @FindBy(linkText = "IMDb Picks")
    public WebElement iMDbPicksButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement iMDbPicksButtonAssert;
    @FindBy(linkText = "IMDb Spotlight")
    public WebElement iMDbSpotlightButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement iMDbSpotlightButtonAssert;
    @FindBy(linkText = "IMDb Podcasts")
    public WebElement iMDbPodcastsButton;
    @FindBy(css = "[class='ipc-title__text']")
    public WebElement iMDbPodcastsButtonAssert;
    @FindBy(linkText = "Help Center")
    public WebElement helpCenterButton;
    @FindBy(css = "[class='a-spacing-base a-size-extra-large']")
    public WebElement helpCenterButtonAssert;
    @FindBy(linkText = "Contributor Zone")
    public WebElement contributorZoneButton;
    @FindBy(css = "[class='a-box-inner'] h2")
    public WebElement contributorZoneButtonAssert;
    @FindBy(linkText = "Polls")
    public WebElement pollsButton;
    @FindBy(css = "[class='poll homepage']")
    public WebElement pollsButtonAssert;
    @FindBy(css = "[class='ipc-watchlist-ribbon ipc-focusable ipc-watchlist-ribbon--m ipc-watchlist-ribbon--baseAlt ipc-watchlist-ribbon--onImage ipc-poster__watchlist-ribbon']")
    public WebElement addRecentlyWatchlist;
    @FindBy(css = "[class='ipc-watchlist-ribbon ipc-focusable ipc-watchlist-ribbon--m ipc-watchlist-ribbon--baseAlt ipc-watchlist-ribbon--onImage ipc-watchlist-ribbon--inWatchlist ipc-poster__watchlist-ribbon']")
    public WebElement removeRecentlyWatchlist;








}


