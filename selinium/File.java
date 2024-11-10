package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File {
	public static void  file () {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Dell\\Documents\\8th class physics.docx");
		
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		
		String text = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(text);
		if(text.equals("File Uploaded!")) {
			System.out.println("test case pass");
		}else {
			System.out.println("test case fail");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
file();
	}
	https://youtu.be/926nKBIHn2w?si=-MlQWTY6Z6wV8uHU
}
https://youtu.be/926nKBIHn2w?si=-MlQWTY6Z6wV8uHU