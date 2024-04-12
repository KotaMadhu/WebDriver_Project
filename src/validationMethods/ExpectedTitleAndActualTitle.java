package validationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpectedTitleAndActualTitle {

	public static void main(String[] args) throws Throwable {
		// Print Title and Url along with length
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		//Print Expected Title and Actual Title
		String Expected="google";
		String Actual =driver.getTitle();
		if(Actual.equalsIgnoreCase(Expected)) {
			System.out.println("It is Matching:"+Expected+"   "+Actual);
		}
		else {
			System.out.println("It is not Matching"+Expected+"  "+Actual);
		}

		driver.quit();
	}

}

