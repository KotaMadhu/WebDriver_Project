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

public class SwitchToSpecificWindow2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		
		//click three links
		driver.findElement(By.xpath("(//a[contains(text(),'Terms')])[2]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Privacy Policy')])[2]")).click();
		driver.findElement(By.linkText("Cookies Policy")).click();
		
		//store all windows into array list
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(3000);
		driver.switchTo().window(brw.get(2));
		System.out.println(driver.getTitle());
		driver.findElement(By.name("email")).sendKeys("madhu1319");
		driver.findElement(By.name("pass")).sendKeys("Madhu333@#");
		driver.findElement(By.xpath("//input[@value='Log in']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();

	}

}
