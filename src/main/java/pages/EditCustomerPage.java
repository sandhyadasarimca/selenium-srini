package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage extends LoginPage {
	WebDriver driver;
	@FindBy(xpath = "html/body/div[2]/div/ul/li[3]/a")
	WebElement submitButton1;
	@FindBy(xpath = "//input[@name='cusid']")
	WebElement customeridTextBox;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitButton2;
	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement addressTextArea;
	@FindBy(xpath = "//input[@name='state']")
	WebElement stateTextBox;
	@FindBy(xpath = "//input[@name='sub']")
	WebElement submitButton3;
	

	public EditCustomerPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickSubmit1() {
		submitButton1.click();
	}

	public void CustomerId(String customerid) {
		customeridTextBox.sendKeys(customerid);
	}
	public void ClickSubmit2(){
		submitButton2.click();
	}

	public void AddressTextArea(String address) {
		addressTextArea.clear();
		addressTextArea.sendKeys(address);
	}

	public void state(String state) {
		stateTextBox.clear();
		stateTextBox.sendKeys(state);
	}
	public void ClickSubmit3(){
		submitButton3.click();
	}
}
