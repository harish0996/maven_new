package regressionscripts;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.Flipkart_loginpage;
import pom.detailspage;
import pom.flipkart_homepage;
import pom.flipkart_stickerpage;
import generic.Flipkart_generic_test;
import generic.dataprovider;

public class Flipkart_end2end extends Flipkart_generic_test
{
@Test(dataProvider="databank")
public void flipkartend2end(String Emailid ,String pwd) throws Exception
{
	test=reports.createTest("Flipkart_end2end","user entered valid credentials in order to lodin to flipkart");
	test.info("Flipkart test has started");
	Flipkart_loginpage login = new Flipkart_loginpage(driver);
	login.setMailid(Emailid);
	test.pass("user enetered email id");
	login.setPassword(pwd);
	test.pass("user entered password");
	login.clicklogin();
	Thread.sleep(3000);
	test.pass("user logged in to Flipkart");
	flipkart_homepage home = new flipkart_homepage(driver);
	home.clickhomes_furnitures();
	test.pass("user clicked on homes_furnitures");
	home.clickStickers();
	Thread.sleep(3000);
	test.pass("user clicked on stickers");
	flipkart_stickerpage str = new flipkart_stickerpage(driver);
	str.clicksticker1();
	Thread.sleep(3000);
	test.pass("user clicked on stickeer1");
//	detailspage dtlspg = new detailspage(driver);
//	dtlspg.clickaddtokartbutton(driver);
//	Thread.sleep(3000);
//	test.pass("user clicked on add to cart button");
	test.info("Flipkart test ended");
	
}
@DataProvider(name="databank")
public Object[][] fetchData()
{
	 Object[][] arrobj = dataprovider.getData("Sheet1");
	 return arrobj;
	
}




}
