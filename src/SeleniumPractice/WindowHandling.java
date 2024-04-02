package SeleniumPractice;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		Set<String> windows =driver.getWindowHandles();
		for(String s : windows) {
			System.out.println(s);
		}
		Iterator<String> i =windows.iterator();
		String parentId = i.next();
		String childId =i.next();
		driver.switchTo().window(childId);
		String email = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(email);
		driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("#username")).sendKeys(email);
	}

}
