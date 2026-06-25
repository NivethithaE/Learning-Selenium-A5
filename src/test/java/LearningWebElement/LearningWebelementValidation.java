package LearningWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWebelementValidation {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationexercise.com/");
	WebElement signup_btn = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
	signup_btn.click();
	WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
	name.sendKeys("Nivethitha");
	WebElement Email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
	Email.sendKeys("nive@gmail.com");
	WebElement signup_up = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
	signup_up.click();
	WebElement mr_radio = driver.findElement(By.xpath("//label[@for='id_gender1']"));
	mr_radio.click();
	boolean displayed_radio = mr_radio.isDisplayed();
	boolean enable_radio = mr_radio.isEnabled();
	boolean selected_radio = mr_radio.isSelected();
//	WebElement email_signup = driver.findElement(By.xpath("//label[@for='email']/following::input[@id='email']"));
//	boolean email_displayed = email_signup.isDisplayed();
//	boolean email_enabled = email_signup.isEnabled();
//boolean email_selected = email_signup.isSelected();
	if(displayed_radio && enable_radio && selected_radio) {
		System.out.println("Yes ");
	}
	else {
		System.out.println("No");
	}
	
}
}
