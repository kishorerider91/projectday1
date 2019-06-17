import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Balaji Vedav\\workspace2\\Seleniumbrow\\Drive\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/login");
	String title = driver.getTitle();
	System.out.println(title);
	WebElement from =driver.findElement(By.id("userName"));
	from.sendKeys("987654321");
	WebElement destination = driver.findElement(By.id("dest"));
	destination.sendKeys("bangalore");
	
	
	
	}
}
