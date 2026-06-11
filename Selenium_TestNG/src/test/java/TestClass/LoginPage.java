package TestClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.BaseTest;

public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By loginbtn=By.linkText("Log in");
	By Email=By.id("Email");
	By Password=By.id("Password");
	
	
	By loginclick = By.cssSelector(".button-1.login-button");
	By logoutbtn=By.linkText("Log out");
	
	
  public void login() throws InterruptedException {
	  
	  driver.findElement(loginbtn).click();
	  
	  Thread.sleep(3000);
	  
	  WebElement email=driver.findElement(Email);
	  email.click();
	  email.sendKeys("sowmithranvh@gmail.com");
	  
	  WebElement password=driver.findElement(Password);
	  password.click();
	  password.sendKeys("Sowmithran@24");
	  
	  driver.findElement(loginclick).click();
	  
	 Thread.sleep(3000);
	
	  
  }
}
