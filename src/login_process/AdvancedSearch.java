package login_process;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.ConfigReader;

public class AdvancedSearch extends BaseDriver {

    @BeforeClass
    public void Login(){

        o_imdb.myClick(o_imdb.SignInBtn);
        o_imdb.myClick(o_imdb.SignInWithIMDb);
        o_imdb.mySendKeys(o_imdb.emailPlc, ConfigReader.getProperty("email"));
        o_imdb.mySendKeys(o_imdb.passwordPlc, ConfigReader.getProperty("password"));
        o_imdb.myClick(o_imdb.SignIn);

    }

    @Test
    public void AdvancedSearch(){
        m_imdb.myJsClick(m_imdb.AllBtn);
        m_imdb.myClick(m_imdb.AdvancedSearchBtn);
        m_imdb.waitUntilElementToBeClickable(m_imdb.TitleNameBtn);
        m_imdb.myJsClick(m_imdb.TitleNameBtn);
        m_imdb.mySendKeys(m_imdb.TitleNameInput, "The Godfather");
        new Actions(BaseDriver.driver).doubleClick(m_imdb.SeeResultBtn).build().perform();

        m_imdb.verifyContainsText(m_imdb.filmName, "Baba");

        m_imdb.waitUntilVisibilityOf(m_imdb.filmNameBtn);
        m_imdb.myJsClick(m_imdb.filmNameBtn);
        m_imdb.myJsClick(m_imdb.titleType);
        m_imdb.myJsClick(m_imdb.movie);
        m_imdb.myJsClick(m_imdb.tvSeries);
        new Actions(BaseDriver.driver).doubleClick(m_imdb.SeeResultBtn).build().perform();
        m_imdb.scrollToElement(m_imdb.filmName1);

        m_imdb.verifyContainsText(m_imdb.filmName1,"Terrifier 3");

        m_imdb.myJsClick(m_imdb.movieBtn);
        m_imdb.myJsClick(m_imdb.tvSeriesBtn);
        m_imdb.myJsClick(m_imdb.imdbRatings);
        m_imdb.myJsClick(m_imdb.minRatings);
        m_imdb.mySendKeys(m_imdb.minRatings, "5");
        m_imdb.myJsClick(m_imdb.maxRatings);
        m_imdb.mySendKeys(m_imdb.maxRatings, "10");
        m_imdb.myJsClick(m_imdb.SeeResultBtn);

        m_imdb.verifyContainsText(m_imdb.firstMovieRating, "8.8");

        m_imdb.myJsClick(m_imdb.closeRatingBtn);
        m_imdb.myJsClick(m_imdb.genreBtn);
        m_imdb.myJsClick(m_imdb.genreMusic);
        m_imdb.myJsClick(m_imdb.genreThriller);
        m_imdb.myJsClick(m_imdb.SeeResultBtn);

        m_imdb.verifyContainsText(m_imdb.genreFilm,"The Perfection");
        m_imdb.verifyContainsText(m_imdb.genreMusicFilm,"musical");

        m_imdb.myJsClick(m_imdb.closeGenreMusic);
        m_imdb.myJsClick(m_imdb.closeGenreThriller);
        m_imdb.myJsClick(m_imdb.awardsRecognitionBtn);
        m_imdb.myJsClick(m_imdb.oscarWinningBtn);
        m_imdb.myJsClick(m_imdb.goldenGlobeWinningBtn);
        m_imdb.myJsClick(m_imdb.SeeResultBtn);
        m_imdb.myJsClick(m_imdb.firstFilm);

        m_imdb.verifyContainsText(m_imdb.wonOscar,"Won 2 Oscars");

        BaseDriver.driver.navigate().back();
        m_imdb.myJsClick(m_imdb.companiesBtn);
        m_imdb.myJsClick(m_imdb.waltDisney);
        m_imdb.myJsClick(m_imdb.SeeResultBtn);

        m_imdb.verifyContainsText(m_imdb.firstFilmOfWaltDisney,"1. Rivals");




    }
}
