package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class Base_page
{
	public WebDriver driver;
	public Base_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


public void verifyVisibility(int time, WebElement element)
{
WebDriverWait wait=new WebDriverWait(driver,time);

try
{
	wait.until(ExpectedConditions.visibilityOf(element));
	Reporter.log("Element is visible", true);
}
catch(Exception e)
{
	Reporter.log("Failed to verify Element",true);	
	Assert.fail();
}
}


public void clickableElement( int time, WebElement element)
{
WebDriverWait wait=new WebDriverWait(driver,time);

try
{
	wait.until(ExpectedConditions.elementToBeClickable(element));
	Reporter.log("Element is clicked", true);
}
catch(Exception e)
{
	Reporter.log("failed to click element",true);
	Assert.fail();
}
}

public void verifyTitle(int time, String title)
{
WebDriverWait wait=new WebDriverWait(driver,time);

try
{
	wait.until(ExpectedConditions.titleContains(title));
	Reporter.log("title verified", true);
}
catch(Exception e)
{
	Reporter.log("failed to detect title",true);
	Assert.fail();
}
}


public void verifyElementByLocator(int time, By Xpath)
{
WebDriverWait wait=new WebDriverWait(driver,time);

try
{
	wait.until(ExpectedConditions.presenceOfElementLocated(Xpath));
	Reporter.log("Element verified by locator",true);
}
catch(Exception e)
{
	Reporter.log("failed to locate element by locator",true);
	Assert.fail();
}
}


public void identifyWindows(int time,int expectedNumberOfWindows )
{
WebDriverWait wait=new WebDriverWait(driver,time);

try
{
	wait.until(ExpectedConditions.numberOfWindowsToBe(expectedNumberOfWindows));
	Reporter.log("Windows identified",true);
}
catch(Exception e)
{
	Reporter.log("failed to load multiple window",true);
	Assert.fail();
}
}
}
