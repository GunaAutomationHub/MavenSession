package com.mavensession.qa.test;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mavensession.qa.base.TestBase;
import com.mavensession.qa.lib.LoginLib;
import com.mavensession.qa.utils.Utility;



public class LoginTest extends TestBase {
	
	LoginLib loginlib;
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException, InterruptedException {
		Initialization();
		loginlib = new LoginLib();
	}
	
	@DataProvider(name="loginCredentials")
	public Object[][] readCredentials(String name){
		Object[][] input = Utility.readInput("Login");
		return input;
		
	}
	
	@Test(enabled=true,dataProvider="loginCredentials")
	//@Parameters({"username","password"})
	public void Login(String username, String password) {
		String res = loginlib.login(username,password);
		Assert.assertEquals(res,"Success");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	

}
