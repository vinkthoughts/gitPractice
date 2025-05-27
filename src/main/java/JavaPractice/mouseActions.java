package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utils_Classes.Util1;

public class mouseActions extends Util1{

	@Test
	public void mouseActions() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		Actions act = new Actions(driver);
		
		//click
		highlightElement(driver,driver.findElement(By.xpath("//a[text()='Create new account']")));
		WebElement el1 = driver.findElement(By.xpath("//a[text()='Create new account']"));
		act.moveToElement(el1).click().build().perform();
		
		//right click
		highlightElement(driver,driver.findElement(By.xpath("//a[text()='Already have an account?']")));
		WebElement el2 = driver.findElement(By.xpath("//a[text()='Already have an account?']"));
		act.moveToElement(el2).contextClick().build().perform();
		
		//double click
		
		highlightElement(driver,driver.findElement(By.xpath("//select[@id='day']")));
		WebElement el3 = driver.findElement(By.xpath("//select[@id='day']"));
		act.moveToElement(el3).doubleClick().build().perform();


	}

}
