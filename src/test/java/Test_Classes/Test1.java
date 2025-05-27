package Test_Classes;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Base_Classes.getWebDriver;
import Pom_Classes.LoginPage;
public class Test1 {

	WebDriver driver;
	LoginPage lp;

	@Parameters("browser")
	@BeforeClass
	public void beforeclass(String a)
	{
		driver = getWebDriver.getchromedriver(a);

	}

	@BeforeMethod
	public void beforemethod()
	{
		lp = new LoginPage(driver);
	}

	@Test
	public void verifyUserCanLogin()
	{
		lp.enteremail();
		lp.enterpassword();
		lp.clicksubmit();
		lp.hovetoProfileName();
		
		String text = lp.logouttxt();
		if(text.equals("Logout"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test fails");
		}
	}
		

	@AfterMethod
	public void aftermethod()
	{

	}

	@AfterClass
	public void afterclass()
	{
		driver.quit();

	}




}
