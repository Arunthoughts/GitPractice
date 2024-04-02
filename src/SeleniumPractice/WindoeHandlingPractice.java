package SeleniumPractice;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoeHandlingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> i =windows.iterator();
		String parentId = i.next();
		String childId =i.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());

	}

}
