package selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class orange {

	public static void main(String[] args) {
		  WebDriver driver = new FirefoxDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
            driver.findElement(By.xpath("//button")).click();
            String header = driver.findElement(By.xpath("//h6")).getText();
            System.out.println(header);
            if(header.equals("Dashboard")) {
            	System.out.println("login");
            }else {
            	System.out.println("fail");
            }
            
	}


}
