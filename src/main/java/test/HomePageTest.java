
package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class HomePageTest {
	WebDriver driver;

	@Test
	public void myMethod() {
		String title = driver.getTitle();
		if (title.equals("Google")) {
			System.out.println("Title is matched and TC passes");
		} else {
			System.out.println("Test case failed");
		}
	}

	@BeforeClass
	public void launchUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}
}