package SeleniumPractice;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		String month = "January";
		String date = "31";
		List<WebElement> dates =driver.findElements(By.cssSelector(".dateInnerCell"));
		System.out.println(dates.size());
		for(int j=1;j<dates.size();j++) {
			if(driver.findElements(By.cssSelector(".dateInnerCell")).get(j).getText().contains(date)) {
				driver.findElements(By.cssSelector(".dateInnerCell")).get(j).click();
				break;
			}
		}
	}

}
