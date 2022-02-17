package com.neonsense.selenium_project;

import java.util.ArrayList;

import org.asynchttpclient.Response;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.specification.RequestSpecification;

public class StarWarsAPI {


	public void heightGreaterTwoHundred() {
		RestAssured.baseURI = "https://swapi.dev/api/people/1";
        RequestSpecification httprequest = RestAssured.given();
        Response resp =  (Response) httprequest.get("/api/people/1");
       
        JsonPath jsonResponse = ((ResponseBodyExtractionOptions) resp).jsonPath();
        ArrayList<String> peopleHeight = jsonResponse.get("people.height");
        
       // If height value greater than 200 return name
        
       
        
       // Check for returned names.
       
	}

}
