package SeleniumPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


public class SeliniumIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		login(driver);
		String password = forgotPassword(driver);
		moveToLoginPage(driver);
		loginwithcrendentials(driver, password);
		
		/*driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("inputUsername")).sendKeys("Arun");
		driver.findElement(By.name("inputPassword")).sendKeys("Arun0000");
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		driver.findElement(By.cssSelector("button[class*='submit']")).click();	
		String str = driver.findElement(By.xpath("//p[@class='error']")).getText();
		System.out.println(str);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Ashok");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Gopal");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Gopal");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("12345");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();	
		
		String str1 = driver.findElement(By.className("infoMsg")).getText();
		
		System.out.println(str1);
		
		int startPos = str1.indexOf("'");
		int endPos = str1.indexOf("'", startPos+1);
		
		System.out.println(startPos);
		System.out.println(endPos);
		
		String pwd = str1.substring(startPos+1, endPos);
		
		System.out.println(pwd);
		
		driver.findElement(By.cssSelector("button[class*='go-to-']")).click();
		
		String userName = "NewUser001";
		
		driver.findElement(By.id("inputUsername")).sendKeys(userName);
		driver.findElement(By.name("inputPassword")).sendKeys(pwd);
		
		//keeping time delay to wait for the loading of the page
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		driver.findElement(By.cssSelector("button[class*='submit']")).click();
		
		
		//validating the successful login and greetings as per the user name
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error Occured");
		}
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
		
		Assert.assertEquals(driver.findElement(By.cssSelector("h2")).getText(),"Hello " + userName +",");
		Assert.assertEquals(driver.findElement(By.cssSelector("p")).getText(),"You are successfully logged in.");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("h1")).getText(), "Sign in");
		//driver.close();*/
	}
	
	public static void login(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("inputUsername")).sendKeys("Arun");
		driver.findElement(By.name("inputPassword")).sendKeys("Arun0000");
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		driver.findElement(By.cssSelector("button[class*='submit']")).click();	
		String str = driver.findElement(By.xpath("//p[@class='error']")).getText();
		System.out.println(str);
	}
	
	public static String forgotPassword(WebDriver driver) {
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Ashok");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Gopal");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Gopal");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("12345");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();	
		
		String str1 = driver.findElement(By.className("infoMsg")).getText();
		/*System.out.println(str1);
		int startPos = str1.indexOf("'");
		int endPos = str1.indexOf("'", startPos+1);
		System.out.println(startPos);
		System.out.println(endPos);
		String pwd = str1.substring(startPos+1, endPos);
		System.out.println(pwd);*/
		
		/*String[] passwordArray = str1.split("'");
		passwordArray = passwordArray[1].split("'");
		System.out.println(passwordArray[0]);
		return passwordArray[0];*/
		
		String[] passwordArray = str1.split("'",3);
		System.out.println(passwordArray[1]);
		return passwordArray[1];
	}
	public static void moveToLoginPage(WebDriver driver) {
		driver.findElement(By.cssSelector("button[class*='go-to-']")).click();
	}
	
	public static void loginwithcrendentials(WebDriver driver, String pwd) {
		String userName = "NewUser001";
		
		driver.findElement(By.id("inputUsername")).sendKeys(userName);
		driver.findElement(By.name("inputPassword")).sendKeys(pwd);
		
		//keeping time delay to wait for the loading of the page
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector("input#chkboxOne")).click();
		driver.findElement(By.cssSelector("button[class*='submit']")).click();
		
		
		//validating the successful login and greetings as per the user name
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error Occured");
		}
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
		
		Assert.assertEquals(driver.findElement(By.cssSelector("h2")).getText(),"Hello " + userName +",");
		Assert.assertEquals(driver.findElement(By.cssSelector("p")).getText(),"You are successfully logged in.");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("h1")).getText(), "Sign in");
		driver.quit();
	}

}
