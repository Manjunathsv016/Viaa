package genericLibrary;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import genericLibrary.ReadData;
import pom_repository.HomePage;

public class BaseClass {
	public WebDriver driver;
	public Actions action;
	public WebDriverWait explicitWait;
	public HomePage hp;
	public String toPlace = ReadData.fromPropertyFile("toData").toString();
	@Parameters("browserName")
	@BeforeTest
	public void browserSetUp(@Optional("chrome") String bname) {
		//Step1:Launching a browser
		if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			Reporter.log("Empty Chrome Browser is launched Successfully", true);
		} else if (bname.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			Reporter.log("Empty Edge Browser is launched Successfully", true);
		} else {
			throw new InvalidBrowserValueException();
		}
		driver.manage().window().maximize();
		Reporter.log("Browser Window is maximized");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Step2:Navigating to the url
		driver.navigate().to(ReadData.fromPropertyFile("url").toString());
		action = new Actions(driver);
		action.click().perform();
		driver.findElement(By.xpath("//button[text()='No thanks!']")).click();
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(ReadData.fromPropertyFile("actualTitle"), expectedTitle,"Home Page Is Displayed");

		explicitWait=new WebDriverWait(driver, 10);
		hp = new HomePage(driver);
		hp.getBusIcon().click();

	}


	@AfterClass(alwaysRun = true)
	public void browserTermination() {
		
		driver.quit();
	}

}

class InvalidBrowserValueException extends RuntimeException {
	InvalidBrowserValueException() {
		super("Invalid Browser value is passed");
	}
}
