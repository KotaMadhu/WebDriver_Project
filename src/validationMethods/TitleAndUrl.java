package validationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndUrl {

	public static void main(String[] args) throws Throwable {
		// Print Title and Url along with length
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		
		String Expected ="https://";
		String Actual=driver.getCurrentUrl();
		if(Actual.startsWith(Expected)) {
			System.out.println("Url is Secured::"+Expected+"  "+Actual);
		}
		else
		{
			System.out.println("Url is Local::"+Expected+"  "+Actual);
		}
		
		driver.quit();
	}

}

