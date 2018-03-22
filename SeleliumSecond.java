package FirstSeleniumPackage;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
//import javax.swing.JOptionPane.showMessageDialog;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleliumSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver","H:/Desktop/New folder/eclipse and selenium/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver(); 
		driver.get("http://www.practiceselenium.com/");
		driver.findElement(By.xpath(".//*[@id='wsb-nav-00000000-0000-0000-0000-000450914915']/ul/li[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='wsb-button-00000000-0000-0000-0000-000451959280']/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("sid5626@xyz.com");
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("xyz abc");
		driver.findElement(By.xpath(".//*[@id='address']")).sendKeys("sector 15,hootagali,bengalore");
		driver.findElement(By.xpath(".//*[@id='card_number']")).sendKeys("4512523685964125");
 
       Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='card_type']")));
       dropdown.selectByIndex(2);
 
 driver.findElement(By.xpath(".//*[@id='cardholder_name']")).sendKeys("ABC XYZZ");
 driver.findElement(By.xpath(".//*[@id='verification_code']")).sendKeys("125623");
 
 driver.findElement(By.xpath(".//*[@id='wsb-element-00000000-0000-0000-0000-000452010925']/div/div/form/div/button")).click();
 driver.findElement(By.xpath(".//*[@id='wsb-nav-00000000-0000-0000-0000-000450914915']/ul/li[5]/a")).click();
 	
driver.findElement(By.xpath(".//*[@id='wsb-nav-00000000-0000-0000-0000-000450914915']/ul/li[2]/a")).click();

//String text = driver.findElement(By.xpath(".//*[@id='wsb-element-00000000-0000-0000-0000-000450914898']/div/p")).getText();

//System.out.println("The test fetched is: "+text);


driver.close();


JOptionPane.showMessageDialog(null, "The driver is closed now");





	}
	
	
	

}
