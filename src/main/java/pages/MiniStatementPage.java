package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniStatementPage extends LoginPage {
	WebDriver driver;
	@FindBy(xpath = "html/body/div[2]/div/ul/li[13]/a")
	WebElement ministatementButton1;
	@FindBy(xpath = "//input[@name='accountno']")
	WebElement accountnoTextBox;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitButtion2;

	public MiniStatementPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickBalanceEnquiry() {
		ministatementButton1.click();
	}

	public void accountNo(String accountno) {
		accountnoTextBox.sendKeys(accountno);
	}

	public void submit() {
		submitButtion2.click();
	}

}
