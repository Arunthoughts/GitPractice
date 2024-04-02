package SeleniumPractice;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Screenshot {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		/*File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\ASELVAKU\\Screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		List<WebElement> links = driver.findElements(By.cssSelector(".gf-li a"));
		SoftAssert s = new SoftAssert();
		for(WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			s.assertTrue(conn.getResponseCode()<400, ("\"\"" + url + "\"\"" + " is broken link i.e. " + conn.getResponseCode()));
		}
		s.assertAll();

	}

}
