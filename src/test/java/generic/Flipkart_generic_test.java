package generic;

import java.util.Date;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Flipkart_generic_test 
{
public WebDriver driver;
public static ExtentHtmlReporter htmlreporter;
public static ExtentReports reports;
public static ExtentTest test;

Logger log = Logger.getLogger(Flipkart_generic_test.class);

BrowserFactory bff=new BrowserFactory();
FileManager fm= new FileManager();

@BeforeSuite
public void setup()
{
	htmlreporter=new ExtentHtmlReporter("./Ereports/"+new Date().toString().replace(":", "-")+".html");
	reports=new ExtentReports();
	reports.attachReporter(htmlreporter);
}
@Parameters({"browser"})
@BeforeMethod
public void openappn(@Optional("chrome")String browser)
{
	log.info(browser+"browser is launched");
	//test.info("Browser name is : "+browser);
	
	Reporter.log("Browser name is: "+browser, true);
	Reporter.log("Thread id : "+Thread.currentThread().getId(),true);
	
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver=bff.getBrowser("chrome");
		driver.get(fm.get_FlipkartURL());
	}
	
	else if (browser.equalsIgnoreCase("edge"))
	{
		driver=bff.getBrowser("edge");
		driver.get(fm.get_FlipkartURL());
	}
	else
	{
		driver=bff.getBrowser("firefox");
		driver.get(fm.get_FlipkartURL());
		
	}
	
}

@AfterMethod
public void closeappn(ITestResult res) throws Exception
{
	String tc_name="";
	if (ITestResult.FAILURE==res.getStatus())
	{
		tc_name = res.getName();
		//Screenshot.capture(driver,tc_name);
		 test.fail("test case failed", MediaEntityBuilder.
				 createScreenCaptureFromPath(new Screenshot().capture(driver,tc_name)).build());
	}
	
	
	
	test.assignAuthor("harish");
	test.assignCategory("GUI automation");
	test.assignDevice("Laptop");
	reports.setSystemInfo("windows", "10");
	
	
	
	driver.quit();
}

@AfterSuite
public void tearDown()
{
	reports.flush();
}
}
