package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("label[for='benz'] input")).click();
		String str =driver.findElement(By.cssSelector("label[for='benz']")).getText();
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByVisibleText(str);
		driver.findElement(By.id("name")).sendKeys(str);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText().contains(str));
	}

}
