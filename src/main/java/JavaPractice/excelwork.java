package JavaPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utils_Classes.Util1;

public class excelwork extends Util1{

	@Test
	public void excelwork() throws FileNotFoundException{

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		//webelements in which we want to enter values

		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		Util1.highlightElement(driver, username);
		Util1.highlightElement(driver, password);

		FileInputStream fis = new FileInputStream("C:\\Users\\dell\\eclipse workspace\\SeleniumPracticeProject\\src\\test\\resources\\TestDocument.xlsx");
		//XSSFWorkbook workbook = new XSSFWorkbook(fis);


		Util1.highlightElement(driver, username);
		Util1.highlightElement(driver, password);
	}

}
