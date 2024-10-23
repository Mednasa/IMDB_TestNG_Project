package login_process;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.ConfigReader;
import utility.ParentPage;

public class SearchBox extends BaseDriver {

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
    public void searchBox() {

        oz_imdb.mySendKeys(oz_imdb.searchBox, "Star Wars Empire Strikes Back");
        oz_imdb.myJsClick(oz_imdb.listBox);
        oz_imdb.verifyContainsText(oz_imdb.starWarsAssert, "Yıldız Savaşları: İmparator");
        oz_imdb.myJsClick(oz_imdb.allButton);
        oz_imdb.myJsClick(oz_imdb.titlesButton);
        oz_imdb.mySendKeys(oz_imdb.searchBox, "Breaking Bad");
        oz_imdb.myJsClick(oz_imdb.searchButton);
        oz_imdb.verifyContainsText(oz_imdb.breakingBadAssert, "Kötü Adam Olmak");
        oz_imdb.myJsClick(oz_imdb.titlesButton);
        oz_imdb.myJsClick(oz_imdb.tvEpisodesButton);
        oz_imdb.mySendKeys(oz_imdb.searchBox, "Sons Of Anarcy");
        oz_imdb.myJsClick(oz_imdb.searchButton);
        oz_imdb.verifyContainsText(oz_imdb.sonsOfAnarcyAssert, "Sons of Anarchy");
        oz_imdb.myJsClick(oz_imdb.tvEpisodesButton);
        oz_imdb.myJsClick(oz_imdb.celebsButton);
        oz_imdb.mySendKeys(oz_imdb.searchBox, "Tom Hanks");
        oz_imdb.myJsClick(oz_imdb.searchButton);
        oz_imdb.verifyContainsText(oz_imdb.tomHanksAssert, "Tom Hanks");
        oz_imdb.myJsClick(oz_imdb.celebsButton2);
        oz_imdb.myClick(oz_imdb.companiesButton);
        oz_imdb.mySendKeys(oz_imdb.searchBox, "Warner Bros.");
        oz_imdb.myJsClick(oz_imdb.searchButton);
        oz_imdb.verifyContainsText(oz_imdb.warnerBrosAssert, "Warner Bros.");
        oz_imdb.myJsClick(oz_imdb.companiesButton2);
        oz_imdb.myJsClick(oz_imdb.keywordsButton);
        oz_imdb.mySendKeys(oz_imdb.searchBox, "Comedy");
        oz_imdb.myJsClick(oz_imdb.searchButton);
        oz_imdb.verifyContainsText(oz_imdb.comedyAssert,"dark comedy");









    }




}
