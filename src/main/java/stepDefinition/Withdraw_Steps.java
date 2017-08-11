package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Withdraw_Steps {
	ChromeDriver driver;
	// FirefoxDriver driver;

	@Given("^user is logged in$")
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();

		// driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/v4/");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr90442");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vypatad");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	}

	@When("^customer enters account no and withdraw the amount$")
	public void withdraw() {
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//input[@name='accountno']")).sendKeys("31085");
		driver.findElement(By.xpath("//input[@name='ammount']")).sendKeys("677");
		driver.findElement(By.xpath("//input[@name='desc']")).sendKeys("account debited by amount");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("^account debited by amount$")
	public void chech() {
		System.out.println("account debited by amount");
	}

}
