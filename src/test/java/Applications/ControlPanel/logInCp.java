package Applications.ControlPanel;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class logInCp {


//    @Test
    public void redirectedToCpPage(){
        Response spiLoginForm =
                given().formParam("user_name","dev.andie").
                    formParam("user_pwd","andierose").
                        when().post("https://staging-cp.directwithhotels.com/login/process_login");


        String isUserSuccesfullyLogin =
                spiLoginForm.body().print();

        String getSessionID =
                spiLoginForm.thenReturn().
                        getDetailedCookie("PHPSESSID").getValue();
        System.out.println(getSessionID);
    }
}
