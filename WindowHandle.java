import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		   driver.get("https://the-internet.herokuapp.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			List<WebElement> inks = driver.findElements(By.xpath("//a"));
			for(WebElement ele:inks ) {
			String clinks = Keys.chord(Keys.CONTROL,Keys.ENTER);
	          ele.sendKeys(clinks);
	          Set<String> win = driver.getWindowHandles();
	          for(String s:win) {
	        	  driver.switchTo().window(s);
	          }
	          
			}
			
				
			}
			
			
		   
	}


