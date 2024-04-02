package SeleniumPractice;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/dynamic-loading/1");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				if(driver.findElement(By.cssSelector("div#finish h4")).isDisplayed()){
					return driver.findElement(By.cssSelector("div#finish h4"));
				}
				return null;
			}
		});
		
		System.out.println(element.getText());

	}

}
