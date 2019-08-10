package Seleniumbase;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		//driver.findElementByXPath("//a[text()='Leads']").click();
		//Leads LHS
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		//find the username textbox and enter username
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Lakshmikanth");
		//Clicking Find Leads button 
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//a[text()='Lakshmikanth'])[1]").click();
		String title = driver.getTitle();
		if(title.contains("View Lead")) {
			
			System.out.println("View Lead page");
		}
		else {
			System.out.println("Not view lead page");
		}
		
		WebElement Createnew = driver.findElementById("createNewContactMechTarget");
		Select sc = new Select(Createnew);
		List<WebElement> list = sc.getOptions();
		int size = list.size();
		System.out.println(size);
		list.get(size-3);
		sc.selectByVisibleText("Email");
		driver.findElementByXPath("(//input[@class='inputBox'])[1]").sendKeys("testing@gmail.com");
		driver.findElementByXPath("(//a[@class='buttontext'])[1]").click();
		
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
	}
	
	

}
