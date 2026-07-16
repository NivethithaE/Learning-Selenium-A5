package HandlingPopup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingChildWindowPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/56");

		// click a category
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

		WebElement compare = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='compare']")));
		compare.click();

		// getting parent window address
		String parent = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println("Parent :" + parent + " All : " + allwindows);
		// to close all the child windows
		for (String window : allwindows) {
			// switching driver focus
			driver.switchTo().window(window);
			String title = driver.getTitle();
			System.out.println(title);

			if (title.equals(
					"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
				driver.close();
			}
		}
//	driver.close();
	}
}
