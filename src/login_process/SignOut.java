package login_process;

import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.ConfigReader;

public class SignOut extends BaseDriver {

    @Test
    public void Logout (){

        o_imdb.myClick(o_imdb.SignInBtn);
        o_imdb.myClick(o_imdb.SignInWithIMDb);
        o_imdb.mySendKeys(o_imdb.emailPlc, ConfigReader.getProperty("email"));
        o_imdb.mySendKeys(o_imdb.passwordPlc, ConfigReader.getProperty("password"));
        o_imdb.myClick(o_imdb.SignIn);
        o_imdb.myClick(o_imdb.iconBtn);
        o_imdb.myClick(o_imdb.signOutBtn);
        o_imdb.verifyContainsText(o_imdb.signOutVerify,"Sign In");
    }
}
