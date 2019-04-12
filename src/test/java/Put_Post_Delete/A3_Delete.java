package Put_Post_Delete;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class A3_Delete {
    //Delete will delete the table
    @Test
    public void Test1() {
        //post=>create
        RequestSpecification requestS = RestAssured.given();
        JSONObject obj = new JSONObject();
        requestS.headers("Content-Type", "application/json");
        requestS.body(obj.toJSONString());
        Response res = requestS.delete("https://reqres.in/api/users/2");
        res.prettyPrint();
    }
}
