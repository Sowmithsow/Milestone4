package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchProduct {
	WebDriver driver;
	
	public SearchProduct(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By searchbtn=By.id("small-searchterms");
	By searchbar=By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]");
	
	public void search_product() throws InterruptedException {
		
		Thread.sleep(3000);
		
	WebElement search=driver.findElement(searchbtn);
	
		search.click();
		search.sendKeys("smartphone");
		
		Thread.sleep(3000);
		
		driver.findElement(searchbar).click();
		
		Thread.sleep(3000);
	}

}
