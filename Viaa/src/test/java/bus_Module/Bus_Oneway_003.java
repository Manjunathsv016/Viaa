package bus_Module;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;

public class Bus_Oneway_003 extends BaseClass{

	@Test
	public void oneWayFromTextField() {
		//Step1:Clicking on FromTextField.
		System.out.println(toPlace);
		
		hp.getToTextBox().sendKeys(toPlace);
		String enteredValue = hp.getToTextBox().getAttribute("value");
		hp.getGoaSearchSuggestion().click();

 
		Assert.assertEquals(enteredValue, toPlace,
				"FromTextField data is not entered properly");
		Reporter.log("Data Entered Successfully in fromTextField in homePage", true);
	}
}
