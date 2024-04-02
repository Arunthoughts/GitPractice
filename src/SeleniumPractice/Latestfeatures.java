package SeleniumPractice;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class Latestfeatures {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		System.out.println(driver.findElement(with(By.tagName("label")).above(driver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid:nth-child(2)")))).getText());
		driver.findElement(with(By.tagName("input")).below(driver.findElement(By.cssSelector("[for='dateofBirth']")))).click();
		driver.findElement(with(By.tagName("input")).toLeftOf(driver.findElement(By.cssSelector("[for='exampleCheck1']")))).click();
		
		//using relative locators 
		WebElement element  = driver.findElement(By.cssSelector("#inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(element)).getText());*/
		
		
		//@invoking multiple windows
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//Switching window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set <String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		System.out.println(courseName);
		driver.switchTo().window(parentWindow);
		//get screenshot
		WebElement element = driver.findElement(By.cssSelector("[name='name']"));
		element.sendKeys(courseName);
		File file =element.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File("element"));
		
		//get height and width
		System.out.println(element.getRect().getDimension().getHeight());
		System.out.println(element.getRect().getDimension().getWidth());
		
		
	}

}
