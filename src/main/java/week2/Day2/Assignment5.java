package week2.Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment5 {

	public static void main(String[] args) {
		// yet to start on 13/June/2019
		
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
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Lakshmikanth");
		//Clicking Find Leads button 
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByXPath("(//a[text()='Lakshmikanth'])[1]").click();
		//click the Email
		//driver.findElementByXPath("//span[text()='Email']").click();
		//driver.findElementByXPath("(//a[text()='Edit'])[1]").click();
		
		WebElement Createnew = driver.findElementById("createNewContactMechTarget");
		Select sc = new Select(Createnew);
		List<WebElement> list = sc.getOptions();
		int size = list.size();
		System.out.println(size);
		list.get(size-3);
		sc.selectByVisibleText("Email");
		driver.findElementByXPath("(//input[@class='inputBox'])[1]").sendKeys("testing@gmail.com");
		driver.findElementByXPath("(//a[@class='buttontext'])[1]").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
