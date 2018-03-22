package FirstSeleniumPackage;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumClass { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","H:/Desktop/New folder/eclipse and selenium/IEDriverServer.exe");
	 WebDriver driver=new InternetExplorerDriver();

	 driver.get("http://www.seleniumframework.com/Practiceform/");
	 
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.xpath(".//*[@id='alert']")).click();
	 
	 //Use of Alert------------------------------------>>>>>>>>>>>>>
	 Alert alert = driver.switchTo().alert();
	 
	 String alertTest = alert.getText();
	 
	 alert.accept();
	 
	 System.out.println(alertTest);
	 
	 
	 
	 driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div[1]/div/p[4]/button")).click();
	 
	 
	 String parentWindow = driver.getWindowHandle();
	 
	 
	 // handle all new opened window.				
     Set<String> s1=driver.getWindowHandles();		
     Iterator<String> i1=s1.iterator();


     while(i1.hasNext())			
     {		
   	  //System.out.println("here I am 11 !!");
         String ChildWindow=i1.next();		
        // System.out.println("here I am 22 !!");
         if(!parentWindow.equalsIgnoreCase(ChildWindow))			
         {    
       	 // System.out.println("here I am 33 !!");
              
                 // Switching to Child window
                 driver.switchTo().window(ChildWindow);
                 driver.manage().window().maximize();
          //       System.out.println("here I am 44 !!");

	 
	 String title = driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div/h2/span/strong")).getText();
	 System.out.println("the title of the page is:"+title);
                 
                 Dimension sizeOfTitle = driver.findElement(By.xpath(".//*[@id='content']/div[1]/div/div/div/div/h2/span/strong")).getSize();
                 System.out.println("size of the title of the page is:"+sizeOfTitle);
                 
	
	
	 
	 
	 /*File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(screenshot, new File("H:\\Desktop\\cash pooling project"));*/
	 
	 //******************************************************************************************************
	 //To Take Screenshot -->
	 try
	    {            
		 File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshot, new File("H:\\Desktop\\cash pooling project\\jpr2.jpg"));
		  System.out.println("Screenshot Taken");
	    }
	    catch (Exception e)
	    {
	        System.out.println(e.getMessage());
	      
	    }
	 
	 //*****************************************************************************************************	 
	 //driver.manage().window().maximize();
	 //String parentWindow = driver.getWindowHandle();
	 
	/* String title = driver.findElement(By.xpath(".//*[@id='wsb-element-00000000-0000-0000-0000-000450914886']/div/h1")).getText();
	 
	 System.out.println(title);
	 
	 driver.findElement(By.xpath(".//*[@id='wsb-button-00000000-0000-0000-0000-000450914890']")).click();
	 
	 driver.findElement(By.xpath(".//*[@id='wsb-button-00000000-0000-0000-0000-000451959280']/span")).click();
	 
	 driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("xyz20@gmail.com");

	 driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("Sidd");
	 driver.findElement(By.xpath(".//*[@id='address']")).sendKeys("shahidnagar,Bhubaneswar");
	 driver.findElement(By.xpath(".//*[@id='card_number']")).sendKeys("78956253521458965");
	 driver.findElement(By.xpath(".//*[@id='cardholder_name']")).sendKeys("sidd");
	 driver.findElement(By.xpath(".//*[@id='verification_code']")).sendKeys("895623");
     Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='card_type']")));
	 
	 dropdown.selectByVisibleText("Mastercard");
	 
	 driver.findElement(By.xpath(".//*[@id='wsb-element-00000000-0000-0000-0000-000452010925']/div/div/form/div/button")).click();
	 */
	 
	 
	 
	 /*driver.manage().window().maximize();
	
	  To handle all new opened window.				
      Set<String> s1=driver.getWindowHandles();		
      Iterator<String> i1=s1.iterator();


      while(i1.hasNext())			
      {		
    	  System.out.println("here I am 11 !!");
          String ChildWindow=i1.next();		
          System.out.println("here I am 22 !!");
          if(!parentWindow.equalsIgnoreCase(ChildWindow))			
          {    
        	  System.out.println("here I am 33 !!");
               
                  // Switching to Child window
                  driver.switchTo().window(ChildWindow);
                  driver.manage().window().maximize();
                  System.out.println("here I am 44 !!");
	 
	 
	 driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[1]/input")).sendKeys("Siddharth");
	 System.out.println("here I am 55 !!");
	 driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[2]/input")).sendKeys("4585265425");
	 driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[3]/input")).sendKeys("sid123@xyz.com");
	 
	 Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[4]/select")));
	 
	 dropdown.selectByVisibleText("India");
	 
	 driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[5]/input")).sendKeys("Mumbai");
	 driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[6]/input")).sendKeys("sid54254");
	 driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[7]/input")).sendKeys("sdsd20@");

	 driver.findElement(By.xpath(".//*[@id='load_form']/div/div[2]/input")).click();
	 
	 /*driver.close(); //closing child window
     driver.switchTo().window(parentWindow); //cntrl to parent window*/
	 //driver.close();
      
      // Switching to Parent window i.e Main Window.
     // driver.switchTo().window(parentWindow);
	 
         }
     }
  driver.switchTo().window(parentWindow);
  
  String v1=driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/div/div[1]/div/h2")).getText();
	 System.out.println(v1);
	 
	}

}
