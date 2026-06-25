package LearnWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
public static void main(String[] args) throws  MalformedURLException{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to(new URL("https://www.saucedemo.com/"));
	driver.navigate().to("https://www.foodnetwork.com/");
	//To shift to new TAB
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://www.youtube.com/");
	//To open in new Window
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.navigate().to("https://www.youtube.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.quit();
	}
}
