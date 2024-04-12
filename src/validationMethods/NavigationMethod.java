package validationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://google.com/");
		System.out.println("Page Title[1]:"+driver.getTitle());
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Gmail']")).click();
		System.out.println("Page Title[2]:"+driver.getTitle());
		Thread.sleep(5000);
		
		driver.navigate().back();
		System.out.println("Page Title[3]:"+driver.getTitle());
		Thread.sleep(5000);
		
		driver.navigate().forward();
		System.out.println("Page Title[4]:"+driver.getTitle());
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.close();
		
		
	
		

	}

}
