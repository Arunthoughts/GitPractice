package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		/*This isEnabled()is not working nowadays because new in current html working is it disabled for UI perspective but
		when u click it is getting enabled/*
		
		/*System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());*/
		
		/*Alternate solution to check whether it is enabled or not is definitely one attribute will change it is enabled
		  and disabled we need to find out that one attribute and use that to validate the condition
		  
		 */
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("it's Enabled");
			Assert.assertTrue(true);
		}else {
			System.out.println("it's not Enabled");
			Assert.assertTrue(false);;
		}
		
		

	}

}
