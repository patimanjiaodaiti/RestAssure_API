package Get;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Simple_Get {
    //get read only
    @Test
    public void Test1(){
        //get request
        Response res = RestAssured.get("https://www.google.com");
        //in order to get the status code
        int statusOfGoogle = res.getStatusCode();
        System.out.println(statusOfGoogle);
        Assert.assertEquals(res.getStatusCode(),200);
        System.out.println("completed");
        //get time
        long time = res.getTime();
        System.out.println(time);
        //print:html/jason
        String json=res.asString(); //wrap line un-click
        System.out.println(json);

        String pretty = res.prettyPrint(); //pretty is selected and wrap line click
    }
    @Test
    public void Test2() {
        //get request
        Response res = RestAssured.get("https://www.google.com");
        //headers
        System.out.println(res.headers()+"\n"+"========");
        //cookies:
        System.out.println(res.cookies());




    }
}
