package TestClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Add_to_Cart {
	
WebDriver driver;
JavascriptExecutor js;

public Add_to_Cart(WebDriver driver) {
	
	this.driver=driver;
}

By addcartbtn=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[2]/input");

public void addtocart() throws InterruptedException {
	
	js=(JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,400)");
	
	Thread.sleep(3000);
	
	driver.findElement(addcartbtn).click();
	
}

}
