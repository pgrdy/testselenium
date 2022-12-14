package alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class alert {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub


	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");

	driver.manage().window().maximize();

	driver.findElement(By.name("submit")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();
	
//	builder.contextClick(droppHere);
//	builder.doubleClick(droppHere);

	}

	}


