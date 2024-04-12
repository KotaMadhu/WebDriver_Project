package tryCatch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTryCatchStatement {

	public static void main(String[] args) throws Throwable {
		try {
		int a,b,c;
		a=24;
		b=0;
		c=a/b;
		System.out.println(c);
		}catch (Throwable t) {
			System.out.println(t.getMessage());
			
		}
		
		
		
		
		
		
	}

}
