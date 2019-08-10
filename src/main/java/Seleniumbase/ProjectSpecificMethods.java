package Seleniumbase;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Utils.ReadExcel;

public class ProjectSpecificMethods {
	
	public String ExcelFileName;
	public ChromeDriver driver;
	@Parameters({"url","uName","pwd"})
	@BeforeMethod
	public void login(String url,String Fname, String Lname) {
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElementById("username").sendKeys(Fname);
	driver.findElementById("password").sendKeys(Lname);
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
}
	@AfterMethod
	public void closebrowser() {
	driver.close();
	}
	
	@DataProvider(name ="createLead")
	public String[][] createleaddata() throws IOException
	{
		/*String[][] data  = new String[2][3];
		data[0][0]= "TCS";
		data[0][1]="Senthilkumar";
		data[0][2]="Srinivasan";
		
		data[1][0]= "HCL";
		data[1][1]="Lakshmikanth";
		data[1][2]="Srinivasan";*/
		return ReadExcel.excelread("TestData");
							
	}
	@DataProvider(name ="editlead")
	public String [][] editleaddata() throws IOException{
		return ReadExcel.excelread("TestData");
			
	}

}