package validationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlContains {

	public static void main(String[] args) throws Throwable {
		// Print Title and Url along with length
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tatacliq.com");
		Thread.sleep(5000);
		//Print Title of page and length of Title
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		System.out.println(PageTitle.length());
		//Print Url and length of url
		String strUrl=driver.getCurrentUrl();
		System.out.println(strUrl);
		System.out.println(strUrl.length());
		driver.quit();
	}

}

