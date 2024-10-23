package login_process;

import org.openqa.selenium.interactions.Actions;
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

        // Movies
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myClick(oz_imdb.releaseCalendarButton);
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.top250MoviesButton);
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.mostPopularMoviesButton);
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.browseMoviesbyGenreButton);
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.topBoxOfficeButton);
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.showtimesTicketsButtonButton);
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.movieNewsButton);
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.indiaMovieSpotlightButton);

        // TV Shows
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.whatsonTVStreamingButton);
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.top250TVShowsButton);
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.mostPopularTVShowsButton);
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.browseTVShowsbyGenreButton);
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.tVNewsButton);

        // Awards & Events
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.oscarsButton);
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.halloweenButton);
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myJsClick(oz_imdb.hispanicHeritageMonthButton);
        BaseDriver.driver.navigate().back();
        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);






    }


}
