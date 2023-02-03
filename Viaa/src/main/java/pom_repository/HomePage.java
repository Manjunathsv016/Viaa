package pom_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "SignIn")
	private WebElement signInNavBarButton;

	@FindBy(xpath = "//span[text()='SIGN UP']")
	private WebElement signUpButton;

	@FindBy(id = "emailIdSignUp")
	private WebElement emailIdTextBoxSingnUp;

	@FindBy(id = "nameSignUp")
	private WebElement nameTextBox;

	@FindBy(id = "passwordSignUp")
	private WebElement passwordTextBoxSignUp;

	@FindBy(id = "mobileNoSignUp")
	private WebElement phoneTextBox;

	@FindBy(id = "signUpValidate")
	private WebElement createAccountButton;

	@FindBy(id = "loginIdText")
	private WebElement emailIdTextBoxLogin;

	@FindBy(id = "passwordText")
	private WebElement passwordTextBoxLogin;

	@FindBy(id = "loginValidate")
	private WebElement signInButton;

	@FindBy(xpath = "//span[text()='SIGN IN']")
	private WebDriver signInLink;

	@FindBy(linkText = "One way")
	private WebDriver oneWayLinkText;
	
	@FindBy(linkText = "Round trip")
	private WebDriver roundTripLinkText;
	
	@FindBy(linkText = "Packages")
	private WebDriver packagesLink;

	@FindBy(xpath = "//div[@id='viaAlert']/div/div")
	private WebElement viaHomePageAlertMessage;

	@FindBy(id = "departure")
	private WebElement departureCalenderTextBox;

	@FindBy(id = "return")
	private WebElement returnCalenderTextBox;

	@FindBy(xpath = "//input[@value='Search Buses' and contains(@class,'journey')]")
	private WebElement searchBusButton;

	public WebElement getRightCalenderArrowIcon() {
		return rightCalenderArrowIcon;
	}

	@FindBy(xpath = "(//span[contains(@class,'icon-Rightarrow')])[2]")
	private WebElement rightCalenderArrowIcon;

	@FindBy(xpath = "(//span[contains(@class,'icon-leftarrow')])[1]")
	private WebElement leftCalenderArrowIcon;
	
	@FindBy(xpath = "//li[.='Goa']")
	private WebElement goaSearchSuggestion;
	
	@FindBy(xpath = "//li[.='Bangalore']")
	private WebElement bangaloreSearchSuggestion;
	
	@FindBy(xpath = "//li[.='Chennai']")
	private WebElement chennaiSearchSuggestion;
	
	@FindBy(xpath = "//li[.='Hyderabad']")
	private WebElement hyderabadSearchSuggestion;

	@FindBy(id = "dest")
	private WebElement toTextBox;

	@FindBy(id = "src")
	private WebElement fromTextBox;
	
	@FindBy(xpath = "//div[@role='alert']/div[2]")
	private WebElement fromErrorMessage;
	
	@FindBy(xpath = "//div[@role='alert']/div[2]")
	private WebElement toErrorMessage;
	
	@FindBy(id="Bus")
	private WebElement busIcon;
	
	public WebElement getBusIcon() {
		return busIcon;
	}

	public WebElement getToErrorMessage() {
		return toErrorMessage;
	}
	
	public WebElement getFromErrorMessage() {
		return fromErrorMessage;
	}

	public WebDriver getPackagesLink() {
		return packagesLink;
	}

	public WebElement getFromTextBox() {
		return fromTextBox;
	}

	public WebElement getLeftCalenderArrowIcon() {
		return leftCalenderArrowIcon;
	}

	public WebElement getDepartureCalenderTextBox() {
		return departureCalenderTextBox;
	}

	public WebElement getReturnCalenderTextBox() {
		return returnCalenderTextBox;
	}

	public WebElement getViaHomePageAlertMessage() {
		return viaHomePageAlertMessage;
	}

	public WebElement getToTextBox() {
		return toTextBox;
	}

	public WebElement getSignInNavBarButton() {
		return signInNavBarButton;
	}

	public WebElement getSignUpButton() {
		return signUpButton;
	}

	public WebElement getEmailIdTextBoxSingnUp() {
		return emailIdTextBoxSingnUp;
	}

	public WebElement getNameTextBox() {
		return nameTextBox;
	}

	public WebElement getPasswordTextBoxSignUp() {
		return passwordTextBoxSignUp;
	}

	public WebElement getPhoneTextBox() {
		return phoneTextBox;
	}

	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}

	public WebElement getEmailIdTextBoxLogin() {
		return emailIdTextBoxLogin;
	}

	public WebElement getPasswordTextBoxLogin() {
		return passwordTextBoxLogin;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebDriver getSignInLink() {
		return signInLink;
	}
	
	public WebElement getSearchBusButton() {
		return searchBusButton;
	}
	
	public WebDriver getOneWayLinkText() {
		return oneWayLinkText;
	}

	public WebDriver getRoundTripLinkText() {
		return roundTripLinkText;
	}

	public WebElement getGoaSearchSuggestion() {
		return goaSearchSuggestion;
	}

	public WebElement getBangaloreSearchSuggestion() {
		return bangaloreSearchSuggestion;
	}

	public WebElement getChennaiSearchSuggestion() {
		return chennaiSearchSuggestion;
	}

	public WebElement getHyderabadSearchSuggestion() {
		return hyderabadSearchSuggestion;
	}
}
