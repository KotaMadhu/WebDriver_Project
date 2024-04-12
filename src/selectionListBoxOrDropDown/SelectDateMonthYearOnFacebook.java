package selectionListBoxOrDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDateMonthYearOnFacebook {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		Select dayList=new Select(driver.findElement(By.name("birthday_day")));
		dayList.selectByIndex(25);
		
		Select monthList =new Select(driver.findElement(By.name("birthday_month")));
		monthList.selectByVisibleText("Jan");
		
		Select yearList =new Select(driver.findElement(By.name("birthday_year")));
		yearList.selectByVisibleText("1956");
		
		List<WebElement> year_List=yearList.getOptions();	
		System.out.println("No of Years::"+year_List.size());
		for (WebElement each : year_List) {
			System.out.println(each.getText());
		}
		driver.quit();
	}

}
