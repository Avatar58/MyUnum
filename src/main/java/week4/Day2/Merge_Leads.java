package week4.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class Merge_Leads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		//To handle windows
		Set<String> allwindows = driver.getWindowHandles();
		List<String> windowlist = new ArrayList<String>(allwindows);
		driver.switchTo().window(windowlist.get(2));
		
		driver.findElementByXPath("(//input[@type='text'])[1]").sendKeys("10071");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='10071']").click();
		
		driver.switchTo().window(windowlist.get(0));
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		//To handle windows
		Set<String> allwindows1 = driver.getWindowHandles();
		List<String> windowlist1 = new ArrayList<String>(allwindows1);
		driver.switchTo().window(windowlist1.get(2));
		
		driver.findElementByXPath("(//input[@type='text'])[1]").sendKeys("10072");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='10072']").click();
		driver.switchTo().window(windowlist1.get(0));
		driver.findElementByClassName("buttonDangerous").click();
		
		//Alert Accept
		driver.switchTo().alert().accept();
		//verify error message
		boolean displayed = driver.findElementByXPath("//ul[@class='errorList']//li").isDisplayed();
		System.out.println("Yes , Error message is displaying ? "+displayed);
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//label[text()='Lead ID:']/following::input)[1]").sendKeys("10071");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.findElementByXPath("//a[text()='opentaps']").click();
		driver.findElementByClassName("decorativeSubmit").click();
		driver.close();
		

	}

}
