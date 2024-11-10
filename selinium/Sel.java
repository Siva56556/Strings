package selinium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel {
	public static void  Test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","\\Users\\Dell\\eclipse-workspace\\Rise\\drivers\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/dropdown");
		   driver.manage().window().maximize();
		 WebElement ed = driver.findElement(By.xpath("//select[@id ='dropdown']"));
		Select sel = new Select(ed);
//		sel.selectByVisibleText("Option 2");
		sel.selectByValue("1");
		Thread.sleep(3000);
		sel.selectByIndex(2);
		System.out.println("shi");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Test();

	}

}
C:\Users\Dell\eclipse-workspace\Rise\drivers
C:\Users\Dell\eclipse-workspace\Rise\drivers\chromedriver.exe