import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewCust {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/v4");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr79115");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("juzamus");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("Nivas Dasari");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
		driver.findElement(By.xpath(".//*[@id='dob']")).sendKeys("10-02-1892");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea"))
				.sendKeys("belandlur ");
		driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).sendKeys("bengalore");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")).sendKeys("karnataa");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")).sendKeys("675423");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input"))
				.sendKeys("1234880347");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input"))
				.sendKeys("srinid5656@gmail.com");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input"))
				.sendKeys("vcghvhddfdkh");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")).click();

		String name = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[5]/td[2]")).getText();
		if (name.equals("Rao D")) {
			System.out.println("name matched");
		} else {
			System.out.println("name didn't match");
		}
		String address = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[8]/td[2]")).getText();
		if (address.equals("belandur")) {
			System.out.println("address matched");
		} else {
			System.out.println("address didn't match");
		}
		String city = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[9]/td[2]")).getText();
		if (city.equals("bengalore")) {
			System.out.println("city matched");
		} else {
			System.out.println("city didn't matched");
		}
		String state = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[10]/td[2]")).getText();
		if (state.equals("karnataka")) {
			System.out.println("state matched");
		} else {
			System.out.println("state didn't match");
		}
		String pin = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[11]/td[2]")).getText();
		if (pin.equals("675423")) {
			System.out.println("pin matched");
		} else {
			System.out.println("pin didn't match");
		}
		String mobileNumber = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[12]/td[2]")).getText();
		if (mobileNumber.equals("1234562345")) {
			System.out.println("mobile number matched");
		} else {
			System.out.println("mobile number didn't match");
		}
		String email = driver.findElement(By.xpath(".//*[@id='customer']/tbody/tr[13]/td[2]")).getText();
		if (email.equals("srini33@gmail.com")) {
			System.out.println("email matched");
		} else {
			System.out.println("email didn't matched");

		}

	}
}
