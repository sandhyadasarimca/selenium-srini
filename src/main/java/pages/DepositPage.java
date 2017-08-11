package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepositPage extends LoginPage {

WebDriver driver;
@FindBy(xpath="html/body/div[2]/div/ul/li[8]/a")
WebElement depositButton1;
@FindBy(xpath="//input[@name='accountno']")
WebElement accountnoTextBox;
@FindBy(xpath="//input[@name='ammount']")
WebElement amountTextBox;
@FindBy(xpath="//input[@name='desc']")
WebElement descriptionTextBox;
@FindBy(xpath="//input[@type='submit']")
WebElement submitButtion2;

public DepositPage(WebDriver driver) {
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void clickDeposit(){
	depositButton1.click();
	}	
public void accountNo(String accountno){
	accountnoTextBox.sendKeys(accountno);
	
}
public void amount(String amount){
	amountTextBox.sendKeys(amount);
}
public void description(String description){
	descriptionTextBox.sendKeys(description);
}
public void submit(){
	submitButtion2.click();
}
}
