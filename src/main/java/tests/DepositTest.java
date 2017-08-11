package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DepositPage;
import pages.LoginPage;

public class DepositTest {
	WebDriver driver;
	LoginPage loginpage;
	DepositPage depositpage;
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
	public void deposit(){
		depositpage = new DepositPage(driver);
		depositpage.clickDeposit();
		depositpage.accountNo("29810");
		depositpage.amount("500");
		depositpage.description("deposited 500.99 money");
		depositpage.clickSubmit();
}
}