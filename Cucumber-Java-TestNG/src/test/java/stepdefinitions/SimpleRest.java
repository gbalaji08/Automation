package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.json.*;
import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleRest {
	
	@Test
	public void readAllDetails()
	{
		// request the server
		Response response = RestAssured.get("https://chercher.tech/sample/api/product/read");
		// store the response body in string
		String responseBody = response.getBody().asString();
		// print the response
		System.out.println("Response Body is =>  " + responseBody);
		// store the response code
		int responseStatusCode = response.getStatusCode();
		System.out.println("************************************************");
		System.out.println("Status Code => "+ responseStatusCode);
		System.out.println(response.getTimeIn(TimeUnit.MILLISECONDS));
	}

	@Test
	public void putDetails()
	{
		RequestSpecification reqSpec = RestAssured.given();

		JSONObject jo = new JSONObject();
		
		jo.put("name", "myname");
		jo.put("description", "that is my name");
		jo.put("price", "122222");
		reqSpec.body(jo.toString());

		Response resp = reqSpec.put("https://chercher.tech/sample/api/product/create");
		System.out.println("Response code => " +resp.statusCode());
	}
}
