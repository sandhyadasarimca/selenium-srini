package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MiniStmt_Steps {
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

	@When("^customer enter acc no$")
	public void miniStmt() {
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[13]/a")).click();
		driver.findElement(By.xpath("//input[@name='accountno']")).sendKeys("31085");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("^customer could take mini stmt$")
	public void check() {
		System.out.println("mini statement");
	}
}
