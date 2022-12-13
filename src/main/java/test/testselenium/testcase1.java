package test.testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class testcase1 {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver= new ChromeDriver();
	        driver.get("https://www.amazon.in/");
		// TODO Auto-generated method stub

	}

}
