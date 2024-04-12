package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class CreateFacebookAccount {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Create new account")));
		ac.click().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Madhu");
		driver.findElement(By.name("lastname")).sendKeys("Kota");
		driver.findElement(By.name("reg_email__")).sendKeys("madhu123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Madhu123@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Madhu123@gmail.com");
		
		Select date =new Select(driver.findElement(By.xpath("//select[@id='day']")));
		date.selectByVisibleText("4");
		Select month =new Select(driver.findElement(By.xpath("//select[@id='month']")));
		month.selectByVisibleText("Apr");
		Select year =new Select(driver.findElement(By.xpath("//select[@id='year']")));
		year.selectByVisibleText("1997");
		Thread.sleep(2000);
		
		ac.moveToElement(driver.findElement(By.xpath("//input[@value='2']"))).click().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
