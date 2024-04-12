package HandlingTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificTablePickupInTable {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual.funds");
		Thread.sleep(5000);
		
		String TableText1=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[1]")).getText();
		String TableText2=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[2]")).getText();
		System.out.println(TableText1+"============"+TableText2);
		Thread.sleep(3000);
		
		driver.quit();

	}

}
