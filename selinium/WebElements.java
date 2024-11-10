package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElements {
public static void webDriver() {
	   WebDriver driver = new FirefoxDriver();
	   driver.get("https://the-internet.herokuapp.com/forgot_password");
	   driver.manage().window().maximize();
	   String title = driver.getTitle();
		System.out.println(title);
	   WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	       email.sendKeys("hell");
	   Dimension d = email.getSize();
	                    
		System.out.println(d.height+" "+d.width);
		Point p = email.getLocation();
		System.out.println(p.x+" "+p.y);
		String name= email.getTagName();
		System.out.println(name);
		String Attribute= email.getAttribute("type");
		System.out.println(Attribute);
		boolean enable= email.isEnabled();
		System.out.println(enable);
		boolean ena= email.isDisplayed();
		System.out.println(ena);
		String href = driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).getAttribute("href");
		System.out.println(href);
		 email.clear();
		 email.sendKeys("hello");
		 
		 driver.findElement(By.xpath("//button[@id ='form_submit']")).click();
		String text = driver.findElement(By.xpath("//h1 [text() ='Internal Server Error']")).getText();
		System.out.println(text);
	
		
	    driver.navigate().to(href);
	    driver.quit();
}
	public static void main(String[] args) throws InterruptedException {

    webDriver();
	}

}
