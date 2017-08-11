package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundTransferPage extends LoginPage {

WebDriver driver;
@FindBy(xpath="html/body/div[2]/div/ul/li[10]/a")
WebElement fundtransferButton1;
@FindBy(xpath="//input[@name='payersaccount']")
WebElement payersaccountnoTextBox;
@FindBy(xpath="//input[@name='payeeaccount']")
WebElement payeeaccountnoTextBox;
@FindBy(xpath="//input[@name='ammount']")
WebElement amountTextBox;
@FindBy(xpath="//input[@name='desc']")
WebElement DescriptionTextBox;
@FindBy(xpath="//input[@type='submit']")
WebElement submitButton;
public FundTransferPage(WebDriver driver) {
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void fundTransferButton1(){
	fundtransferButton1.click();
}
public void payersAccountNoTextBox(String accountno){
	payersaccountnoTextBox.sendKeys(accountno);
}
public void payeeaccountNoTextBox(String accountno){
	payeeaccountnoTextBox.sendKeys(accountno);
}
public void amountTextBox(String amount){
	amountTextBox.sendKeys(amount);
}
public void DescriptionTextBox(String description){
	DescriptionTextBox.sendKeys(description);
}
public void submitButton(){
	submitButton.click();
}
}
