package handlingFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimusbankText {

	public static void main(String[] args) throws Throwable {
		File f=new File("D:\\PrimusBank.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		String str;
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(3000);
		String para1=driver.findElement(By.xpath("(//p[@class='style7'])[2]")).getText();
		String para2=driver.findElement(By.xpath("(//p[@class='style7'])[3]")).getText();
		bw.write(para1);
		bw.newLine();
		bw.newLine();
		bw.write(para2);
		bw.newLine();
		bw.flush();
		bw.close();
		driver.quit();
		
		
		
		

	}

}
