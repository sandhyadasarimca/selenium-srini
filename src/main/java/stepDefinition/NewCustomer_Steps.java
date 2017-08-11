package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewCustomer_Steps {
	 ChromeDriver driver;
	//FirefoxDriver driver;

	@Given("^user is logged in$")
	public void login() {
		 System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		 driver = new ChromeDriver();

		//driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/v4/");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr90442");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vypatad");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	}

	@When("^enter new customer details$")
	public void details() {
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("srinu D");
		driver.findElement(By.xpath("//input[@value='m']")).click();
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("11-05-1987");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("silkboard");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("hyd");
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("568899");
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("2346767667");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("srinud@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hghghjgh");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("^new customer created$")
	public void check() {
		System.out.println("customer created");

	}

}
