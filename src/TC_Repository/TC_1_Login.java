package TC_Repository;

import org.testng.annotations.Test;

import Base.BaseScript;
import PageObject.SignIn;

public class TC_1_Login extends BaseScript
{
    @Test
    public void signIn() throws InterruptedException
    {
        SignIn signIn = new SignIn(driver);
        signIn.signInClicking();

        signIn.doSignIn();

    }

}
