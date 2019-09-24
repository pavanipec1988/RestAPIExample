package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetAPITests extends TestBase {
	
	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restAPI1;
	@Test
	public void setUp(){
			testBase = new TestBase();
			serviceUrl = prop.getProperty("URL");
			apiUrl = prop.getProperty("serviceURL");
			//https://reqres.in/api/users
			
			url= serviceUrl+apiUrl;
			}
	@Test
	public void test1() throws ClientProtocolException, IOException{
		
		restAPI1 = new RestClient();
		restAPI1.get(url);
		
	}
	
}

