package HRMProject_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HRMProjectSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.ie.driver", "H:/Desktop/New folder/eclipse and selenium/IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
         driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
         
         String str = driver.getCurrentUrl();
         
         if (str.equalsIgnoreCase("https://gateway.zscloud.net/auT?origurl=http%3A%2F%2Fopensource%2edemo%2eorangehrmlive%2ecom%2f&_ordtok=qF43WVh35QjQs0s517V8WLPRF5"))
        	 driver.close();
         else
         {
         
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
       WebDriverWait wait2 = new WebDriverWait(driver, 10);
		
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='divLogo']/img")));
		
		driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
		
		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu_recruitment_viewRecruitmentModule']/b")));
		
		driver.findElement(By.xpath(".//*[@id='menu_recruitment_viewRecruitmentModule']/b")).click();
		
		/*
		driver.findElement(By.xpath(".//*[@id='menu_recruitment_viewJobVacancy']")).click();

		driver.findElement(By.xpath(".//*[@id='btnAdd']")).click();
		
	   Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='addJobVacancy_jobTitle']")));
	   
	   dropdown.selectByIndex(2);
	   
	   driver.findElement(By.xpath(".//*[@id='addJobVacancy_name']")).sendKeys("Technology Analyst");
	   
	   driver.findElement(By.xpath(".//*[@id='addJobVacancy_hiringManager']")).sendKeys("Allen Smith");
	   
	   driver.findElement(By.xpath(".//*[@id='addJobVacancy_noOfPositions']")).sendKeys("2");
	   
	   driver.findElement(By.xpath(".//*[@id='btnSave']")).click();
	   
	   
	   driver.findElement(By.xpath(".//*[@id='btnBack']")).click();
	   
	   driver.findElement(By.xpath(".//*[@id='resultTable']/tbody/tr[2]/td[2]/a")).click();*/
		
		
		
		
		
		//To access candidate portal
		
		
		
	   
		driver.findElement(By.xpath(".//*[@id='menu_recruitment_viewCandidates']")).click();
		driver.findElement(By.xpath(".//*[@id='btnAdd']")).click();

		driver.findElement(By.xpath(".//*[@id='addCandidate_firstName']")).sendKeys("Sanjay3");
		driver.findElement(By.xpath(".//*[@id='addCandidate_lastName']")).sendKeys("Patil3");
		driver.findElement(By.xpath(".//*[@id='addCandidate_email']")).sendKeys("sp2002@xyz.com");
		
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='addCandidate_vacancy']")));
		
		dropdown.selectByIndex(1);
		
		driver.findElement(By.xpath(".//*[@id='btnSave']")).click();
		
		driver.findElement(By.xpath(".//*[@id='btnBack']")).click();
		
		/*
		driver.findElement(By.xpath(".//*[@id='candidateSearch_candidateName']")).sendKeys("Sanjay3 Patil3");
		
		driver.findElement(By.xpath(".//*[@id='btnSrch']")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='resultTable']/tbody/tr[2]/td[3]/a")).click();
		
		Select dropdwn = new Select(driver.findElement(By.xpath(".//*[@id='viewCandidateAction_2']")));
		dropdwn.selectByIndex(1);
		
		
		driver.findElement(By.xpath(".//*[@id='candidateVacancyStatus_notes']")).sendKeys("You are shortlisted");
		
		driver.findElement(By.xpath(".//*[@id='actionBtn']")).click();
		
		
		String currentstatus = driver.findElement(By.xpath(".//*[@id='resultTable']/tbody/tr[2]/td[6]")).getText();
		
		
		System.out.println("The current status of the candidate is: "+currentstatus);*/
		//driver.findElement(By.xpath(".//*[@id='btnSrch']")).click();
		//driver.findElement(By.xpath(".//*[@id='btnSrch']")).click();
	
		
		
         }
	 
	}

}
