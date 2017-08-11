import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerDel {
public static void main(String[] args) {
	//FirefoxDriver driver=new FirefoxDriver();
	//String webdriver;
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/v4");
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr79115");
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("juzamus");
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[7]/a")).click();
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")).sendKeys("28607");
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")).click();
	driver.switchTo().alert().accept(); 
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[4]/a")).click();
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")).sendKeys("43836");
	driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input[1]")).click();
	Alert a=driver.switchTo().alert();
	a.accept();
	Alert b=driver.switchTo().alert();
	b.accept();
	
}
}
