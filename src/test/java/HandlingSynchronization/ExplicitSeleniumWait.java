package HandlingSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitSeleniumWait {
	 public static void main(String[] args) {

	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        driver.get("https://www.shoppersstack.com/");

	        // Wait until login button is visible
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.cssSelector("#loginBtn")));

	        // Wait until specific element is visible
	        wait.until(ExpectedConditions.visibilityOf(
	                driver.findElement(By.cssSelector("#loginBtn"))));

	        // Wait until login button is clickable
	        wait.until(ExpectedConditions.elementToBeClickable(
	                By.cssSelector("#loginBtn")));

	        // Wait until text is present in h3 tag
	        wait.until(ExpectedConditions.textToBe(
	                By.tagName("h3"),
	                "Welcome to ShoppersStack. Enjoy shopping with us."));

	        // Wait for alert (optional)
	        // wait.until(ExpectedConditions.alertIsPresent());

	        // Print h3 text
	        WebElement element = driver.findElement(By.tagName("h3"));
	        System.out.println(element.getText());

	        // Click login button
	        WebElement loginBtn = driver.findElement(By.cssSelector("#loginBtn"));
	        loginBtn.click();

	        driver.quit();
	    }
}
