package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilityLayer.PropertiesClass;

public class BaseClass {

	private static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();
	public static WebDriver getDriver()
	{
		return td.get();
		
	}
	
	public static void initialization()
	{
		String browserName = PropertiesClass.getProperty("BROWSER_NAME");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriver driver = new ChromeDriver();
			td.set(driver);
		}
		if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriver driver = new ChromeDriver();
			td.set(driver);
		}
		else {
			System.out.println("Please Enter valid browser name");
		}
		
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String uri = PropertiesClass.getProperty("SIT_WEB_URI");
		getDriver().get(uri);
	}
	
}
