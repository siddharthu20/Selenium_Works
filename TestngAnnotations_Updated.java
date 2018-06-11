package FirstSeleniumPackage;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {

    @BeforeSuite
	public void suite()
	{
		System.out.println("Suite opened");
	}
	 @BeforeClass
	 public void connectDb(){
	 System.out.println("Before Class is opened");
	 }

	 @BeforeMethod
	 public void openBrowser(){
	 System.out.println("Before Method is opened");
	 }

	 @AfterMethod
	 public void closeBrowser(){
	 System.out.println("After method is Closed");
	 }

	 @Test
	 public void testChrome(){
	 System.out.println("Chrome Test is Successful");
	 }

	 @Test
	 public void testMozilla(){
	 System.out.println("Firefox Test is Successful");
	 }


	 @Test
	 public void testIE(){
	 System.out.println("IE Test is Successful");
	 }
	 @AfterClass
	 public void closeDb(){
	 System.out.println("After Class is Closed");
	 } 

	 @AfterTest
	 public void aft(){
	 System.out.println("After Test is closed");
	 }
	 @BeforeTest
	 public void bft(){
	 System.out.println("Before Test is executed");
	 }
	 
	 @AfterSuite
	 public void Suite1()
	 {
		 System.out.println("After Suite is executed");
		 
	 }

	}
	

