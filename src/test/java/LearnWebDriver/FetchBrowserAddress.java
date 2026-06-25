package LearnWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchBrowserAddress {
public static void main(String[] args) {
//open browser
	WebDriver driver=new ChromeDriver();
	//navigate to the app via URL
	driver.get("https://www.youtube.com/watch?v=WHg1eltJ3Ek");
	//Fetch and Print the address
	driver.manage().window().maximize();
	String ParentAddress=driver.getWindowHandle();
	System.out.println("Before Refresh " +ParentAddress);
	driver.navigate().refresh();
	System.out.println("After Refresh "+driver.getWindowHandle());
	//Open new Window
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.navigate().to("https://in.pinterest.com/");
	//Fetch all window address
	Set<String> AllAddress=driver.getWindowHandles();
	System.out.println("All Address"+AllAddress);
	//close all the windows
	driver.quit();
	}
}
