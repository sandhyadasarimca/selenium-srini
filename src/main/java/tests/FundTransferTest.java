package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FundTransferPage;
import pages.LoginPage;

public class FundTransferTest {
	WebDriver driver;
	LoginPage loginpage;
	FundTransferPage fundtransferpage;
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
	public void fundTransfer(){
		fundtransferpage = new FundTransferPage(driver);
		fundtransferpage.fundTransferButton1();
		fundtransferpage.payersAccountNoTextBox("29810");
		fundtransferpage.payeeaccountNoTextBox("29823");
		fundtransferpage.amountTextBox("369");
		fundtransferpage.DescriptionTextBox("sended from payers 369 to payees");
		fundtransferpage.clickSubmit();
	}
}
