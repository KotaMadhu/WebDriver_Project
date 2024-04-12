package handlingActions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraMouseAndKeyboardActions {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		//Create Object with Action class
		Actions ac=new Actions(driver);
		//Locate to mouse over to Kids
		ac.moveToElement(driver.findElement(By.xpath("//a[@data-group='kids']")));
		ac.perform();
		Thread.sleep(3000);
		//Click on Soft Toys 
		ac.moveToElement(driver.findElement(By.linkText("Soft Toys")));
		ac.click().perform();
		Thread.sleep(5000);
		//Locate to mouse over to Beauty
		ac.moveToElement(driver.findElement(By.xpath("//a[@data-group='beauty']")));
		ac.perform();
		Thread.sleep(3000);
		//Click on Perfume 
		ac.moveToElement(driver.findElement(By.linkText("Perfume")));
		ac.click().perform();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
