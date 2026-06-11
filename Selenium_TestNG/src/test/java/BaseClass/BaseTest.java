package BaseClass;

import org.testng.annotations.Test;

import TestClass.LoginPage;
import TestClass.Logout;
import TestClass.SearchProduct;
import TestClass.Add_to_Cart;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class BaseTest {
	
	WebDriver driver;
	LoginPage loginpage;
	SearchProduct searchprod;
	Add_to_Cart addcart;
	
	Logout out;
	
	
  
  @BeforeTest
  public void setup() {
	  
	  driver=new ChromeDriver();
	  
	  driver.get("https://demowebshop.tricentis.com/");
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  loginpage=new LoginPage(driver);
	  
	  searchprod=new SearchProduct(driver);
	  
	  addcart=new Add_to_Cart(driver);
	  
	  out=new Logout(driver);
	  
  }
  
  @Test(priority=1)
  public void Login() throws InterruptedException {
	  
	  loginpage.login();
  }
  
  @Test(priority=2)
  public void Search_Product() throws InterruptedException {
	  
	  searchprod.search_product();
	  
  }
  @Test(priority=3)
  public void Add_to_Cart() throws InterruptedException {
	  
	  addcart.addtocart();
  }
  
@Test(priority=4)

  public void logout() throws InterruptedException {
	  
  out.loggingout(); 
  }
	 
  
  @AfterTest
  public void close() {
	  
	  driver.quit();
  }

}
