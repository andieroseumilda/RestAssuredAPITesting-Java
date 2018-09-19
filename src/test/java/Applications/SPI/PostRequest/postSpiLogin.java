package Applications.SPI.PostRequest;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class postSpiLogin {
    public Response provideUserCredentialsAndUrl(){
        return
                given().
                        formParam("user_name","sp.andie").
                        formParam("user_pwd","andierose").
                when().
                        post("https://staging-cp.directwithhotels.com/login/process_login");
    }

    public String userLoginResponse() {
        return
                provideUserCredentialsAndUrl().
                 then().
                        extract().response().jsonPath().getString("success");
    }
}
