package selectDateMonthYearInCalendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDateFicker {

	public static void main(String[] args) throws Throwable {
		
		String dob="January-1-2020";
		String temp[]=dob.split("-");
		String date=temp[1];
		String month=temp[0];
		String year=temp[2];
				
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		driver.findElement(By.className("hasDatepicker")).click();
		
		String calendarYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		while (!calendarYear.equals(year)) {
			driver.findElement(By.xpath("//span[contains(.,'Prev')]")).click();
			calendarYear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		String calendarMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calendarMonth.equals(month)) {
			driver.findElement(By.xpath("//span[contains(.,'Prev')]")).click();
			calendarMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		WebElement webtable=driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,columns;
		rows=webtable.findElements(By.tagName("tr"));
		for (WebElement eachrow : rows) {
			columns=eachrow.findElements(By.tagName("td"));
			for (WebElement eachColumn : columns) {
				if(eachColumn.getText().equals(date)) {
					eachColumn.click();
					Thread.sleep(3000);
				}
			}
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
