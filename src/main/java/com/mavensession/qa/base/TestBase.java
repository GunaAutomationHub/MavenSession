package com.mavensession.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prob;
	public static ChromeDriver cdriver;
	
	public TestBase() {
		try {
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/mavensession/qa/config/config.properties"); 
		prob = new Properties();
		prob.load(fis);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void Initialization() throws MalformedURLException, InterruptedException {
		String browser = prob.getProperty("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\ChromeDriver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			//options.addArguments("--headless");
			driver = WebDriverManager.chromedriver().capabilities(options).create();
			driver.get(prob.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Thread.sleep(2000);
			
		}
		
	}

}
