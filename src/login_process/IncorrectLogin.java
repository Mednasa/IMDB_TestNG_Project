package login_process;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.ParentPage;
import java.util.Objects;

public class IncorrectLogin extends BaseDriver {

    @Test(dataProvider = "credentials")
    public void loginTest(String username,String password){

        if (Objects.equals(driver.getCurrentUrl(), "https://www.imdb.com/")){
            o_imdb.myClick(o_imdb.SignInBtn);
            o_imdb.myClick(o_imdb.SignInWithIMDb);
            o_imdb.mySendKeys(o_imdb.emailPlc,username );
            o_imdb.mySendKeys(o_imdb.passwordPlc,password );
            o_imdb.myClick(o_imdb.SignIn);
            
        } else if (Objects.requireNonNull(driver.getCurrentUrl()).contains("signin")) {
            o_imdb.mySendKeys(o_imdb.emailPlc,username );
            o_imdb.mySendKeys(o_imdb.passwordPlc,password );
            o_imdb.myClick(o_imdb.SignIn);
        }

        if (username.isEmpty() && password.isEmpty()){

            o_imdb.verifyContainsText(o_imdb.emptyEmail,"Enter your email or mobile phone number");
            o_imdb.verifyContainsText(o_imdb.emptyPassword,"Enter your password");

        } else if (username.equals("test123@gmail.com") && password.isEmpty()) {
            ParentPage.wait(2);
            o_imdb.verifyContainsText(o_imdb.onlyEmptyPassword,"Enter your password");
        } else if (username.isEmpty() && password.equals("CxmB45?a2")) {
            o_imdb.verifyContainsText(o_imdb.emptyEmail,"Enter your email or mobile phone number");
        }


    }

    @DataProvider
    public Object[][] credentials(){

        Object[][] credentialList={
                {"",""},
                {"test123@gmail.com",""},
                {"","CxmB45?a2"},

        };
        return credentialList;
    }

}
