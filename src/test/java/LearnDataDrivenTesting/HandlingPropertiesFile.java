package LearnDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertiesFile {
public static void main(String[] args) throws IOException {
//1
	FileInputStream fis = new FileInputStream("./src/test/resources/CommonDataSD.properties");
	
	//2
	Properties prop_obj = new Properties();
	//3.
	prop_obj.load(fis);
	//4
	String data = prop_obj.getProperty("url");
	String un = prop_obj.getProperty("username");
	String password = prop_obj.getProperty("password");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
	driver.get(data);
	
	WebElement username = driver.findElement(By.name("user-name"));
	username.sendKeys(un);
	
	WebElement pass_word = driver.findElement(By.id("password"));
	pass_word.sendKeys(password);
	
	WebElement log_btn = driver.findElement(By.id("login-button"));
	log_btn.click();
	
	// adding new key value
	prop_obj.put("browser","chrome");
	
	//output stream
	FileOutputStream fos = new FileOutputStream("./src/test/resources/CommonDataSD.properties");
	
	prop_obj.store(fos, "Browser key added!!!");
	
	driver.close();
	
}
}
