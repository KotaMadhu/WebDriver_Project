package conditionalMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckBox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		
		WebElement CheckBox =driver.findElement(By.xpath("//input[@id='remember']"));
		boolean Check_Box = CheckBox.isSelected();
		System.out.println(Check_Box);
		
		if (Check_Box) {
			CheckBox.click();
		}
		else
		{
			CheckBox.click();
		}
		driver.quit();

	}

}
