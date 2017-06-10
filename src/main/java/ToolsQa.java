import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolsQa {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aparna");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dasari");
		driver.findElement(By.xpath("//input[@id='sex-1']")).click();
		driver.findElement(By.xpath("//input[@id='exp-0']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04-06-2017");
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		driver.findElement(By.xpath("//input[@id='photo']")).click();
		// driver.findElement(By.name("Anjaneya")).sendKeys("C:\Users\Aparna\Desktop\Anjaneya");
		driver.findElement(
				By.xpath("//a[@href='http://toolsqa.wpengine.com/wp-content/uploads/2014/04/OnlineStore.zip']"))
				.click();
		driver.findElement(
				By.xpath("//a[@href='http://toolsqa.com/wp-content/uploads/2016/09/Test-File-to-Download.xlsx']"))
				.click();
		driver.findElement(By.xpath("//input[@id='tool-1']")).click();
		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		driver.findElement(By.xpath("//select[@id='continents']")).click();
		driver.findElement(By.xpath("//button[@id='submit']")).click();

	}
}
