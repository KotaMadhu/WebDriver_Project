package handlingActions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenGmailLinkToWindow {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		//Create Action Class
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Gmail")));
		ac.contextClick().perform();
		
		//Create robot Class
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		ArrayList<String> browser=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(browser.get(1));
		Thread.sleep(3000);
		
		ac.moveToElement(driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]"))).click().perform();
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(browser.get(0));
		Thread.sleep(3000);
		
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Images']"))).click().perform();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
