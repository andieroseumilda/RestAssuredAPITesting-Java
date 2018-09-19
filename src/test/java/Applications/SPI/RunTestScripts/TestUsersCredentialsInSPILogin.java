package Applications.SPI.RunTestScripts;

import Applications.SPI.GetReponse.getEform;
import Applications.SPI.GetReponse.getSpiLogin;
import Applications.SPI.PostRequest.postSpiLogin;
import org.junit.Assert;
import org.junit.Test;

public class TestUsersCredentialsInSPILogin {

    postSpiLogin postSpiAction;
    getSpiLogin getSpiAction;
    getEform getEformAction;

    public TestUsersCredentialsInSPILogin(){
        postSpiAction = new postSpiLogin();
        getSpiAction = new getSpiLogin();
        getEformAction = new getEform();
    }

   @Test
    public void isTheUserSuccessfullyLogin(){
       Assert.assertTrue("Please see Error Below", Boolean.parseBoolean(postSpiAction.userLoginResponse()));
    }

    @Test
    public void isTheUserSuccessfullyReachTheEformPage(){
        System.out.println(getEformAction.gettingTheEformSessionId());
    }

}
