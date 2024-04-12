package HandlingMultipleWindows;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWindows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		//Get parent id
		String ParentWindow=driver.getWindowHandle();
		System.out.println(ParentWindow);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		//Click three links
		driver.findElement(By.xpath("(//a[contains(text(),'Terms')])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(text(),'Privacy Policy')])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Cookies Policy")).click();
		Thread.sleep(3000);
		//Get collection of all window id's
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows);
		for (String each : windows) {
			//If parent id not equals to each
			if(!ParentWindow.equals(each)) {
				//Switch to each child window and get title and close
				String ChildWindow=driver.switchTo().window(each).getTitle();
				System.out.println(ChildWindow);
				Thread.sleep(5000);
				driver.close();
			}	
			
		}
		driver.switchTo().window(ParentWindow);
		
		Select year=new Select(driver.findElement(By.xpath("//select[@id='year']")));
		List<WebElement> yearList=year.getOptions();
		for (WebElement each : yearList) {
			System.out.println(each.getText());
		}
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
