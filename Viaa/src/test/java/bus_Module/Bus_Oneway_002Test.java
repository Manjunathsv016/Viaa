package bus_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom_repository.HomePage;
import genericLibrary.ReadData;

public class Bus_Oneway_002Test extends BaseClass {

	
	@Test
	public void negativeFromTextField(){
		
		 hp = new HomePage(driver);
		// Step1:Clicking on FromTextField.
		hp.getFromTextBox().clear();
		
		// Step2:Entering Invalid Data.
		String invalidFromData = ReadData.fromPropertyFile("invalidFromData").toString();
		hp.getFromTextBox().sendKeys(invalidFromData);
		String enteredData = hp.getFromTextBox().getAttribute("value");
		
		Assert.assertEquals(enteredData, invalidFromData,"FromTextField data is not entered properly");
		Reporter.log("Data Entered Successfully in fromTextField in homePage", true);
		hp.getSearchBusButton().click();
		String errorMessage = hp.getFromErrorMessage().getText();
		String errorMessageFromTextField = ReadData.fromPropertyFile("errorMessageForFromTextField");
		Assert.assertEquals(errorMessage, errorMessageFromTextField,"Error Message is not properly displayed");
		Reporter.log("Error message is matching correctly",true);
	}
}
