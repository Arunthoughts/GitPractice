package SeleniumPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_2 {
	
	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Arun");
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Abcd@gamil.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("passsword");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select selectedDropdown = new Select(dropdown);
		
		selectedDropdown.selectByIndex(1);
		
		selectedDropdown.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("12/12/2023");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
		
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		
	}

}
