package restassured.OnlineAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Calculator {
	 WebDriver driver;
	 String addxpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]";
	 String subxpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]";
	 String mulxpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]";
	 String divxpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]";
	 String zeroxpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]";
	 String twoxpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]";
	 String threexpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]";
	 String fourxpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]";
	 String fivexpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]";
	 String eithxpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]";
	 String ninexpath="//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]";
	 
	 
	 
	 
	  public Calculator(WebDriver driver){

	        this.driver = driver;

	    }
	public void addition() {
		
		 driver.findElement(By.xpath(subxpath)).click();//-
		  driver.findElement(By.xpath(twoxpath)).click();//2
		  driver.findElement(By.xpath(threexpath)).click();//3
		  driver.findElement(By.xpath(fourxpath)).click();//4
		  driver.findElement(By.xpath(twoxpath)).click();//2
		  driver.findElement(By.xpath(threexpath)).click();//3
		  driver.findElement(By.xpath(fourxpath)).click();//4
		  driver.findElement(By.xpath(addxpath)).click();//+
		  driver.findElement(By.xpath(threexpath)).click();//3
		  driver.findElement(By.xpath(fourxpath)).click();//4
		  driver.findElement(By.xpath(fivexpath)).click();//5
		  driver.findElement(By.xpath(threexpath)).click();//3
		  driver.findElement(By.xpath(fourxpath)).click();//4
		  driver.findElement(By.xpath(fivexpath)).click();//5
			
		
	}
  public void subtraction() {
	  driver.findElement(By.xpath(twoxpath)).click();//2
	  driver.findElement(By.xpath(threexpath)).click();//3
	  driver.findElement(By.xpath(fourxpath)).click();//4
	  driver.findElement(By.xpath(eithxpath)).click();////////
	  driver.findElement(By.xpath(twoxpath)).click();//2
	  driver.findElement(By.xpath(threexpath)).click();//3
	  driver.findElement(By.xpath(subxpath)).click();//sub
	  driver.findElement(By.xpath(subxpath)).click();//sub
	  driver.findElement(By.xpath(twoxpath)).click();//2
	  driver.findElement(By.xpath(threexpath)).click();//3
	  driver.findElement(By.xpath(zeroxpath)).click();/// 0
	  driver.findElement(By.xpath(ninexpath)).click();//9
	  driver.findElement(By.xpath(fourxpath)).click();//4
	  driver.findElement(By.xpath(eithxpath)).click();////////
	  driver.findElement(By.xpath(twoxpath)).click();//2
	  driver.findElement(By.xpath(threexpath)).click();//3
	  
		
		
	}
 public void multiplication() {
	 driver.findElement(By.xpath(fourxpath)).click();////
	  driver.findElement(By.xpath(twoxpath)).click();//
	  driver.findElement(By.xpath(threexpath)).click();//3
	  driver.findElement(By.xpath( mulxpath)).click();////// mul
	  driver.findElement(By.xpath(fivexpath)).click();//5
	  driver.findElement(By.xpath(twoxpath)).click();//
	  driver.findElement(By.xpath(fivexpath)).click();//5
	 
		
		
		
	}
 public void division() {
	 driver.findElement(By.xpath(fourxpath)).click();////
	  driver.findElement(By.xpath(zeroxpath)).click();//0
	  driver.findElement(By.xpath(zeroxpath)).click();//0
	  driver.findElement(By.xpath(divxpath)).click();// div
	  driver.findElement(By.xpath(twoxpath)).click();//2
	  driver.findElement(By.xpath(zeroxpath)).click();//0
		
		
		
	}
		 
 
}
