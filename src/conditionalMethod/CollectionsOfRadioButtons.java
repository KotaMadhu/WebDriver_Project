package conditionalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import zmq.socket.radiodish.Radio;

public class CollectionsOfRadioButtons {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		
		List<WebElement> Buttons=driver.findElements(By.xpath("//li[contains(@class,'font12 blackText')]"));
		System.out.println("No of Radio Buttons::"+Buttons.size());
		for (WebElement each : Buttons) {
			System.out.println(each.getText());
		}
		driver.quit();
				
	}

}
