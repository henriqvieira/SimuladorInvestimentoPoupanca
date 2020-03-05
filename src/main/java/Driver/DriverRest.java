package Driver;

import io.restassured.http.*;
import io.restassured.response.*;
import io.restassured.specification.*;
import static io.restassured.RestAssured.*;

public class DriverRest {

    private static RequestSpecification request;
    private static Response response;
    private String url;

    public DriverRest(String url){
        setURL("http://5b847b30db24a100142dce1b.mockapi.io/api/v1/"+url);
        setRequest();
        setResponse();
    }

    public String getURL(){ return url; }

    public void setURL(String URL){ url = URL; }

    public RequestSpecification getRequest() { return request;}

    public void setRequest() { request = given().relaxedHTTPSValidation().contentType(ContentType.JSON); }

    public Response getResponse() { return response;}

    public void setResponse() { response = getRequest().when().get(getURL()); }

}
