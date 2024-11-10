package selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("https://the-internet.herokuapp.com/tables");
List<WebElement> tabledata = driver.findElements(By.xpath("//table[@id='table1']//td"));
int tablerow = driver.findElements(By.xpath("//table[@id='table1']//tr")).size();
System.out.println(tablerow);
int tablecol = driver.findElements(By.xpath("//table[@id='table1']//tr[1]/td")).size();
System.out.println(tablecol);
int size = tabledata.size();
System.out.println(size);

for(int i=0; i<=tablerow;i++) {
	for(int j=0; j<=tablecol;j++) {
		String txt = driver.findElements(By.xpath("//table[@id='table1']//tr[" +i+ "]/td")).getText()
	}
}

	}

}
