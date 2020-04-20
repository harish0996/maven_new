package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Flipkart_loginpage extends Base_page
{

	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement mail_id;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement login;
	
	
	
	
	public Flipkart_loginpage(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void setMailid(String Emailid)
	{
    verifyVisibility(5, mail_id);
		mail_id.sendKeys(Emailid);
	}
	
	
	public void setPassword(String pwd)
	{
	verifyVisibility(5, password);
		password.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
	clickableElement(5, login);
		login.click();
	}
	
	
	
	
	
	
	
	
	
}
