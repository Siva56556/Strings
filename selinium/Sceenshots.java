package selinium;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Sceenshots {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Long timeStamp = Calendar.getInstance().getTime().getTime();
		System.out.println(timeStamp);
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"\\srcshots"+timeStamp+".png"));
		
		
	}
}
