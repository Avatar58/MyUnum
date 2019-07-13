package week4.Day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleLearning {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.findElementByLinkText("Contact Us").click();
		System.out.println(driver.getTitle());
		
		Set<String> allwindows = driver.getWindowHandles();
		List<String> listwindows = new ArrayList<String>(allwindows);
		driver.switchTo().window(listwindows.get(2));
		System.out.println(driver.getTitle());
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/Img001.jpg");// store in this path
		FileUtils.copyFile(screenshotAs, target);
		

	}

}
