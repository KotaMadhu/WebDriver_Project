package handlingActions;

import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateGmailAcount {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		Thread.sleep(3000);
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Create account']")));
		ac.click().perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstName")).sendKeys("Testing");
		driver.findElement(By.name("lastName")).sendKeys("Selenium");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(3000);
		
		Select listbox = new Select(driver.findElement(By.id("month")));
		List<WebElement> all_items =listbox.getOptions();
		System.out.println(all_items.size());
		for (WebElement each : all_items) {
			System.out.println(each.getText());	
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}
