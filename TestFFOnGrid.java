package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;





public class TestFFOnGrid {

	
	
	@Test
	public void test1() throws MalformedURLException
	{
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		
	
		cap.setPlatform(Platform.WINDOWS);
	
		//here url refers to the hub IP address as we wang to trigger the stuff into hub .. We can do this for node as well.
		URL url = new URL("http://localhost:4444/wd/grid"); 
		WebDriver driver = new RemoteWebDriver(url, cap);
		
		driver.get("http://www.google.com");
		
		System.out.println("title is: "+driver.getTitle());
		
		driver.quit();
	}
}
