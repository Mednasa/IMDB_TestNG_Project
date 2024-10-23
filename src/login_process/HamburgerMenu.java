package login_process;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.ConfigReader;
import utility.ParentPage;

public class HamburgerMenu extends BaseDriver {


    ParentPage pp = new ParentPage();

    @BeforeClass
    public void Login() {

        o_imdb.myClick(o_imdb.SignInBtn);
        o_imdb.myClick(o_imdb.SignInWithIMDb);
        o_imdb.mySendKeys(o_imdb.emailPlc, ConfigReader.getProperty("email"));
        o_imdb.mySendKeys(o_imdb.passwordPlc, ConfigReader.getProperty("password"));
        o_imdb.myClick(o_imdb.SignIn);
    }

    @Test
    public void hamburgerMenu() {

//         Movies
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myClick(oz_imdb.releaseCalendarButton);
        oz_imdb.verifyContainsText(oz_imdb.releaseCalendarButtonAssert, "Upcoming releases");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.top250MoviesButton);
        oz_imdb.verifyContainsText(oz_imdb.top250MoviesButtonAssert, "IMDb Top 250 Movies");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.mostPopularMoviesButton);
        oz_imdb.verifyContainsText(oz_imdb.mostPopularMoviesButtonAssert, "Most Popular Movies");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.browseMoviesbyGenreButton);
        oz_imdb.verifyContainsText(oz_imdb.browseMoviesbyGenreButtonAssert, "Popular interests");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.topBoxOfficeButton);
        oz_imdb.verifyContainsText(oz_imdb.topBoxOfficeButtonAssert, "Top Box Office (US)");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.showtimesTicketsButtonButton);
        oz_imdb.verifyContainsText(oz_imdb.showtimesTicketsButtonButtonAssert, "Showtimes");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.movieNewsButton);
        oz_imdb.verifyContainsText(oz_imdb.movieNewsButtonAssert, "Movie News");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.indiaMovieSpotlightButton);
        oz_imdb.verifyContainsText(oz_imdb.indiaMovieSpotlightButtonAssert, "Top Rated India Movies");

//         TV Shows
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.whatsonTVStreamingButton);
        oz_imdb.verifyContainsText(oz_imdb.whatsonTVStreamingButtonAssert, "WHAT'S ON TV AND STREAMING");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.top250TVShowsButton);
        oz_imdb.verifyContainsText(oz_imdb.top250TVShowsButtonAssert, "Top 250 TV Shows");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.mostPopularTVShowsButton);
        oz_imdb.verifyContainsText(oz_imdb.mostPopularTVShowsButtonAssert, "Most Popular TV Shows");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.browseTVShowsbyGenreButton);
        oz_imdb.verifyContainsText(oz_imdb.browseTVShowsbyGenreButtonAssert, "Popular interests");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.tVNewsButton);
        oz_imdb.verifyContainsText(oz_imdb.tVNewsButtonAssert, "TV News");

//         Awards & Events
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.oscarsButton);
        oz_imdb.verifyContainsText(oz_imdb.oscarsButtonAssert, "Oscars");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.halloweenButton);
        oz_imdb.verifyContainsText(oz_imdb.halloweenButtonAssert, "Scary Good");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.hispanicHeritageMonthButton);
        oz_imdb.verifyContainsText(oz_imdb.hispanicHeritageMonthButtonAssert, "IMDb SPOTLIGHT");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.mamiButton);
        oz_imdb.verifyContainsText(oz_imdb.mamiButtonAssert, "MAMI Mumbai Film Festival");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.sTARmeterAwardsButton);
        oz_imdb.verifyContainsText(oz_imdb.sTARmeterAwardsButtonAssert, "IMDb STARmeter AWARDS");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.awardsCentralButton);
        oz_imdb.verifyContainsText(oz_imdb.awardsCentralButtonAssert, "AWARDS CENTRAL");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.festivalCentralButton);
        oz_imdb.verifyContainsText(oz_imdb.festivalCentralButtonAssert, "FESTIVAL CENTRAL");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.allEventsButton);
        oz_imdb.verifyContainsText(oz_imdb.awardsCentralButtonAssert, "All events");

//         Celebs
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.bornTodayButton);
        oz_imdb.verifyContainsText(oz_imdb.bornTodayButtonAssert, "Advanced name search");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.mostPopularCelebsButton);
        oz_imdb.verifyContainsText(oz_imdb.mostPopularCelebsButtonAssert, "Most Popular Celebs");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.celebrityNewsButton);
        oz_imdb.verifyContainsText(oz_imdb.celebrityNewsButtonAssert, "Celebrity News");

//         Watch
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.whattoWatchButton);
        oz_imdb.verifyContainsText(oz_imdb.whattoWatchButtonAssert, "What to Watch - IMDb");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.latestTrailersButton);
        oz_imdb.verifyContainsText(oz_imdb.latestTrailersButtonAssert, "Watch New Movie & TV Trailers");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.iMDbOriginalsButton);
        oz_imdb.verifyContainsText(oz_imdb.iMDbOriginalsButtonAssert, "IMDb ORIGINALS");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.iMDbPicksButton);
        oz_imdb.verifyContainsText(oz_imdb.iMDbPicksButtonAssert, "IMDb PICKS");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.iMDbSpotlightButton);
        oz_imdb.verifyContainsText(oz_imdb.iMDbSpotlightButtonAssert, "IMDb SPOTLIGHT");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.iMDbPodcastsButton);
        oz_imdb.verifyContainsText(oz_imdb.iMDbPicksButtonAssert, "Advanced title search");

//        // Community
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.helpCenterButton);
        oz_imdb.verifyContainsText(oz_imdb.helpCenterButtonAssert, "Help Center");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.contributorZoneButton);
        oz_imdb.verifyContainsText(oz_imdb.contributorZoneButtonAssert, "What is a Contributor?");
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.pollsButton);
        oz_imdb.verifyContainsText(oz_imdb.pollsButtonAssert, "IMDb Polls");

//         Recently viewed
        BaseDriver.driver.navigate().back();
        oz_imdb.mySendKeys(oz_imdb.searchBox, "Star Wars Empire Strikes Back");
        oz_imdb.myJsClick(oz_imdb.listBox);
        oz_imdb.verifyContainsText(oz_imdb.starWarsAssert, "Yıldız Savaşları: İmparator");
        BaseDriver.driver.navigate().back();
        oz_imdb.scrollToElement(oz_imdb.addRecentlyWatchlist);
        oz_imdb.addRecentlyWatchlist.isDisplayed();
        oz_imdb.myJsClick(oz_imdb.addRecentlyWatchlist);
        oz_imdb.removeRecentlyWatchlist.isDisplayed();



    }


}
