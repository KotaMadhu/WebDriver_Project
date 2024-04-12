package HandlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmTable {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		WebElement TableText=driver.findElement(By.id("resultTable"));
		List<WebElement> rows,columns;
		rows =TableText.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
		
		for (WebElement eachrow : rows) {
			Thread.sleep(500);
			columns=eachrow.findElements(By.tagName("td"));
			for (WebElement eachColumn : columns) {
				System.out.println(eachColumn.getText());
			}
			System.out.println("==================================");	
		}
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
