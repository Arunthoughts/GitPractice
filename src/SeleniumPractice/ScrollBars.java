package SeleniumPractice;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBars {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=200");
		
		List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]"));
		int sum=0;
		for(int i=0;i<values.size();i++) {
			int value =Integer.parseInt(values.get(i).getText()); //pareseint return a primitive int and we can use valueOf method that will return Integer object
			sum = sum + value;	
		}
		System.out.println(sum);
		
		if (sum == Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim())) {
			System.out.println("Results are same");
		}else {
			System.out.println("Results are different");
		}

	}

}
 