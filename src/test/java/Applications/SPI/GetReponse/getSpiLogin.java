package Applications.SPI.GetReponse;

import Applications.SPI.PostRequest.postSpiLogin;

import static io.restassured.RestAssured.given;

public class getSpiLogin {

    postSpiLogin postSpiLogin;

    public getSpiLogin(){
        postSpiLogin = new postSpiLogin();
    }

    public String gettingTheSpiSessionId(){
        return
                postSpiLogin.provideUserCredentialsAndUrl().
                 thenReturn().
                        getDetailedCookie("PHPSESSID").getValue();
    }

}
