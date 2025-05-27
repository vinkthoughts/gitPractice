package JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utils_Classes.Util1;

public class scrolling extends Util1 {

	@Test
	public void scrolling() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();


		//scroll by pixels
		Util1.scrollByPixels(driver);

		//scroll by using webelement
		driver.navigate().refresh();  //refresh the scrolled page
		Util1.elementvisible(driver, driver.findElement(By.xpath("//a[text()='Create new account']")));  //wait till element visible
		highlightElement(driver,driver.findElement(By.xpath("//a[text()='Create new account']")));  //highlight the webelement
		Thread.sleep(5000);


		WebElement last = driver.findElement(By.xpath("//span[text()=' Meta © 2025']"));
		Util1.scrollByWebElement(driver, last);
		highlightElement(driver,last);

	}

}
