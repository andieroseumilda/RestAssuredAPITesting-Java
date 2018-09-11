package framework;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class TestAPI {

    @Test
    public void redirectToCpPage(){
        given().formParam("user_name","sp.andie")
                
                .post("https://staging-cp.directwithhotels.com/login/process_login").body().print();
    }
}
