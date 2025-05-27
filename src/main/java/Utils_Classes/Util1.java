package Utils_Classes;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util1 {

	static WebDriver driver;

	public static void movetoElement(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);

		act.moveToElement(element).perform();

	}


	public static void elementvisible(WebDriver driver,WebElement element)
	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public static void highlightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
				"arguments[0].style.border='3px solid red'; arguments[0].style.backgroundColor='yellow';",
				element
				);
	}

	public static void scrollByPixels(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,500)");

	}
	
	public static void scrollByWebElement(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView(true)",element);

	}

}
