package mvn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testtestng {

	@Test
	private void m1() {
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");

	}
}