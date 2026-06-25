package LearnWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBrowserWindowManagement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	driver.manage().window().fullscreen();
	System.out.println( driver.manage().window().getSize());
	driver.manage().window().setSize(new Dimension(10,10));
	System.out.println( driver.manage().window().getSize());
	System.out.println(driver.manage().window().getPosition());
	driver.manage().window().setPosition(new Point(0,100));
	System.out.println(driver.manage().window().getPosition());
}

}
