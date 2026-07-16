package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFrames {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/NIVETHITHA/Downloads/EmbededWebpage.html");
	
	driver.switchTo().frame(0);
	WebElement search_field = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	search_field.sendKeys("Computer");
	
	driver.switchTo().defaultContent();
	
	WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
	name.clear();
	name.sendKeys("Nivi");
	
//	WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='frame1']"));
//	driver.switchTo().frame(frame1);
	
	WebElement frame2 = driver.findElement(By.xpath("//iframe[@name='frame2']"));
	driver.switchTo().frame(frame2);
	
	WebElement search2 = driver.findElement(By.id("small-searchterms"));
	search2.sendKeys("Book");
	
	driver.switchTo().defaultContent();
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("123@gmail.com");
	
	driver.switchTo().frame("frame1");
	WebElement search_field2 = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	search_field2.clear();
	search_field2.sendKeys("Electronics");
	System.out.println("Done!!");
}
}
