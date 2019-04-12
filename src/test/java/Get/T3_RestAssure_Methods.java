package Get;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T3_RestAssure_Methods {
    //given, when, then
    //given: precondition
    //when: step and actions
    //then: verifying process
    @BeforeMethod
    public void setup() {
        baseURI = "https://www.google.com/";
    }

    @Test
    public void Test1() {
        //        FirstWay(hard):
        //        Response rep = RestAssured.get("https://www.google.com/");
        //        rep.then().statusCode(200);
        //        System.out.println("completed");

        RestAssured.given().get("https://www.google.com/").then().statusCode(200);//RestAssured=>without static

    }

    @Test
    public void Test2() {
        when().get("/books").then().statusCode(200).log().headers();
        //body is html code.   With static
    }

    @Test
    public void Test3() {
        when().get("/ihtibar").then().statusCode(404);
    }
    @Test
    public void Test4() {
        when().get().then().log().all();
    }
}
