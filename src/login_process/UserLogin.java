package login_process;

import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.ConfigReader;

public class UserLogin extends BaseDriver {

    @Test
    public void Login(){

        o_imdb.myClick(o_imdb.SignInBtn);
        o_imdb.myClick(o_imdb.SignInWithIMDb);
        o_imdb.mySendKeys(o_imdb.emailPlc, ConfigReader.getProperty("email"));
        o_imdb.mySendKeys(o_imdb.passwordPlc, ConfigReader.getProperty("password"));
        o_imdb.myClick(o_imdb.SignIn);
        o_imdb.verifyContainsText(o_imdb.accountName,ConfigReader.getProperty("accountName"));

    }

}
