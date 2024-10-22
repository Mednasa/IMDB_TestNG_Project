package login_process;

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
        m_imdb.myClick(m_imdb.AllBtn);
        m_imdb.myClick(m_imdb.AdvancedSearchBtn);
        m_imdb.myClick(m_imdb.TitleNameBtn);

    }
}
