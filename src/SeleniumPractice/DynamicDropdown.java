package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();   
		/*here departure also has MAA and arrival also has MAA* thats why we are giving index to avoid collapse but it is not best approach*/
		
		//Best Approach
		
		//here we are giving the parent xpath<space> child xpath (i.e scope of the child xath will be searched only inparent xpath)
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
	}

}
