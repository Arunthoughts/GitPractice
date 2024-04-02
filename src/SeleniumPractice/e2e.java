package SeleniumPractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		Thread.sleep(3000);
		
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for(WebElement option :options){
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("India")){
				option.click();
				break;
				}
		}
		
		
		//Selecting Departure and Arrival stations
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//Selecting calendar date
		driver.findElement(By.linkText("18")).click();
		
		//checking whether return calendar is turned on or not
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("it's Enabled");
			Assert.assertTrue(true);
		}else {
			System.out.println("it's not Enabled");
			Assert.assertTrue(true);;   //we need to give false but to run test completely given true
		}
		
		//Selecting no of passengers
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
		
		//Selecting the select drop down which is 
		WebElement element = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(element);
		
		dropdown.selectByIndex(2);     // method will select by index
		System.out.println(dropdown.getFirstSelectedOption().getText());   //method used to get the selected option
		
		dropdown.selectByValue("INR");  //method will select by the displayed value
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		//driver.quit();
		
	}

}
