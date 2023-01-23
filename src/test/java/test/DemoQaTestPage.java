package test;
import java.time.Duration;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class DemoQaTestPage {
WebDriver driver;
@BeforeClass

public void launchUrl()
{
ChromeDriver	driver = new ChromeDriver();
driver.get("https://demoqa.com/books");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
}

@Test(priority=1)
public void login() {
driver.findElement(By.id("login")).click();
driver.findElement(By.id("userName")).sendKeys("te4334");

driver.findElement(By.id("password")).sendKeys("Test@123");
driver.findElement(By.id("login")).click();

}
@Test(priority=2 , dependsOnMethods = { "login"})
void logout()
{
driver.findElement(By.id("submit")).click();
}


@AfterClass
public void closeBrowser() {
}

}