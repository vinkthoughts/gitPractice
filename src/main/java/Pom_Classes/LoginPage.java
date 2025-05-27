package Pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils_Classes.Util1;

public class LoginPage extends Util1{
	
	WebDriver driver;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement emailid;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submitbutton;
	
	@FindBy(xpath="(//div[@class='_28p97w'])[1]")
	private WebElement profilename;
	
	@FindBy(xpath="(//a[@class=\"_2kxeIr\"])[9]")
	private WebElement logoutbuttontxt;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		this.driver = driver;
		
	}
	
	public void enteremail()
	{
		emailid.sendKeys("7030610200");
		
	}
	
	public void enterpassword()
	{
		password.sendKeys("Vinayak2811#");
		
	}
	
	public void clicksubmit()
	{
		submitbutton.click();
		
	}
	
	public void hovetoProfileName()
	{
		movetoElement(driver,profilename);
	}
	
	public String logouttxt()
	{
		elementvisible(driver,logoutbuttontxt);
		String text = logoutbuttontxt.getText();
		
		return text;
	}
	
	

}
