package packRest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class DeleteMethod {
	public static void main(String[] args) {
		final String url = "https://rahulshettyacademy.com";
		// TODO Auto-generated method stub
		RestAssured.baseURI=url;
		given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ " \"place_id\":\"227628c3c3b8cee8c11c81eb26538866\"\r\n"
				+ "}")
		.when().delete("maps/api/place/delete/json")
		.then().log().all().assertThat().statusCode(200);
		
	}

}
