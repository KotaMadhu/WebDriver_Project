package conditionalMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebElements {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		
		WebElement firstname=driver.findElement(By.name("firstname"));
		boolean First_name =firstname.isEnabled();
		System.out.println(First_name);
				
		WebElement reEnterEmail=driver.findElement(By.name("reg_email_confirmation__"));
		boolean EnterEmail=reEnterEmail.isDisplayed();
		System.out.println(EnterEmail);
		
		WebElement RadioButton =driver.findElement(By.xpath("//input[@value='2']"));
		boolean Male_Button=RadioButton.isSelected();
		System.out.println(Male_Button);
		
		
		
		driver.quit();
	}
	

}
