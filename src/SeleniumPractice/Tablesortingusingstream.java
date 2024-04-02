package SeleniumPractice;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tablesortingusingstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//driver.findElement(By.cssSelector("th[role='columnheader']:nth-child(1)")).click();
		//List<WebElement> items = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		/*List<String> originalList = items.stream().map(n -> n.getText()).collect(Collectors.toList());
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(originalList.equals(sortedList));
		*/
		
		/*List <Integer> result;
		do {
			List<WebElement> items = driver.findElements(By.xpath("//tbody/tr/td[1]"));
			result = items.stream().filter(item->item.getText().contains("Rice")).map(item -> getPrice(item)).collect(Collectors.toList());
			
			if(result.size()<1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		}while(result.size()<1);
		
		result.forEach(item -> System.out.println(item));*/
		
		
		driver.findElement(By.id("search-field")).sendKeys("b");
		List <WebElement> items = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		items.stream().map(item -> item.getText().contains("b")).forEach(item -> System.out.println(item));
		
			
	}

	private static int getPrice(WebElement element) {
		return Integer.parseInt(element.findElement(By.xpath("following-sibling::td[1]")).getText());
	}

}
