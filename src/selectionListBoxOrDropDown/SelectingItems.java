package selectionListBoxOrDropDown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingItems {
	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		//Verify List Box Methods
		
		Select dayList=new Select(driver.findElement(By.name("birthday_day")));
		dayList.selectByIndex(14);	//Select Date in the list box
		List<WebElement> day_List=dayList.getOptions();	//List all dates in list box
		System.out.println("No of days ::"+day_List.size());
		for (WebElement each : day_List) {
			System.out.println(each.getText());
		}
		System.out.println("=====================================================");
		Select monthList =new Select(driver.findElement(By.name("birthday_month")));
		monthList.selectByVisibleText("Aug");	//Select Month in list box
		List<WebElement>month_List=monthList.getOptions();	//List all months in list box
		System.out.println("No of Months::"+month_List.size());
		for (WebElement each : month_List) {
			System.out.println(each.getText());
		}
		System.out.println("=====================================================");

		Select yearList =new Select(driver.findElement(By.name("birthday_year")));
		yearList.selectByVisibleText("1947");	//Select year in the list box
		List<WebElement> year_List=yearList.getOptions();	//List all years in list box
		System.out.println("No of Years::"+year_List.size());
		for (WebElement each : year_List) {
			System.out.println(each.getText());
		}
		System.out.println("=====================================================");
		//Verify List Box is Single or Multiple selection. Is it true? It is Multiple selection
		boolean Day =dayList.isMultiple();
		System.out.println(Day);

		boolean Month =dayList.isMultiple();
		System.out.println(Month);

		boolean Year =dayList.isMultiple();
		System.out.println(Year);

		Thread.sleep(5000);
		driver.quit();
	}

}
