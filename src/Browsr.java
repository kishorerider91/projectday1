import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsr {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Balaji Vedav\\workspace2\\xpath.org\\drive\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new InternetExplorerDriver();
driver.get("http://www.amazon.com/");
String titel =driver.getTitle();
System.out.println(titel);
String url = driver.getCurrentUrl();
//driver.quit();
}
}

