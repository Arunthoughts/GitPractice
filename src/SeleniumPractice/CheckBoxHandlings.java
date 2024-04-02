package SeleniumPractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxHandlings {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		//to check the count of all check boxes find the locator which is common for all check boxes and store it in list
		List <WebElement> options = driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		//isSelected() method will return true if it is selected and false it is not selected
		//assertFalse() method expects a false condition otherwise test will fail here
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		//will return the number of elements
		System.out.println(options.size());
		
		Assert.assertEquals(options.size(), 6);
		
		driver.findElement(By.id("divpaxinfo")).click(); 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int i = 1;
		while(i<8) {
			driver.findElement(By.id("hrefIncAdt")).click(); //increasing the no of adults by looping (click on the +icon multiple times)
			i++;
		}
		
		int j = 1;
		while(j<3) {
			driver.findElement(By.id("hrefDecAdt")).click(); //decreasing the no of adults by looping (click on the -icon multiple times)
			j++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());   //verifying the no of adults at screen
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");
		
		driver.quit();
		
		
		

	}

}
