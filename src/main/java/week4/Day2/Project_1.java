package week4.Day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("//div[@class='component-popular-locations']/div[3]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("dd");
		// Get today's date
		String today = sdf.format(date);
		// Convert to integer and add 1 to it
		int tomorrow = Integer.parseInt(today)+1;
    	// Print tomorrow's date
		System.out.println(tomorrow);
		
		String xpathForDate = "//div[contains(text(), '"+tomorrow+"')]";
		driver.findElementByXPath(xpathForDate).click();
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		
		if(driver.findElementByXPath("//div[contains(text(), '"+tomorrow+"')]").getAttribute("class").contains("day picked"))
		driver.findElementByXPath("//button[@class='proceed']").click();
		else
		System.out.println("Incorrect Date Picked");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//List<WebElement> carlist =driver.findElementsByXPath("//div[@class='details']//h3");
		List<WebElement> price = driver.findElementsByXPath("//div[@class='price']");
		List<Integer> pricedetails = new ArrayList<>();
		
		for (WebElement eachprice : price) {
			
			String extractedprice = eachprice.getText().replaceAll("\\D", "");
			pricedetails.add(Integer.parseInt(extractedprice));
			}
		
		
		Collections.sort(pricedetails);
		System.out.println(pricedetails.get(0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		

	}

}
