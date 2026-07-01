package HandlingSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitSeleniumWait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30l));
		WebElement text=driver.findElement(By.xpath("//h3[text()='Welcome to ShoppersStack. Enjoy shopping with us.']"));
		System.out.println(text.getText());
		
		WebElement login=driver.findElement(By.cssSelector("#loginBtn"));
		login.click();
		
		

	}
}
