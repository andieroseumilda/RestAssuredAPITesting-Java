package Applications.SPI.RunTestScripts;

import Applications.SPI.PostAndResponse.postAndGetResponseFromSpiLogin;
import org.junit.Assert;
import org.junit.Test;

public class TestUsersCredentialsInSPILogin {

    postAndGetResponseFromSpiLogin action;
    public TestUsersCredentialsInSPILogin(){
        action = new postAndGetResponseFromSpiLogin();
    }

   @Test
    public void isTheUserSuccessfullyLogin(){
       Assert.assertTrue("Please see Error Below", Boolean.parseBoolean(action.userLoginResponse()));
    }

    @Test
    public void getTheSpiSessionId(){
       action.gettingTheSpiSessionId();
       Assert.assertNotNull(action.gettingTheSpiSessionId());
    }


}
