package pom;

import java.util.Set;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class flipkart_stickerpage extends Base_page
{
	@FindBy(xpath="//div[@ data-id='STIFF8YZZTUFZUDY']")
	 private WebElement sticker1;
	
	@FindBy(xpath="//div[@ data-id='STIF65G3QSCTY3TB']")
	 private WebElement sticker2;
	
	@FindBy(xpath="//div[@ data-id='STIEFZV3SY6FHFFA']")
	 private WebElement sticker3;
	
	@FindBy(xpath="//div[@ data-id='STIFBB3KNP9G9KH9']")
	 private WebElement sticker4;
	
	
	public flipkart_stickerpage(WebDriver driver)
	{
		super(driver);
	}
	public void clicksticker1()
	 {
	clickableElement(5, sticker1);
		 sticker1.click();
		 Set<String> allwindow = driver.getWindowHandles();
		 for (String str : allwindow)
		 {
			driver.switchTo().window(str);
		}
		 
		 
	 }
	public void clicksticker2()
	 {
		 clickableElement(5, sticker2);
		 sticker2.click();
		 Set<String> allwindow = driver.getWindowHandles();
		 for (String str : allwindow)
		 {
			driver.switchTo().window(str);
		}
	 }
		 
		 
	public void clicksticker3()
	{
    clickableElement(5, sticker3);
	sticker3.click();
	Set<String> allwindow = driver.getWindowHandles();
	 for (String str : allwindow)
	 {
		driver.switchTo().window(str);
	}
	}
				 

	public void clicksticker4()
	{
	clickableElement(5, sticker4);
	sticker4.click();
	Set<String> allwindow = driver.getWindowHandles();
	 for (String str : allwindow)
	 {
		driver.switchTo().window(str);
	}
				 
}
}
