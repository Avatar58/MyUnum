package week2.Day2;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Duplicate_lead {
	
	
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
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Lakshmikanth");
		//Clicking Find Leads button 
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//a[text()='Lakshmikanth'])[1]").click();
		String firstname = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(firstname);
		
		WebElement Createnew = driver.findElementById("createNewContactMechTarget");
		Select sc = new Select(Createnew);
		List<WebElement> list = sc.getOptions();
		int size = list.size();
		System.out.println(size);
		list.get(size-3);
		sc.selectByVisibleText("Email");
		driver.findElementByXPath("(//input[@class='inputBox'])[1]").sendKeys("testing@gmail.com");
		driver.findElementByXPath("(//a[@class='buttontext'])[1]").click();
		
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		String title = driver.getTitle();
		System.out.println(title);
		boolean displayed = driver.findElementByXPath("//div[text()='Duplicate Lead']").isDisplayed();
		System.out.println(displayed);
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		WebElement duplicatename = driver.findElementById("viewLead_firstName_sp");
		String text = duplicatename.getText();
		if(firstname.equals(text)) {
			
			System.out.println("Duplicate name same as captured name");
		}
		
		else
			System.out.println("something went wrong");
				

	}


}
