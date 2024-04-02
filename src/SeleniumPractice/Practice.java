package SeleniumPractice;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='user']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement element = driver.findElement(By.cssSelector("select.form-control"));
		Select dropdown = new Select(element);
		dropdown.selectByValue("teach");
		
		
		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.cssSelector("input#signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn.btn-info")));
		
		List<WebElement> productList = driver.findElements(By.cssSelector("button.btn.btn-info"));
		
		for(WebElement e : productList) {
			e.click();
		}
		
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
		driver.close();

	}

}
