package SeleniumPractice;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RTEPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List <WebElement> list =driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		WebElement miniDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(miniDriver.findElements(By.tagName("a")).size());
		WebElement columnDriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		for(int i=0;i<columnDriver.findElements(By.tagName("a")).size();i++) {
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		}
		Set<String> windowList = driver.getWindowHandles();
		Iterator <String> it = windowList.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
