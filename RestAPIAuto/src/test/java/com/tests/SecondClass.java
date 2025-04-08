package com.tests;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class SecondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseURI ="https://reqres.in";
		Response respObj = get("/api/users?page=2");
		System.out.println(respObj.asPrettyString());
		System.out.println("==============================");
		System.out.println(respObj.asString());
		Assert.assertTrue("Response code is correct",respObj.statusCode()==200);
		System.out.println(respObj.getStatusLine());
	}
}
