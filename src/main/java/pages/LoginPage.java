package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
@FindBy(xpath="//input[@name='uid']")
WebElement usernameTextBox;
@FindBy(xpath="//input[@name='password']")
WebElement passwordTextBox;
@FindBy(xpath="//input[@type='submit']")
WebElement submitButton;
public LoginPage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void typeUserName(String username){
	usernameTextBox.sendKeys(username);
}
public void typePassword(String password){
	passwordTextBox.sendKeys(password);
}
public void clickSubmit(){
	submitButton.click();
}
}