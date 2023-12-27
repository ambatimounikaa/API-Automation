package packRest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import ReUsableFiles.Payload;

public class PostMethod {
	
	public static void main(String[] args) {
		final String url = "https://rahulshettyacademy.com";
		RestAssured.baseURI=url;
		given().log().all().queryParam("key", "qaclick123")
		.header("Content-Type","application/json")
		.body(Payload.PostPlace()).when().put("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).extract().asString();
	}

}
