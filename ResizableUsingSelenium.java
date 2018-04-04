package FirstSeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResizableUsingSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

       System.setProperty("webdriver.ie.driver","H:/Desktop/New folder/eclipse and selenium/IEDriverServer.exe");
		
		System.out.println("dfasdf__1");
		 WebDriver driver=new InternetExplorerDriver();
		 System.out.println("dfasdf__2");

		 //Giving a pause of 5 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		
		driver.get("http://demoqa.com/resizable/");
		
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='resizable']/h3")));
		
		//Thread.sleep(12000);
		 String str = driver.findElement(By.xpath(".//*[@id='resizable']/h3")).getText();
		 
		 
		 System.out.println(str);
		 
		 WebElement OriItem = driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
		 
		 Actions action1 = new Actions(driver);
		 
		 action1.clickAndHold(OriItem).moveByOffset(100,120).release().build().perform();
		 
		// driver.close();
		 	
	}

}
