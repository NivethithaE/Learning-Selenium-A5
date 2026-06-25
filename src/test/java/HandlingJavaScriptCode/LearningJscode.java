package HandlingJavaScriptCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningJscode {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//type cast
	JavascriptExecutor jseobj=(JavascriptExecutor)driver;
	
	//navigate
	jseobj.executeScript("window.location=arguments[0]","https://automationexercise.com/");
	//refresh
	jseobj.executeScript("history.go(0)");
	
	//title
	System.out.println("Title : "+jseobj.executeScript("return document.title"));
	//url
	System.out.println("URL : "+ jseobj.executeScript("return document.URL"));
	
	//click
	jseobj.executeScript("arguments[0].click()",driver.findElement(By.partialLinkText("Log")));
	
	// value and click
	jseobj.executeScript("arguments[0].value='Nive'",driver.findElement(By.name("name")));
	jseobj.executeScript("arguments[0].value='nive@gmail.com'",driver.findElement(By.xpath("//input[@data-qa='signup-email']")));
	jseobj.executeScript("arguments[0].click()",driver.findElement(By.xpath("//button[text()='Signup']")));
	
	//change mail for disabled element
	jseobj.executeScript("arguments[0].value='hello@gmail.com'",driver.findElement(By.id("email")));
	
	//Scrolling 
    jseobj.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath("//b[text()='Address Information']")));
    //Scroll By consider , the previous points and scroll from there
    jseobj.executeScript("window.scrollBy(0,300)"); //y for vertical x for horizontal
    //Scroll To . it always start from the origin
    jseobj.executeScript("window.scrollTo(0,300)");
    
}
}
