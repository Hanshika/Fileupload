package com.PageFactory.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFact {
public WebDriver driver;

@FindBy(xpath="html/body/div[1]/header/div/div/div/a[1]")
public static  WebElement sigin;
 
  @FindBy(id="login_field")
  public static  WebElement username;
  

  @FindBy(id="password")
  public  static  WebElement password;
  

  @FindBy(xpath=".//*[@id='login']/form/div[4]/input[3]")
  public static  WebElement singinButton;

  @FindBy(xpath=".//*[@id='repo_listing']/li[1]/a/span/span")
  public  static  WebElement fileuploadrepoistory;
  

  @FindBy(xpath=".//*[@id='js-repo-pjax-container']/div[2]/div[1]/div[5]/div[2]/a[1]")
  public static  WebElement uploadfiles;
  

  @FindBy(xpath=".//*[@id='js-repo-pjax-container']/div[2]/div[1]/div[2]/form[2]/div[2]/p/input")
  public  static  WebElement choosefiles;
  
  
  @FindBy(xpath=".//*[@id='js-repo-pjax-container']/div[2]/div[1]/form/button")
  public static  WebElement commitfiles;
  
  public void samplePage(WebDriver driver){
      this.driver = driver;
  }
	
  public static void userlogin( String uname, String pwd){
	  username.sendKeys(uname);
	  password.sendKeys(pwd);

  }
	
 
  
  
}
