package HandlingScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebpageScreenshot {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	// step 1
	TakesScreenshot ts=(TakesScreenshot)driver;
	//2 & 3
	File temp_path = ts.getScreenshotAs(OutputType.FILE);
	//4
	File permanent_path = new File("./src/test/resources/TestScreenshot/screenshot.png");
	// 5
	try {
		FileHandler.copy(temp_path, permanent_path);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("screenshot taken !!");
	driver.close();
}

}
