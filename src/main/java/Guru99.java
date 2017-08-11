import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99 {
	WebDriver driver;
	public static final String USERNAME = "srini211";
	public static final String AUTOMATE_KEY = "v2mihLTeA7eoj4Sn3Fht";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@BeforeTest(groups = { "positive", "functional", "customerCreation", "name", "address", "city", "state", "pin",
			"mobileNo", "emailId" })
	public void setUp() throws MalformedURLException {
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("browser", "Safari");
		 caps.setCapability("browser_version", "9.1");
		 caps.setCapability("os", "OS X");
		 caps.setCapability("os_version", "El Capitan");
		 caps.setCapability("resolution", "1024x768");
		
		 WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		//driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr79115");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("juzamus");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();

		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("Syam D");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
		driver.findElement(By.xpath(".//*[@id='dob']")).sendKeys("01-01-2000");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea"))
				.sendKeys("hsrlayout");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input"))
				.sendKeys("Bangalore");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input"))
				.sendKeys("Karnataka");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")).sendKeys("560034");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input"))
				.sendKeys("1234567890");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input"))
				.sendKeys("abcdegggy@gmail.com");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")).sendKeys("vgfjy");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")).click();
	}

	@Test(groups = { "positive", "functional", "customerCreation", "name" }, priority = 1)
	public void testCustomerName() {

		String name = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[5]/td[2]")).getText();
		Assert.assertEquals(name, "Syam D");
	}

	@Test(groups = { "positive", "functional", "customerCreation", "address" }, priority = 5)
	public void testCustomerAddress() {

		String address = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[8]/td[2]")).getText();
		Assert.assertEquals(address, "hsrlllayout");
	}

	@Test(groups = { "positive", "functional", "customerCreation", "city" }, priority = 2)
	public void testCustomerCity() {

		String city = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[9]/td[2]")).getText();
		Assert.assertEquals(city, "bangalore");
	}

	@Test(groups = { "positive", "functional", "customerCreation", "state" }, priority = 4)
	public void testCustomerState() {

		String state = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[10]/td[2]")).getText();
		Assert.assertEquals(state, "karnataka");
	}

	@Test(groups = { "positive", "functional", "customerCreation", "pin" }, enabled = false)
	public void testCustomerpin() {

		String pin = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[11]/td[2]")).getText();
		Assert.assertEquals(pin, "569934");
	}

	@Test(groups = { "positive", "functional", "customerCreation", "mobileNo" }, priority = 6, invocationCount = 3)
	public void testCustomerMobileNo() {

		String mobileno = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[12]/td[2]")).getText();
		Assert.assertEquals(mobileno, "1234567890");
	}

	@Test(groups = { "positive", "functional", "customerCreation", "emailId" }, priority = 3)
	public void testCustomerEmailId() {

		String emailid = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[13]/td[2]")).getText();
		Assert.assertEquals(emailid, "abcdettty@gmail.com");

	}

}
