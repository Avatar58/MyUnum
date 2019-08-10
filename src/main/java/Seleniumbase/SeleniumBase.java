package Seleniumbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumBase implements Browser {

	private static final String SECONDS = null;
	public RemoteWebDriver driver;
	
	@Override
	public void startApp(String BrowserName, String Url) {
		// TODO Auto-generated method stub
		   	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(Url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	@Override
	public void CloseApp() {
		// TODO Auto-generated method stub
		driver.close();
	}


	@Override
	public void locateElement(String loctatortype, String value) {
		// TODO Auto-generated method stub
		
		
		
	}
	
	public void ClearAndType(WebElement ele, String data) {
		
		ele.clear();
		ele.sendKeys(data);
	}
	
	

}
