package HandlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowAndColumnsDataInTable {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		//Store in Table
		WebElement TableText=driver.findElement(By.id("customers"));
		List<WebElement> rows,columns;
		//Get row table from Table Text
		rows=TableText.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
		Thread.sleep(3000);
		//Iterate all rows in a table
		for (WebElement eachrow : rows) {
			Thread.sleep(1000);
			columns=eachrow.findElements(By.tagName("td"));
			//Iterate each column in a each row
			for (WebElement eachColumn : columns) {
				System.out.println(eachColumn.getText());
			}
			System.out.println("=================================");
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
