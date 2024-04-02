package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().deleteCookieNamed("rahulshettyacademy_session");
		driver.findElement(By.id("name")).click();

	}

}
