package packRest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class PutMethod {
	public static void main(String[] args) {
		final String url = "https://rahulshettyacademy.com";
        RestAssured.baseURI=url;
        given().log().all().queryParam("key","qaclick123").queryParam("place_id", "8d2573bdf6ceec0e474c5f388fa917fb")
        .header("Content-Type","application/json")
        .body("{\r\n"
                + "\"place_id\":\"8d2573bdf6ceec0e474c5f388fa917fb\",\r\n"
                + "\"address\":\"70 Summer walk, USA\",\r\n"
                + "\"key\":\"qaclick123\"\r\n"
                + "}")
        .when().put("maps/api/place/update/json")
        .then().log().all().assertThat().statusCode(200);
		
	}

}
