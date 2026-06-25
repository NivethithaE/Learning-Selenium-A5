package LearnLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//using name attribute
public class LearnName {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//nav to the app 
	driver.get("https://www.saucedemo.com/");
	//find the element-User name
	WebElement UsrTxtFld = driver.findElement(By.name("user-name"));
	//for password
	WebElement password = driver.findElement(By.name("password"));
	//Enter values
	UsrTxtFld.sendKeys("standard_user");
	password.sendKeys("secret_sauce");
	//close
	driver.close();
}
}
