package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.EditAccountPage;
import pages.LoginPage;

public class EditAccountTest {
	WebDriver driver;
	
	LoginPage loginpage;
	EditAccountPage editaccountpage;
	
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
	public void editAccount(){
		editaccountpage = new EditAccountPage(driver);
		editaccountpage.clickButton();
		editaccountpage.accountNo("29810");
		editaccountpage.clickSubmit1();
		editaccountpage.clickDropDown1();
		editaccountpage.clickDropDown2("current");
		//editaccountpage.clickSubmit2();
}
}
