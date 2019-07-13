package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='✕']").click();
		
		Actions builders = new Actions(driver);
		builders.moveToElement(driver.findElementByXPath("(//span[@class='_1QZ6fC _3Lgyp8'])[1]")).build().perform();
		driver.findElementByXPath("(//a[@title='Mi'])[1]").click();
		WebElement element = driver.findElementByXPath("//h1[text()='Mi Mobiles']");
		System.out.println(element.isDisplayed());
		
			
			
		
		
		
		
		
		
	
	
	}
}
