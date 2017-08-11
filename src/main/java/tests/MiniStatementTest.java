package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MiniStatementPage;

public class MiniStatementTest {
	WebDriver driver;
	LoginPage loginpage;
	MiniStatementPage ministatementpage;

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
	public void miniStatement() {
		ministatementpage = new MiniStatementPage(driver);
		ministatementpage.clickBalanceEnquiry();
		ministatementpage.accountNo("29810");
		ministatementpage.clickSubmit();
	}
}
