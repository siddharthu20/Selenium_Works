package FirstSeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickUsingSelenium {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver","H:/Desktop/New folder/eclipse and selenium/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		
		
		driver.get("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
		
		//Simply opening any page and right clicking on it through selenium webdriver
		Actions act = new Actions(driver);
		
		act.contextClick().build().perform();
		
		
		
	}

}
