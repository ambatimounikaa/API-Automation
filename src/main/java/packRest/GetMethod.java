package packRest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class GetMethod {
	
	public static void main(String[] args) {
		final String url = "https://rahulshettyacademy.com";
		RestAssured.baseURI=url;
		given().log().all().queryParam("key","qaclick123")
		.queryParam("place_id", "227628c3c3b8cee8c11c81eb26538866")
		.header("Content-Type","application/json")
		.when().get("maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200);
		
	}

}
