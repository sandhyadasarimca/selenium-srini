package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage extends LoginPage {
	WebDriver driver;
	@FindBy(xpath = "html/body/div[2]/div/ul/li[5]/a")
	WebElement submitButton1;
	@FindBy(xpath = "//input[@name='cusid']")
	WebElement customeridTextBox;
	@FindBy(xpath = "//select[@name='selaccount']")
	WebElement accounttypeDropDown1;
	@FindBy(xpath = "//option[@value='Savings']")
	WebElement accounttypeDropDown2;
	@FindBy(xpath = "//input[@name='inideposit']")
	WebElement initialdepositTextBox;
	@FindBy(xpath = "//input[@name='button2']")
	WebElement submitButton2;

	public NewAccountPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	public void clickSubmit1(){
		submitButton1.click();
		}	
	public void customerId(String customerid){
		customeridTextBox.sendKeys(customerid);
	}
	public void clickDropDown1(){
		accounttypeDropDown1.click();
		
	}
	public void accountTypeDropDown2(){
		accounttypeDropDown2.click();
	}
	public void initialDepositTextBox(String amount){
		initialdepositTextBox.sendKeys(amount);
		
	}
	public void clickSubmit2(){
		submitButton2.click();
		}
}
