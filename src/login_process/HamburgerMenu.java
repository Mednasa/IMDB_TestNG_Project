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

        oz_imdb.myClick(oz_imdb.hamburgerMenuButton);
        oz_imdb.myClick(oz_imdb.releaseCalendarButton);
        BaseDriver.driver.navigate().back();




    }


}
