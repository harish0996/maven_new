package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class detailspage extends Base_page
{
@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
private WebElement addtokart;


public detailspage (WebDriver driver)
{
	super(driver);
}
	
	
public void clickaddtokartbutton( WebDriver driver)
{
	clickableElement(5, addtokart);
	 addtokart.click();
	
}
	
	
	
	
}
