package handlingActions;
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InputsAndArrowDownInGoogle {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		//Create Object with Action Class
		Actions ac=new Actions(driver);
		//Sendkeys in google search
		driver.findElement(By.name("q")).sendKeys("Selenium Openings in ");
		Thread.sleep(3000);
		//Using action class to Arrow Down 
		ac.sendKeys(Keys.ARROW_DOWN).click().perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_DOWN).click().perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ARROW_DOWN).click().perform();
		Thread.sleep(3000);
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
