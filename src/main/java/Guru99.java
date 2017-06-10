import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99 {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
				.sendKeys("syaggmhh@gmail.com");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")).sendKeys("vgfjy");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")).click();
		String name = driver.findElement(By.xpath("")).getText();
		if (name.equals("Syam D")) {
			System.out.println("Customer name matched");
		} else {
			System.out.println("customer name not matched");
		}
	}

}
