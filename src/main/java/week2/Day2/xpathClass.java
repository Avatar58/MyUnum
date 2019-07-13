package week2.Day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class xpathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		
		//phone
		driver.findElementByXPath("//span[text()='Phone']").click();
		
		//companyname
		driver.findElementsByClassName("(//input[@name='companyName'])[2]");
		//Find Leads
		driver.findElementByXPath("//button[text()='Find Leads']");
		
		//find firstleads
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]");
				
		//image
		driver.findElementByXPath("(//td[@class='dijitReset dijitStretch dijitComboBoxInput']/following::a/img)[2]");
		
		

	}

}
