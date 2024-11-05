package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLibrary {	
	
	public static WebDriver driver;
	public void getLaunchUrl(String url)
	{
		String path = "C:\\Users\\sachi\\eclipse-workspace\\AutomationTestNg_Basic\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

}
