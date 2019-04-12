package Put_Post_Delete;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class A1_Put {
    //put=>update
    /*HTTP methods:
    GET. Retrieve information. ...
    POST. Request that the resource at the URI do something with the provided entity. ...
    PUT. Store an entity at a URI. ...
    PATCH. Update only the specified fields of an entity at a URI. ...
    DELETE. Request that a resource be removed; however, the resource does not have to be removed immediately.
     */
    @Test
    public void Test1(){
        RequestSpecification requestS = RestAssured.given();
        JSONObject obj=new JSONObject();
        requestS.headers("Content-Type","application/json");
        obj.put("AA","bb");
        obj.put("dolet","East Turkistan");
        obj.put("isim","minawar");
        obj.put("from","ghulja");
        requestS.body(obj.toJSONString());
        Response res = requestS.put("https://reqres.in/api/users/2");
        res.prettyPrint();

        res.then().body("from", Matchers.equalTo("ghulja"));

    }

}
