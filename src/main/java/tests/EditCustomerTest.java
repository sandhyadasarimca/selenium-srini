package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.EditCustomerPage;
import pages.LoginPage;

public class EditCustomerTest {
	WebDriver driver;
	LoginPage loginpage;
EditCustomerPage editcustomerpage;
	@BeforeClass
	public void loginPage (){
		driver=new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
		loginpage=new LoginPage(driver);
		loginpage.typeUserName("mngr90442");
		loginpage.typePassword("vypatad");
		loginpage.clickSubmit();
	}
	@Test
	public void editCustomer(){
		editcustomerpage = new EditCustomerPage(driver);
		editcustomerpage.clickSubmit1();
		editcustomerpage.CustomerId("8712");
		editcustomerpage.ClickSubmit2();
		editcustomerpage.AddressTextArea("Silkboard");
		editcustomerpage.state("Karnataka");
		editcustomerpage.ClickSubmit3();
	
}
}
