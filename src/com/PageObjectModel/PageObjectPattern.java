package com.PageObjectModel;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectPattern {

	 WebDriver driver;
		public PageObjectPattern(WebDriver driver){
		      this.driver = driver;
		  }
	
		
			By SiginPage=By.xpath("html/body/div[1]/header/div/div/div/a[1]");
			By username=By.id("login_field");
			By password=By.id("password");
			By siginbutton=By.xpath(".//*[@id='login']/form/div[4]/input[3]");
			By repoistory=By.xpath(".//*[@id='repo_listing']/li[1]/a/span/span");
			By uploadfile=By.xpath(".//*[@id='js-repo-pjax-container']/div[2]/div[1]/div[5]/div[2]/a[1]");
			By choosefile=By.xpath(".//*[@id='js-repo-pjax-container']/div[2]/div[1]/div[2]/form[2]/div[2]/p/input");
			By commitfile=By.xpath(".//*[@id='js-repo-pjax-container']/div[2]/div[1]/form/button");
			
	
		
		public void sininpage(){
			driver.findElement(SiginPage).click();
		
			driver.findElement(username).sendKeys("hanshika");
			driver.findElement(password).sendKeys("hanshika18");
			driver.findElement(siginbutton).click();
		    driver.findElement(repoistory).click();
			driver.findElement(uploadfile).click();
			driver.findElement(choosefile).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//driver.findElement(commitfile).click();
			
		}
		
		public void CommitPage() throws Exception{
			Runtime.getRuntime().exec("H:\\Users\\Hanshika\\gomathy_java\\com.github.fileupload\\fileuploadd.exe");
			driver.findElement(commitfile).click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
		}


