package validationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetAttribute {

	public static void main(String[] args) throws Throwable {
		// Print Title and Url along with length
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		//Print Gmail Text
		String GmailText=driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(GmailText);
		//Print Gmail Url
		String GmailUrl=driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(GmailUrl);
		driver.quit();
	}

}

