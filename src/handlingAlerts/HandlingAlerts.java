package handlingAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.jmx.ManagedAttribute;

public class HandlingAlerts {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		//Login on Primus bank 
		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		//Click on  Branches Module in Admin home page
		driver.findElement(By.xpath("//a[@href='admin_banker_master.aspx']//img")).click();
		//Click on Delete symbol in Branches page
		driver.findElement(By.xpath("//tbody/tr[2]/td[8]/a[1]/img[1]")).click();
		Thread.sleep(3000);
		//Print alert1 window text
		String alert1=driver.switchTo().alert().getText();
		System.out.println(alert1);
		Thread.sleep(3000);
		//Cancel button in alert window
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		//Click again Delete button in branch page
		driver.findElement(By.xpath("//tbody/tr[2]/td[8]/a[1]/img[1]")).click();
		//Click Ok button in alert window
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		//Print alert2 window text
		String alert2=driver.switchTo().alert().getText();
		System.out.println(alert2);
		Thread.sleep(3000);
		//Click Ok button in alert2 window
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		driver.quit();
	}

}
