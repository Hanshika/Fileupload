package com.PageTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PageFactory.page.PageFact;
public class PageFactoryTestMethod 
{
	PageFactory	Loginpage;
	
	public  static WebDriver driver;
	
		@BeforeTest
		public void GithubTest(){
			
			driver = new FirefoxDriver();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.get("https://github.com/");
			PageFact searchpage =PageFactory.initElements(driver, PageFact.class);
			PageFact.sigin.click();
		}
		@Test
		public void sininginpagetest() throws Exception{
		PageFact.userlogin("hanshika","hanshika18");
		PageFact.singinButton.click();
		PageFact.fileuploadrepoistory.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		PageFact.uploadfiles.click();
		PageFact. choosefiles.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Runtime.getRuntime().exec("H:\\Users\\Hanshika\\Desktop\\fileuploadd.exe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFact.commitfiles.click();
		 
		  }
		  @AfterTest
		public void closdriver(){
			driver.close();
			
		}
		
	}

