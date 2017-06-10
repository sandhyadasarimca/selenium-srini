import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Account {
public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://demo.guru99.com/v4");
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr79115");
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("juzamus");
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[5]/a")).click();
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")).sendKeys("61275");
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")).sendKeys("savings");
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("20000");
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")).click();
	
	
}
}
