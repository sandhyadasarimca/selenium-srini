package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.BalanceEnquiryPage;
import pages.LoginPage;

public class BalanceEnquiryTest {
	WebDriver driver;
	LoginPage loginpage;
	BalanceEnquiryPage balanceenquirypage;

	@BeforeClass
	public void loginPage() {
		driver = new FirefoxDriver();
		loginpage = new LoginPage(driver);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		loginpage.typeUserName("mngr90442");
		loginpage.typePassword("vypatad");
		loginpage.clickSubmit();
	}

	@Test
	public void balanceEnquiry() {
		balanceenquirypage = new BalanceEnquiryPage(driver);
		balanceenquirypage.clickBalanceEnquiry();
		balanceenquirypage.accountNo("29810");
		balanceenquirypage.clickSubmit();
	}
}
