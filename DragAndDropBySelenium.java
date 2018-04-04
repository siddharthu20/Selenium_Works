package FirstSeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBySelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver","H:/Desktop/New folder/eclipse and selenium/IEDriverServer.exe");
		
		System.out.println("dfasdf__1");
		 WebDriver driver=new InternetExplorerDriver();
		 System.out.println("dfasdf__2");

		 //Giving a pause of 5 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.get("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 WebElement source = driver.findElement(By.xpath(".//*[@id='dragdiv']"));
		 WebElement target= driver.findElement(By.xpath(".//*[@id='dropdiv']"));
		 Actions action = new Actions(driver);
		 action.dragAndDrop(source, target).build().perform();
		 
		 String finalRes = driver.findElement(By.xpath(".//*[@id='dropdiv']/p")).getText();
		 
		 System.out.println("The text in the targer box is: "+finalRes);
		
		 
		// driver.close();
	
	}

}
