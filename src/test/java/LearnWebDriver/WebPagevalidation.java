package LearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPagevalidation {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev");
	String exptitle="Selenium";
	String acttitle=driver.getTitle();
	if(exptitle.equals(acttitle)) {
		System.out.println("Title-verified:pass" +acttitle);
	}else {
		System.out.println("Title-verified:fail"+acttitle);
	}
	driver.quit(); 
}
}
