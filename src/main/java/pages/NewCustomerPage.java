package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage extends LoginPage {
	WebDriver driver;

	@FindBy(xpath = "html/body/div[2]/div/ul/li[2]/a")
	WebElement submitButton1;
	@FindBy(xpath = "//input[@name='name']")
	WebElement customernameTextBox;
	@FindBy(xpath = "//input[@value='f']")
	WebElement clickRadioButton;
	@FindBy(xpath = "//input[@id='dob']")
	WebElement dobTextBox;
	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement addressTextArea;
	@FindBy(xpath = "//input[@name='city']")
	WebElement cityTextBox;
	@FindBy(xpath = "//input[@name='state']")
	WebElement stateTextBox;
	@FindBy(xpath = "//input[@name='pinno']")
	WebElement pinTextBox;
	@FindBy(xpath = "//input[@name='telephoneno']")
	WebElement mobilenoTextBox;
	@FindBy(xpath = "//input[@name='emailid']")
	WebElement emailidTextBox;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordTextBox;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitButton2;
	//private WebElement clickSubmit1;
	//private WebElement clickSubmit2;

	public NewCustomerPage(WebDriver driver){
		super(driver);
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	public void clickSubmit1(){
	submitButton1.click();
	}	
	public void CustomerName(String name){
		customernameTextBox.sendKeys(name);
	}
	public void clickRadioButton(){
		clickRadioButton.click();
}
	public void dobTextBox(String number){
		dobTextBox.sendKeys(number);
	}
	
	public void addressTextArea(String address){
		 addressTextArea.sendKeys(address);
	}
	public void CityTextBox(String city){
		cityTextBox.sendKeys(city);
	}
	public void StateTextBox(String state){
		stateTextBox.sendKeys(state);
	}
	public void pinTextBox(String pin){
		pinTextBox.sendKeys(pin);
	}
	public void mobilenoTextBox(String mobileno){
		mobilenoTextBox.sendKeys(mobileno);
	}
	public void emailidTextBox(String emailid){
		emailidTextBox.sendKeys(emailid);
	}
	public void passwordTextBox(String password){
		passwordTextBox.sendKeys(password);
	}
	public void clickSubmit2(){
		submitButton2.click();
	}
}
