package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Logout {
	
	WebDriver driver;
	JavascriptExecutor js;
	
	public Logout(WebDriver driver) {
		this.driver=driver;
	}
	
	By logoutbtn=By.linkText("Log out");
	
	public void loggingout() throws InterruptedException {
		
		js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,-400)");
		
		Thread.sleep(3000);
		
		driver.findElement(logoutbtn).click();
		
		Thread.sleep(3000);
	}

}
