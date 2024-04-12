package conditionalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRadioButtons {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		
		List<WebElement> Buttons=driver.findElements(By.xpath("//span[contains(@class,'_5k_2 _5dba')]"));
		System.out.println("No of Radio Buttons::"+Buttons.size());
		for (WebElement each : Buttons) {
			System.out.println(each.getText());
		}
		
		driver.quit();

	}

}
