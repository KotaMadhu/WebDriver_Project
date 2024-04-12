package selectionListBoxOrDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectItemFromListBox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);

		Select allList=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> all_List =allList.getOptions();
		System.out.println("No of items are::"+all_List.size());
		Thread.sleep(5000);

		for (WebElement each : all_List) {
			Thread.sleep(200);
			System.out.println(each.getText());			
		}	
		driver.quit();

	}

}
