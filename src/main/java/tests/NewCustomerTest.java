package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NewCustomerPage;
public class NewCustomerTest  {
WebDriver driver;
LoginPage loginpage;
NewCustomerPage newcustomerpage;
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
public void createNewCustomer(){
	newcustomerpage = new NewCustomerPage(driver);
	newcustomerpage.clickSubmit1();
	newcustomerpage.CustomerName("Vasmitha");
	newcustomerpage.clickRadioButton();
	newcustomerpage.dobTextBox("02-10-2015");
	newcustomerpage.addressTextArea("HsrLayout");
	newcustomerpage.CityTextBox("Bangalore");
	newcustomerpage.StateTextBox("lkarnataka");
	newcustomerpage.pinTextBox("560034");
	newcustomerpage.mobilenoTextBox("123212233");
	newcustomerpage.emailidTextBox("adrfjjyf@gmail.com");
	newcustomerpage.passwordTextBox("dgchghvhg");
	newcustomerpage.clickSubmit2();
}


}