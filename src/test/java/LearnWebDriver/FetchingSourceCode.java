package LearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingSourceCode {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//navigate app via URL
	driver.get("https://chatgpt.com/");
	System.out.println(driver.getPageSource());
	driver.close();
}
}
