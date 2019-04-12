package Get;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2_BaseURL {
    @BeforeMethod
    public void before(){
        RestAssured.baseURI="https://www.google.com";
    }

    @Test
    public void Test1(){
        Response response= RestAssured.get("/books");
        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertTrue(response.asString().toLowerCase().contains("my lib"));
        System.out.println("Can be reach website");

    }
    @Test
    public void Test2(){
        Response response = RestAssured.get("/maps");
        Assert.assertEquals(response.getStatusCode(),200);
        System.out.println("can Reach");
    }
}
