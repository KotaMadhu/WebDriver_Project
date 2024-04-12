package waitStatements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		//Create Object for WebDriver wait class
		WebDriverWait mywait =new WebDriverWait(driver, Duration.ofSeconds(20));
		//Wait until element is clickable
		mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account")));
		driver.findElement(By.linkText("Create new account")).click();
		//Wait until element is visible
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("Automation");
		//Wait until element is visible
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname")));
		driver.findElement(By.name("lastname")).sendKeys("Selenium");
		driver.quit();

	}

}
