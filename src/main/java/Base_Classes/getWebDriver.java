package Base_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class getWebDriver {

	WebDriver driver;

	public static WebDriver getchromedriver(String a)
	{
		if(a.equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium jar files\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.flipkart.com/");

			driver.manage().window().maximize();

			return driver;
		}

		else if(a.equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Desktop\\selenium jar files\\chromedriver_win32\\firefoxdriver.exe");

			WebDriver driver = new FirefoxDriver();

			driver.get("https://www.flipkart.com/");

			driver.manage().window().maximize();

			return driver;
		}
		else
		{
			//System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Desktop\\selenium jar files\\chromedriver_win32\\edgedriver.exe");

			WebDriver driver = new EdgeDriver();

			driver.get("https://www.flipkart.com/");

			driver.manage().window().maximize();

			return driver;

		}


	}







}
