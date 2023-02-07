package com.mavensession.qa.lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavensession.qa.base.TestBase;

public class LoginLib extends TestBase {
	//PageFactory
	@FindBy(xpath="//*[text()='Log In']")
	WebElement Login;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[@class=\"navbar-brand\"]")
	WebElement logo;
	
	public LoginLib() {
		PageFactory.initElements(driver, this);
	}
	
	public String login(String un, String pw) {
		try {
		Login.click();
		Thread.sleep(5000);
		username.click();
		Thread.sleep(1000);
		username.sendKeys(un);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(pw);
		Thread.sleep(1000);
		loginBtn.click();
		Thread.sleep(5000);
		return "Success";
		}catch (Exception e) {
			e.printStackTrace();
			return "Failed";
		}
	}

}
