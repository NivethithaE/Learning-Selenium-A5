package LearnLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationOnDemoApp {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
	register.click();
	WebElement gender = driver.findElement(By.xpath("//input[@id='gender-female']"));
	gender.click();
	WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
	firstname.sendKeys("Nivethitha");
	WebElement lastname = driver.findElement(By.xpath("//input[@id='LastName']"));
	lastname.sendKeys("Elangeshwaran");
	WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
	email.sendKeys("nivethitha10@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
	password.sendKeys("nive@123");
	WebElement confirm = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
	confirm.sendKeys("nive@123");
	WebElement register_btn = driver.findElement(By.xpath("//input[@id='register-button']"));
	register_btn.click();
	WebElement continue_btn = driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']"));
	continue_btn.click();
	driver.close();
}
}
