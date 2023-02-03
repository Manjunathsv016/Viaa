package bus_Module;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom_repository.HomePage;
import genericLibrary.ReadData;

public class Bus_Oneway_004 extends BaseClass{

	@Test
	public void negativeToTextField(){

		HomePage hp = new HomePage(driver);
		hp.getToTextBox().click();
		System.out.println("hello");
		// Step1:Clicking on FromTextField.
		hp.getToTextBox().clear();
		// Step2:Typing invalid characters.
		hp.getToTextBox().sendKeys(ReadData.fromPropertyFile("invalidToData").toString());
		String enteredValue = hp.getToTextBox().getAttribute("value");
		Assert.assertEquals(enteredValue, ReadData.fromPropertyFile("invalidToData").toString(),
				"FromTextField data is not entered properly");
		Reporter.log("Data Entered Successfully in fromTextField in homePage", true);
		hp.getSearchBusButton().click();
		String errormessage = hp.getToErrorMessage().getText();
		Assert.assertEquals(errormessage, ReadData.fromPropertyFile("errorMessageForFromTextField"),"Error Message is not properly displayed");
		hp.getSearchBusButton().click();
	}
}