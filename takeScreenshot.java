package FirstSeleniumPackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class takeScreenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "H:/Desktop/New folder/eclipse and selenium/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver() ;
		
		driver.get("www.google.com");
		 
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Give destination directory where screenshots will get automatically will be stored.
		File DesDir = new File("H:/Desktop/SelScreenshot");
		//FileUtils.copyFile(srcFile, DesFile);
		FileUtils.copyFileToDirectory(srcFile, DesDir);
		
		System.out.println("Screenshot has been taken and placed in the directory : H:/Desktop/SelScreenshot");

		driver.close();
	
	}

}
