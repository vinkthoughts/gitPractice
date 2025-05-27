package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utils_Classes.Util1;

public class getText extends Util1{

	@Test
	public void getText() throws Exception {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		
		ele.getText();
		
		System.out.println(ele.getText());
		
		highlightElement(driver,ele);
		
		Thread.sleep(2000);
		
		
		
		
	}
	
}
