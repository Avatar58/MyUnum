package week2.Day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTC_Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.findElementById("userRegistrationForm:userName").sendKeys("abcdef");
		driver.findElementById("userRegistrationForm:password").sendKeys("alphin@123");
		WebElement SecAns = driver.findElementById("userRegistrationForm:securityQ");
		Select nc = new Select(SecAns);
		nc.selectByVisibleText("What is your pet name?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("alphin");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("lakshmikanth");
		
		
		driver.findElementByXPath("//label[text()=' Male']").click();
		driver.findElementByXPath("//label[text()=' Married']").click();
		
		
		WebElement DD = driver.findElementById("userRegistrationForm:dobDay");
		Select Date = new Select(DD);
		Date.selectByValue("28");
		
		WebElement MM = driver.findElementById("userRegistrationForm:dobMonth");
		Select month = new Select(MM);
		month.selectByVisibleText("OCT");
		
		WebElement YYYY = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select year = new Select(YYYY);
		year.selectByVisibleText("1983");
		
		WebElement occupt = driver.findElementById("userRegistrationForm:occupation");
		Select emp = new Select(occupt);
		emp.selectByValue("3");
		
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select ctry = new Select(country);
		ctry.selectByValue("94");
		
		driver.findElementByName("userRegistrationForm:email").sendKeys("abc@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9952461055");
		
		WebElement National = driver.findElementById("userRegistrationForm:nationalityId");
		Select origin = new Select(National);
		origin.selectByValue("94");
		
		driver.findElementById("userRegistrationForm:address").sendKeys("51");
		driver.findElementByXPath("//input[@id='userRegistrationForm:pincode']").sendKeys("600100",Keys.TAB);
		
		Thread.sleep(2000);
		
		WebElement city = driver.findElementById("userRegistrationForm:cityName");
		Select cities = new Select(city);
		cities.selectByVisibleText("Kanchipuram");
		
		Thread.sleep(2000);
		
		WebElement postal = driver.findElementById("userRegistrationForm:postofficeName");
		Select code = new Select(postal);
		code.selectByVisibleText("Medavakkam  S.O");
		
		driver.findElementByXPath("//input[@id='userRegistrationForm:landline']").sendKeys("9952461055");
		driver.close();

	}

}
