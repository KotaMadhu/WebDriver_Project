package validationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLoginModule {

	public static void main(String[] args) throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		
		//Store username text box into Webelement to access more than one webelement methods
		WebElement Objuser=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		Objuser.clear();
		Objuser.sendKeys("Admin");
		String userNameText =Objuser.getAttribute("value");
		System.out.println(userNameText);
		
		//Store password text box into Web element to access more than one web element methods
		WebElement Objpass=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Objpass.clear();
		Objpass.sendKeys("Qedge123!@#");
		String passText=Objpass.getAttribute("value");
		System.out.println(passText);
		
		//Click login button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(5000);
		
		String Expected ="dashboard";
		String Actual =driver.getCurrentUrl();
		if(Actual.contains(Expected)) {
			System.out.println("Username and Password are valid:"+Expected+"-----"+Actual);
		}
		else {
			String erorr_message=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(erorr_message);
			
		}
		driver.quit();
		

	}

}
