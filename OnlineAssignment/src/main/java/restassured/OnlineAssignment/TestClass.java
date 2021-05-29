package restassured.OnlineAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestClass {
	WebDriver driver;
	Calculator cal;

	@BeforeTest

    public void setup(){
		  
				//Setting the webdriver.chrome.driver property to its executable's location
				System.setProperty("webdriver.chrome.driver","C:\\Users\\shubh\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
				
				//Instantiating driver 
				 driver= new ChromeDriver();
				
				//Set implicit wait of 10 seconds
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//Launch google
				driver.get("https://www.calculator.net/");
				
				 

	}

	
	  
	  
	  @Test
	  public void testmethod() {
		  cal=new Calculator(driver);
          cal.addition();
		  Assert.assertEquals(-234234 + 345345,  111111);
		  
		  cal.subtraction();
		  Assert.assertEquals(234823-(-23094823),23329646  );
		 
		  
		  cal.multiplication();
		  Assert.assertEquals(423*525,  222075);
		 
		  cal.division();
		  Assert.assertEquals(4000/200 ,  20);
		  
		 
		  
	  }
	

} 