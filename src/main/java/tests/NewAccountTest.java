package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NewAccountPage;

public class NewAccountTest {
	WebDriver driver;
	LoginPage loginpage;
	NewAccountPage newaccountpage;
	@BeforeClass
	public void loginPage(){
		driver=new FirefoxDriver();
		loginpage=new LoginPage(driver);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		loginpage.typeUserName("mngr90442");
		loginpage.typePassword("vypatad");
		loginpage.clickSubmit();
	}
	@Test
	public void createNewAccount(){
		newaccountpage = new NewAccountPage(driver);
		newaccountpage.clickSubmit1();
		newaccountpage.customerId("8712");
		newaccountpage.clickDropDown1();
		newaccountpage.accountTypeDropDown2();
		newaccountpage.initialDepositTextBox("1500.00");
		newaccountpage.clickSubmit2();
	}
}
