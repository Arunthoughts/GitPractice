package SeleniumPractice;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArrayOfProducts {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * Do not use text for dynamic code as it may change at any time so go for
		 * stable locators (line no:26)
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		//Implicit Wait 1st type
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Implicit wait 2nd type but this is deprecated
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String[] productList = { "Cucumber", "Brocolli", "Beans", "Brinjal", "Potato" };

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		int countOfProductList = 0;
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			for (String p : productList) {
				if (name.contains(p)) {
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					countOfProductList++;
					if (countOfProductList > productList.length) {
						break;
					}
				}
			}
		}
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		//Explicit wait 
		/*first create object of WebDriverWait class and access until method for explicit wait
		  need to create object only once and we can use it anywhere*/ 
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//explicit method used
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.close();
	}

}
