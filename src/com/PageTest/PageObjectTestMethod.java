package com.PageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.PageObjectModel.PageObjectPattern;


public class PageObjectTestMethod {

public  static WebDriver driver;
		
		@Test
		public void GithubTest() throws Exception{
				
		driver = new FirefoxDriver();
    	driver.get("https://github.com/");
		PageObjectPattern Page = new PageObjectPattern(driver);
		Page.sininpage();
		Page.CommitPage();
	
		}
}

