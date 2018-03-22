package FirstSeleniumPackage;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {


	 @BeforeClass
	 public void connectDb(){
	 System.out.println("Db connection is successfull");
	 }

	 @BeforeMethod
	 public void openBrowser(){
	 System.out.println("Browser opened");
	 }

	 @AfterMethod
	 public void closeBrowser(){
	 System.out.println("Browser Closed");
	 }

	 @Test
	 public void testChrome(){
	 System.out.println("Chrome Test is Successful");
	 }

	 @Test
	 public void testMozilla(){
	 System.out.println("Firefox Test is Successful");
	 }

	 public void noAnno(){
	 System.out.println("No Annotation method**************");
	 }

	 @Test
	 public void testIE(){
	 System.out.println("IE Test is Successful");
	 }
	 @AfterClass
	 public void closeDb(){
	 System.out.println("Db Connection is closed");
	 } 

	 @AfterTest
	 public void aft(){
	 System.out.println("After Test is executed");
	 }
	 @BeforeTest
	 public void bft(){
	 System.out.println("Before Test is executed");
	 }

	}
	

