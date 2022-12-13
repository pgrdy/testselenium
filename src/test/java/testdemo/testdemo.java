package testdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testdemo {

public static void main(String[] args) {
// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.get("https://www.orangehrm.com/contact-sales/");
WebElement elementCountry = driver.findElement(By.id("Form_getForm_Country"));

Select dropdownCountry = new Select(elementCountry);
//dropdownCountry.selectByIndex(9);
//dropdownCountry.selectByValue("Belgium");
dropdownCountry.selectByVisibleText("Chile");


}

}
