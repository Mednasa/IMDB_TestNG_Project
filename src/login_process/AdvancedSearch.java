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


    }
}
