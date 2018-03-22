package FirstSeleniumPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestNGtest_1 {
	
	WebDriver driver;
	
  @Test(priority = 0)
  public void TestCase1() {
	  
	 WebElement source =driver.findElement(By.xpath(".//*[@id='dragdiv']"));
	 WebElement dest = driver.findElement(By.xpath(".//*[@id='dropdiv']"));
	  
	  Actions builder = new Actions(driver);
	  
	  
	 builder.dragAndDrop(source, dest).build().perform();
	 
	 String destText = driver.findElement(By.xpath(".//*[@id='dropdiv']/p")).getText();
	 
	  System.out.println("The text in target box for TEST CASE 1 is : "+destText);
  }
  
  
  @Test(priority = 1)
  public void TestCase2() {
	  
	  String destText = driver.findElement(By.xpath(".//*[@id='dropdiv']/p")).getText();
		 
	  System.out.println("The text in target box for TEST CASE 2 box is: "+destText);
	  
  }
  
  
  @Test(priority = 2)
  public void TestCase3() {
	  
	  DateFormat dateformat = new SimpleDateFormat("MM/dd/YYYY");
	  
	  Date date = new Date();
	  
	  String date1 = dateformat.format(date);
	  
	  System.out.println("The Present system Date is: "+date1);
	  
	  
	  }
  
    
  @BeforeTest
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.ie.driver","H:/Desktop/New folder/eclipse and selenium/IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
		 
		 driver.get("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
		 
		 System.out.println("BeforeTest method is called ");
		 
  }

  @AfterTest
  public void afterMethod() {
	  
	  driver.close();
	  
	 System.out.println("AfterTest method is called and the Driver is closed now !! ");
  }

}
