package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("span[role='button']")).click();
		Actions arrow = new Actions(driver);
		//arrow.moveToElement(driver.findElement(By.cssSelector("a[class='_1TOQfO'] img[alt='Login']"))).build().perform();
		arrow.moveToElement(driver.findElement(By.cssSelector("div._2SmNnR"))).click().keyDown(Keys.SHIFT).sendKeys("speaker")
		.doubleClick().build().perform();
		arrow.moveToElement(driver.findElement(By.cssSelector("img[alt='Dropdown with more help links']"))).contextClick()
		.build().perform();

	}

}
