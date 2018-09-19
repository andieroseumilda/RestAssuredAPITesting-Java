package Applications.SPI.PostRequest;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class postEform {

    public Response provideThelistInSubjectAgreement(){
        return
                given().
                        formParam("").
                        when().
                        post("http://staging-partners.directwithhotels.com/eforms/saveCurrent");
    }
}
