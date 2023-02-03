package bus_Module;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pom_repository.HomePage;

public class ClickOnSearchButton extends BaseClass{
	@Test
	public void searchButton() {
		 hp = new HomePage(driver);
		hp.getSearchBusButton().click();
		Reporter.log("Click action on Search Button is Successfull",true);
	}
	

}
