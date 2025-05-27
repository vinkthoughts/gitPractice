package JavaPractice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import Utils_Classes.Util1;

public class screenshot extends Util1 {

	@Test
	public void screenshot() throws IOException {
		
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		highlightElement(driver,driver.findElement(By.xpath("//a[text()='Create new account']")));

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//to take screenshot of various times and date
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		
		String str = sdf.format(new Date());
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File desti = new File("C:\\Users\\dell\\eclipse workspace\\SeleniumPracticeProject\\src\\test\\resources\\Screenshots\\TestScreenshot-"+str+".png");
		
		FileHandler.copy(source, desti);
	}
	
}
