package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMessagesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for handling alert messages we need to switch the property of driver because
		 * alert is not based on html properties it is based on the javascript
		 * switchTo() will be used to switch inside alert() you will be able to find
		 * many use case methods
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Arun");
		driver.findElement(By.cssSelector("#alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("name")).sendKeys("Arun Kumar");
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.close();

	}

}
