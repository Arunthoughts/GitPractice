package SeleniumPractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("be");

		Thread.sleep(3000);
		//by using csssSelector
		
		//we are capturing all the web elements of Auto suggestive drop down and storing it in List
		//to access the particular element iterate through list and 
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for(WebElement option :options){
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("Bermuda")){
				option.click();
				break;
				}
		}
		
		//by using className
		/*driver.findElement(By.id("autosuggest")).sendKeys("be");
		  
		Thread.sleep(3000);
		
		List <WebElement> options = driver.findElements(By.className("ui-menu-item"));
		
		for(WebElement option :options) {
			System.out.println(option.getText());
		}*/
		
		driver.quit();
		

		}

}

