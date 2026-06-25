package LearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageValidationUsingURL {
public static void main(String[] args) {
	//step 1: open the browser
	WebDriver driver=new ChromeDriver();
	//step 2: navigate to the URL
	driver.get("https://www.selenium.dev");
	//step 3: expected URL
	String expturl="https://www.selenium.dev/";
	//step 4: get actual url by using "getCurrentUrl()"
	String acturl=driver.getCurrentUrl();
	//step 5: use equals()method to compare the URLs
	if(expturl.equals(acturl)) {
		System.out.println("Title-verified:pass" +acturl);
	}else {
		System.out.println("Title-verified:fail"+acturl);
	}
	driver.quit();
	System.out.println("Execution Done!!");
}
}
