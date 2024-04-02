package SeleniumPractice;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TablesPractice {

	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.cssSelector(".table-display"));
		
		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(2).getText());
		

	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		List<WebElement> items =driver.findElements(By.cssSelector(".ui-menu-item"));
		for(int i=0;i<items.size();i++) {
			if(items.get(i).getText().equalsIgnoreCase("United States (USA)")){
				new Actions(driver).moveToElement(items.get(i)).click().build().perform();
			}
		}
		

		

	}

}
