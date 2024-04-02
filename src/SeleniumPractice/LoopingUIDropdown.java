package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoopingUIDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //to visit this particular page
		
		driver.manage().window().maximize();		
		
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
		
		
		
	
		
		
		//driver.findElement(By.cssSelector("span[class='sc-12foipm-22 cUvQPq fswDownArrow fswDownArrowTraveller']")).click();
		
		//driver.findElement(By.cssSelector("span[class='sc-12foipm-64 dGRyPm']")).click();
		//driver.findElement(By.cssSelector("path[stroke='#2276E3']")).click();
		/*driver.findElement(By.cssSelector("path[stroke='#2276E3']")).click();
		driver.findElement(By.cssSelector("path[stroke='#2276E3']")).click();
		driver.findElement(By.cssSelector("path[stroke='#2276E3']")).click();
		*/
		
		//driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
		

	}

}
