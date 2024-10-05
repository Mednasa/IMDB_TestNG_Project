package login_process;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.ConfigReader;
import utility.ParentPage;

public class SearchBox extends BaseDriver {

    ParentPage pp =new ParentPage();

    @BeforeClass
    public void Login(){

        o_imdb.myClick(o_imdb.SignInBtn);
        o_imdb.myClick(o_imdb.SignInWithIMDb);
        o_imdb.mySendKeys(o_imdb.emailPlc, ConfigReader.getProperty("email"));
        o_imdb.mySendKeys(o_imdb.passwordPlc, ConfigReader.getProperty("password"));
        o_imdb.myClick(o_imdb.SignIn);
    }

    @Test
    public void searchBox(){

        oz_imdb.mySendKeys(oz_imdb.searchBox, "Star Wars Empire Strikes Back");
        oz_imdb.myClick(oz_imdb.listBox);
        oz_imdb.myClick(oz_imdb.allButton);
        oz_imdb.myClick(oz_imdb.titlesButton);










    }




}
