package validationMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationLinks {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://rediff.com/");
		Thread.sleep(5000);
		
		//Get collection of links in web page which are stored into html tag a
		
		List<WebElement>all_links=driver.findElements(By.tagName("a"));
		System.out.println("No of Links are:"+all_links.size());
		Thread.sleep(5000);
		
		//Print each link name
		for (WebElement each : all_links) {
			Thread.sleep(100);
			System.out.println(each.getText());
		}
		
		driver.quit();
		
		
		
		

	}

}
