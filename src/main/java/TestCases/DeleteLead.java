package TestCases;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Seleniumbase.ProjectSpecificMethods;

public class DeleteLead  extends ProjectSpecificMethods{
	
	@Test
	public void deletelead() throws InterruptedException {
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");
		driver.findElementById("createLeadForm_firstName").sendKeys("Lakshmikanth");
		driver.findElementById("createLeadForm_lastName").sendKeys("Srinivasan");
		driver.findElementByName("submitButton").click();
				
		String Testlead =driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText().replaceAll("[^0-9]","");
		driver.findElementByXPath("//a[text()='Delete']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		driver.findElementByXPath("//input[@name='id']").sendKeys(Testlead);
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String textmssg=driver.findElementByXPath("//div[text()='No records to display']").getText();
		System.out.println(textmssg);
		
		
		
		
	}
		
		
		

	}


