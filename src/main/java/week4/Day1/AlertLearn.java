package week4.Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertLearn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		//driver.findElementByXPath("(//a[text()='Try it Yourself »'])[3]").click();
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Lakshmikanth");
		alert.accept();
        
		String text = driver.findElementByXPath("//p[@id='demo']").getText();
		System.out.println(text);
		
		boolean contains = text.contains("Senthilkumar");
		System.out.println("Lakshmikanth is in that text :"+contains );
		
		/*if(text.contains("Lakshmikanth")) {
			
			System.out.println("Yes it contains");
		}
		else
			System.out.println("Sorry the name not there");*/

	}

}
