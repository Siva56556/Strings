package selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroolllfun {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,100)"," ");
	WebElement ele =driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).build().perform();
	js.executeScript("arguments[0].click()",ele);
	
	}

}
