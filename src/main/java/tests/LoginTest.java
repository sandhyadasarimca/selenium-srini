package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {
	WebDriver driver;
	LoginPage loginpage;
@BeforeClass
public void loginSetup(){
	driver=new FirefoxDriver();
	driver.get("http://demo.guru99.com/V4/");
}
@Test
public void testValidCredentials(){
loginpage=new LoginPage(driver);
loginpage.typeUserName("mngr90442");
loginpage.typePassword("vypatad");
loginpage.clickSubmit();
}
}
