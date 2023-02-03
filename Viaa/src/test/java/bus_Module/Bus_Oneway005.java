package bus_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom_repository.HomePage;
import genericLibrary.ReadData;

public class Bus_Oneway005 extends BaseClass {

	@Test
	public void searchFlights() throws InterruptedException {
		explicitWait = new WebDriverWait(driver, 10);
		action = new Actions(driver);
		explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@class=\"search-btn search-journey\"]"))));
		// date from calender popup.
		int day = ReadData.dayFromSystem(8);
		String month = ReadData.monthFromSystem(0);
		hp.getDepartureCalenderTextBox().click();
		for (;;) {
			try {
				driver.findElement(By.xpath("//span[text()='" + month + "']/../../..//div[text()='" + day + "']")).click();
				break;
			} catch (NoSuchElementException e) {
				hp.getRightCalenderArrowIcon().click();
			}
		}


	}

}
