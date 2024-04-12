package HandlingMultipleWindows;

import java.awt.RenderingHints.Key;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToSpecificWindow {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();

		//click three links
		driver.findElement(By.xpath("(//a[contains(text(),'Terms')])[2]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Privacy Policy')])[2]")).click();
		driver.findElement(By.linkText("Cookies Policy")).click();


		//Store all windows into array list
		ArrayList<String> browser =new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window(browser.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.name("email")).sendKeys("Madhu1319");
		driver.findElement(By.name("pass")).sendKeys("Madhu333");
		driver.findElement(By.name("//input[@value='Log in']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();

	}

}
