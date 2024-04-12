package flipcart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlipcartMobileSearch {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement element =driver.findElement(By.name("q"));
		element.sendKeys("Mobiles");
		element.sendKeys(Keys.ENTER);
		Actions ac=new Actions(driver);
		Thread.sleep(3000);
		
		Select min=new Select(driver.findElement(By.xpath("//select[contains(.,'Min')]")));
		min.selectByIndex(1);
		Thread.sleep(3000);
		
		Select max=new Select(driver.findElement(By.xpath("(//select[contains(.,'₹10000')])[2]")));
		max.selectByIndex(2);
		Thread.sleep(3000);
		
		ac.moveToElement(driver.findElement(By.xpath("//div[@title='SAMSUNG']//div//div[1]")));
		ac.click();
		Thread.sleep(3000);
		
		ac.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);

		ac.moveToElement(driver.findElement(By.xpath("//div[@title='4★ & above']//div//div[1]")));
		ac.click();
		Thread.sleep(3000);
		
//		Select brand=new Select(driver.findElement(By.xpath("//div[@title='SAMSUNG']//div//div[1]")));
//		brand.selectByIndex(0);
		
//		Select Rating=new Select(driver.findElement(By.xpath("//div[@title='4★ & above']//div//div[1]")));
//		Rating.selectByIndex(0);
	
		
		driver.quit();
		

}
}
