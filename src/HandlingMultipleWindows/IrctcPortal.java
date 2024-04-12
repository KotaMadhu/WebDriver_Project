package HandlingMultipleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcPortal {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//label[contains(text(),'FLIGHTS')])[2]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'HOTELS')])[2]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='RAIL DRISHTI'])[1]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='E-CATERING'])[1]")).click();
		driver.findElement(By.xpath("//span[@class='railDrishti fa fa-bus']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circlefive']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circlesix']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circleseven']")).click();
		driver.findElement(By.xpath("//li[@id='charterTrainIcon']//a")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circlenine']")).click();
		
		Set<String> allLinkText=driver.getWindowHandles();
		System.out.println(allLinkText);
		
		for (String each : allLinkText) {
			String Title =driver.switchTo().window(each).getTitle();
			System.out.println(Title);
		}
		
		driver.quit();
		
		

	}

}
