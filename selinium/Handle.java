package selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle {
 public static void test () {
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver .manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button")).click();
 }
	public static void main(String[] args) {
		
test();
	}

}
