package week2.Day1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Seleniumbase.ProjectSpecificMethods;
import Utils.ReadExcel;

public class CreateLead extends ProjectSpecificMethods {
	
	//it will invoke below method before method annotations
	@BeforeClass   
	public void getExcelname() {
		   
		ExcelFileName="CreateLead";
	   }

	   @Test(dataProvider ="Data")
	   public void createLead(String Cname,String Fname,String Lname){
	   	driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(Cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
		driver.findElementByName("submitButton").click();
		/*driver.findElementByLinkText("opentaps").click();
		driver.findElementByClassName("decorativeSubmit").click();*/
		
		/*WebElement e1 = driver.findElementById("createLeadForm_dataSourceId");
		Select sn = new Select(e1);
		//sn.selectByVisibleText("Employee");
		sn.selectByValue("LEAD_EMPLOYEE");
			
		
		WebElement e2 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select sn1 = new Select(e2);
		List<WebElement> alloptions = sn1.getOptions();
		int size = alloptions.size();
		String text = alloptions.get(size-2).getText();
		System.out.println(text);*/
		
	   }
		
		
	   	
		

}
