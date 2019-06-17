import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balaji Vedav\\workspace2\\Seleniumbrow\\Drive\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("http://www.facebook.com/");
String titel = driver.getTitle();
System.out.println(titel);
}
}
