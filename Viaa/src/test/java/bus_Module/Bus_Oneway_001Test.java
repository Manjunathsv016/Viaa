 package bus_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.*;
import pom_repository.HomePage;
import genericLibrary.ReadData;

public class Bus_Oneway_001Test extends BaseClass{


	@Test
	public void oneWayFromTextField() throws InterruptedException {
		//Step1:Clicking on FromTextField.
		hp.getFromTextBox().clear();

		//Step2:Entering the data in FromTextField.
		String fromData = ReadData.fromPropertyFile("fromData").toString();
		hp.getFromTextBox().sendKeys(fromData);
		String enteredData = hp.getFromTextBox().getAttribute("value");
		hp.getBangaloreSearchSuggestion().click();

		Assert.assertEquals(enteredData, fromData,"FromTextField data is not entered properly");
		Reporter.log("Data Entered Successfully in fromTextField in homePage", true);
		//hp.getFromTextBox().sendKeys(Keys.TAB);
	}
}
