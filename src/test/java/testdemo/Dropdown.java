package testdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Dropdown {


public static void main(String[] args) {
// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();


driver.get("https://www.orangehrm.com/contact-sales/");

WebElement fullName = driver.findElement(By.cssSelector("#Form_getForm_FullName"));

fullName.sendKeys("Pavani");
WebElement email = driver.findElement(By.cssSelector("#Form_getForm_Email"));
email.sendKeys("test@selenium.com");

WebElement phone = driver.findElement(By.cssSelector("input[id='Form_getForm_Contact']"));
phone.sendKeys("012345");

WebElement elementCountry = driver.findElement(By.id("Form_getForm_Country"));
Select dropdownCountry = new Select(elementCountry);
dropdownCountry.selectByIndex(9);

WebElement elementNumofEmployees = driver.findElement(By.id("Form_getForm_NoOfEmployees"));


Select dropdownNumofEmployees = new Select(elementNumofEmployees);

dropdownNumofEmployees.selectByValue("21 - 25");

WebElement jobTitle = driver.findElement(By.cssSelector("#Form_getForm_JobTitle"));

jobTitle.sendKeys("Quality Assurance");

//dropdownCountry.selectByValue("Belgium");
//dropdownCountry.selectByVisibleText("Chile");
//dropdownNumberofEmployees.selectByIndex("5");



}
}
