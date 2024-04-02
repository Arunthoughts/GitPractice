package SeleniumPractice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.navigate().to("https://www.rahulshettyacademy.com");
		/*driver.navigate().back();
		driver.navigate().forward();*/
		
	}

}
