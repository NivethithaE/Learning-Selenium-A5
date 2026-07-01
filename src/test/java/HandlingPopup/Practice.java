package HandlingPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new  ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Actions act_obj = new Actions(driver);
	
	driver.get("https://demowebshop.tricentis.com/");
	WebElement reg_btn = driver.findElement(By.xpath("//a[text()='Register']"));
	reg_btn.click();
	
	WebElement radio_btn = driver.findElement(By.id("gender-female"));
	radio_btn.click();
	
	WebElement first_name = driver.findElement(By.className("text-box"));
	first_name.sendKeys("Nive");
	
	WebElement last_name = driver.findElement(By.name("LastName"));
	last_name.sendKeys("Nivi");
	
	WebElement email = driver.findElement(By.name("Email"));
	email.sendKeys("nive3005@gmail.com");
	
	WebElement password = driver.findElement(By.name("Password"));
	password.sendKeys("123@Test");
	
	WebElement con_pass = driver.findElement(By.name("ConfirmPassword"));
	con_pass.sendKeys("123@Test");
	
	WebElement register_btn = driver.findElement(By.id("register-button"));
	register_btn.click();
	
	WebElement continue_btn = driver.findElement(By.xpath("//input[@value='Continue']"));
	continue_btn.click();

	WebElement computer = driver.findElement(By.partialLinkText("Comp"));
	act_obj.moveToElement(computer).perform();
	Thread.sleep(2000);
	
	WebElement desk = driver.findElement(By.partialLinkText("Desk"));
	desk.click()
;	
}
}
