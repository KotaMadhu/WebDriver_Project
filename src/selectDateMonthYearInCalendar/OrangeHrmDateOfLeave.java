package selectDateMonthYearInCalendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrmDateOfLeave {

	public static void main(String[] args) throws Throwable {
		String From="Jan-1-2024";
		String temp[]=From.split("-");
		String date=temp[1];
		String month=temp[0];
		String year=temp[2];

		String To="Mar-27-2024";
		String temp2[]=To.split("-");
		String date2=temp2[1];
		String month2=temp2[0];
		String year2=temp2[2];

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("calFromDate")).click();

		Select calendarYear= new Select(driver.findElement(By.className("ui-datepicker-year")));
		calendarYear.selectByVisibleText(year);

		Select calendarMonth=new Select(driver.findElement(By.className("ui-datepicker-month")));
		calendarMonth.selectByVisibleText(month);

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

		driver.findElement(By.xpath("//input[@id='calToDate']")).click();

		Select calendar2Year= new Select(driver.findElement(By.className("ui-datepicker-year")));
		calendar2Year.selectByVisibleText(year2);

		Select calendarMonth2=new Select(driver.findElement(By.className("ui-datepicker-month")));
		calendarMonth2.selectByVisibleText(month2);

		WebElement webtable2=driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> row,column;
		row=webtable2.findElements(By.tagName("tr"));
		for (WebElement eachrow2 : row) {
			column=eachrow2.findElements(By.tagName("td"));
			for (WebElement eachColumn2 : column) {
				if(eachColumn2.getText().equals(date)) {
					eachColumn2.click();
					Thread.sleep(3000);
				}
			}
		}
		driver.quit();
	}
}
