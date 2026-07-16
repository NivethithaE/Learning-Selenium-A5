package GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseConfig {
	public WebDriver driver;
	@BeforeClass
	public void BrowserSetup() {
		driver=new ChromeDriver();
		driver.get("http://49.249.29.4:8888/");
		Reporter.log("Nav to app via url",true);
	}
	@BeforeMethod
	public void login() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		Reporter.log("Un Entered !!",true);
		driver.findElement(By.name("user_password")).sendKeys("admin");
		Reporter.log("Password entered !!",true);
		driver.findElement(By.id("submitButton")).click();
	}
	@AfterMethod
	public void BrowserLogout() {
		Actions act = new Actions(driver);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement profile = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("(//img[@style='padding: 0px;padding-left:5px'])[1]")));

        act.moveToElement(profile).perform();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText("Sign Out")));
        Reporter.log("SignOut SuccessFull !!",true);
	}
	@AfterClass
	public void BrowserTerminate() {
		driver.close();
		Reporter.log("Closed!!",true);
	}
}
