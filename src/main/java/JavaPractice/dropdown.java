package JavaPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utils_Classes.Util1;

public class dropdown extends Util1{

	@Test
	public void dropdown() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		highlightElement(driver,driver.findElement(By.xpath("//a[text()='Create new account']")));

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();


		WebElement dr1 = driver.findElement(By.xpath("//select[@id='day']"));

		highlightElement(driver,dr1);

		Select sel1 = new Select(dr1);

		sel1.selectByIndex(0);

		Thread.sleep(2000);

		sel1.selectByValue("8");
		Thread.sleep(2000);

		sel1.selectByVisibleText("13");
		Thread.sleep(2000);
		
		//printing all values from dropdown month
		
		WebElement dr2 = driver.findElement(By.xpath("//select[@id='month']"));

		highlightElement(driver,dr2);

		Select sel2 = new Select(dr2);
		

		List<WebElement> options = sel2.getOptions();
		
		for(WebElement option:options) {
			
			System.out.println("Given Values are: "+option.getText());
		}
		
		System.out.println(options.size());
		
		
		//for printing all values of year
		
		WebElement dr3 = driver.findElement(By.xpath("//select[@id='year']"));

		highlightElement(driver,dr3);

		Select sel3 = new Select(dr3);
		

		List<WebElement> options3 = sel3.getOptions();
		
		for(WebElement option:options3) {
			
			System.out.println("Given Values are: "+option.getText());
		}
		
		System.out.println(options3.size());
		

	}

}
