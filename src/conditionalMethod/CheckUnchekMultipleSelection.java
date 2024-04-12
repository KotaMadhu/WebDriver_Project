package conditionalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUnchekMultipleSelection {
	//Counting no of check boxes
	//Verify check boxes is checked and Unchecked check box checked 
	//Collection of name check boxes
	//Un check the check box and check unchecked check box
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/checkbox_1_lyst2257.html");
		Thread.sleep(5000);
		
		List<WebElement> checkBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("No of Check Boxes::"+checkBox.size());
		for (WebElement each : checkBox) {

			boolean value= each.isSelected();
			System.out.println(each.getAttribute("value")+"======"+value);
			each.click();
		}
		
		driver.quit();
		
		
		

	}

}
