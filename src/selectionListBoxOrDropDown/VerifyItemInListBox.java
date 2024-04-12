package selectionListBoxOrDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyItemInListBox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		String ItemPresent="baby";
		boolean ItemExit=false;
		
		Select ListBox=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> List_Box=ListBox.getOptions();
		System.out.println(List_Box.size());
		for (WebElement each : List_Box) {
			Thread.sleep(200);
			String ActualItem=each.getText();
			System.out.println(ActualItem);
			if (ActualItem.equalsIgnoreCase(ItemPresent)) {
				ItemExit =true;
				break;		
			}
		}
			if(ItemExit) {
				System.out.println(ItemPresent+"::Item exist in List Box::"+ItemExit);
			}
			else {
				System.out.println(ItemPresent+"::Item Does not exist in List Box::"+ItemExit);
			}
			Thread.sleep(5000);
			driver.quit();
	}

}
