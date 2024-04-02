package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropdownOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		/*findElement should return a WeElement we can receive that to create object for select class */
		
		WebElement element = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		
		/*
		 For static drop down always select is the tag name and we have a separate class for Select
		 in this class we have many methods to access 
		 to access these methods we need to create object for that while creating this object it needs an argument(WebElement
		 that is the location of the drop down 
		 */
		Select dropdown = new Select(element);
		
		dropdown.selectByIndex(3);     // method will select by index
		System.out.println(dropdown.getFirstSelectedOption().getText());   //method used to get the selected option
		
		dropdown.selectByValue("ARG");  //method will select by the displayed value
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("Albania"); // method will select by the value which is attribute of html page
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("INR");  //method will select by the displayed value
		System.out.println(dropdown.getFirstSelectedOption().getText());

	}

}
