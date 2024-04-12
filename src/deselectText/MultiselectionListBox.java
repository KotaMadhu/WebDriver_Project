package deselectText;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectionListBox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/HP/Documents/MultiListboxHtmlpage_lyst8730.html");
		Thread.sleep(5000);

		Select DropDown = new Select(driver.findElement(By.name("multiSelection")));
		List<WebElement> Drop_Down =DropDown.getOptions();
		System.out.println("No of items in list box::"+Drop_Down.size()); //Total item numbers in List Box
		System.out.println("===================================");
		boolean value =DropDown.isMultiple(); //Verify it is Single selection or Multiselection
		System.out.println(value);
		System.out.println("===================================");
		//Print all items in the List box
		for (WebElement each : Drop_Down) {
			Thread.sleep(200);
			System.out.println(each.getText());
		}
		//Select 0 to 8 items in a list box
		for(int i=0;i<=8;i++) {
			Thread.sleep(300);
			DropDown.selectByIndex(i);
		}
		//Deselect required item by given index number
		DropDown.deselectByIndex(3);
		Thread.sleep(3000);
		//Deselect required item by given Text in list box
		DropDown.deselectByVisibleText("brown");
		Thread.sleep(3000);
		//Deselect All items in list box
		DropDown.deselectAll();
		Thread.sleep(3000);
		driver.quit();
	}

}
