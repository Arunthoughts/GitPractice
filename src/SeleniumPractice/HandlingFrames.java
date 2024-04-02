package SeleniumPractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		for(WebElement e : list) {
			System.out.println(e);
		}
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		Actions item = new Actions(driver);
		item.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
		driver.switchTo().defaultContent(); // used to come back to org page (i.e. if it is switched to frames it will not see the org content in that page)

	}

}
