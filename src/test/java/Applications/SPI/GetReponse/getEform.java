package Applications.SPI.GetReponse;

import static io.restassured.RestAssured.given;

public class getEform {

    public String gettingTheEformSessionId(){
        return
                given().
                        when().
                        post("http://staging-partners.directwithhotels.com/eforms/index/b46869f15bcbbf4b4549d05d7d5c17fe").
                        thenReturn().
                        getDetailedCookie("PHPSESSID").getValue();
    }
}
