package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		//find leads Tab
		driver.findElementByXPath("//a[text()='Leads']").click();
		//Leads LHS
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		//find the username textbox and enter username
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Lakshmikanth");
		//Clicking Find Leads button 
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByXPath("(//a[text()='Lakshmikanth'])[1]").click();
		String title = driver.getTitle();
		if(title.contains("View Lead")) {
			
			System.out.println("View Lead page");
		}
		else {
			System.out.println("Not view lead page");
		}
		
		driver.findElementByXPath("(//a[text()='Edit'])[1]").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("cognizant");
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		String text = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText().replaceAll("[^A-za-z]", " ");
		System.out.println(text);
		if(text.contains("cognizant")) {
			
			System.out.println("Companyname updated");
		}
		else
			System.out.println("something went wrong");
		/*driver.findElementByLinkText("opentaps").click();
		driver.findElementByClassName("decorativeSubmit").click();*/
		
	}

}
