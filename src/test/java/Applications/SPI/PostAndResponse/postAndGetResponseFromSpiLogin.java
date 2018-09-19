package Applications.SPI.PostAndResponse;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class postAndGetResponseFromSpiLogin {
    public Response provideUserCredentialsAndUrl(){
        return
                given().formParam("user_name","sp.andie").
                   
                        when().post("https://staging-cp.directwithhotels.com/login/process_login");
    }

    public String userLoginResponse() {
        return
                provideUserCredentialsAndUrl().
                        then().
                        extract().response().jsonPath().getString("success");
    }

    public String gettingTheSpiSessionId(){
        return
                provideUserCredentialsAndUrl().
                        thenReturn().
                        getDetailedCookie("PHPSESSID").getValue();
    }
}
