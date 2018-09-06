package framework;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TestAPI {

    @Test
    public void redirectToCpPage(){
        given().get("https://staging-cp.directwithhotels.com/login").then().log().all();
    }
}
