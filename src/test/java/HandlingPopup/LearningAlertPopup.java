package HandlingPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAlertPopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	//find elements
	WebElement prompt_alert = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
	prompt_alert.click();
	
	//handle Pop up
	System.out.println(driver.switchTo().alert().getText());  //to get text
	driver.switchTo().alert().accept();
	
	//close
	driver.close();
}
}
