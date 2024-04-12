package HandlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCollections {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual.funds");
		Thread.sleep(3000);
		
		WebElement TableText=driver.findElement(By.className("dataTable"));
		List<WebElement> rows,columns;
		rows=TableText.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
		for (WebElement eachrow : rows) {
			Thread.sleep(500);
			columns=eachrow.findElements(By.tagName("td"));
			for (WebElement eachColumn : columns) {
				System.out.println(eachColumn.getText());
			}
			System.out.println("===================================");
			
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
