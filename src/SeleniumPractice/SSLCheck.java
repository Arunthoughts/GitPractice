package SeleniumPractice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions(); 
		options.setAcceptInsecureCerts(true);   //this method is used to pass the insecure certificates check
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
