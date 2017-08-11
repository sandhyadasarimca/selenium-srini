package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccountPage extends LoginPage{

WebDriver driver;

@FindBy(xpath="html/body/div[2]/div/ul/li[6]/a")
WebElement editaccountButton1;
@FindBy(xpath="//input[@name='accountno']")
WebElement accountnoTextBox;
@FindBy(xpath="//input[@type='submit']")
WebElement submitButton1;
@FindBy(xpath="//select[@name='a_type']")
WebElement dropdownButton1;
@FindBy(xpath="//*[text()='Current']")
WebElement dropdownButton2;
@FindBy(xpath="//input[@type='Submit']")
WebElement submitButton2;
public EditAccountPage(WebDriver driver) {
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void clickButton(){
	editaccountButton1.click();
}
public void accountNo(String accountno){
	accountnoTextBox.sendKeys(accountno);
}
public void clickSubmit1(){
	submitButton1.click();
}
public void clickDropDown1(){
	dropdownButton1.click();
}
public void clickDropDown2(String current){
	dropdownButton2.sendKeys(current);
	dropdownButton2.click();
	
}
public void clickSubmit2(){
	submitButton2.click();
}
}
