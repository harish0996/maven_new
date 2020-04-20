package pom;

import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class flipkart_homepage extends Base_page
{
 @FindBy(xpath="(//span[@class='_1QZ6fC _3Lgyp8'])[6]")
 private WebElement Homes_furnitures;
 
 @FindBy(xpath="//a[.='Stickers']")
 private WebElement stickers;
 
 
 public flipkart_homepage(WebDriver driver)
	{
		super(driver);
	}
 
 public void clickhomes_furnitures()
	{
		clickableElement(5, Homes_furnitures);
		 Actions act = new Actions(driver);
		act.moveToElement(Homes_furnitures).build().perform();
	}
 public void clickStickers()
 {
	 clickableElement(5, stickers);
	 stickers.click();
 }
 
 
 


}
