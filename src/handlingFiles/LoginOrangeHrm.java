package handlingFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrangeHrm {
	public static void main(String[] args) throws Throwable {
		File f=new File("D:\\LoginData.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String str;
		while ((str=br.readLine())!=null) {
			String login[]=str.split(";");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
			Thread.sleep(3000);
			
			driver.findElement(By.name("txtUsername")).sendKeys(login[0]);
			driver.findElement(By.name("txtPassword")).sendKeys(login[1]);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
			
			String expected="dashboard";
			String Actual=driver.getCurrentUrl();
			if(Actual.contains(expected)) {
				System.out.println("Login is successfull");
			}
			else {
				System.out.println("Login is Failed");
			}
			driver.quit();


		}

	}

}
