package HandlingPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingHiddenDivisionPopup {
public static void main(String[] args) {
	//handling notification pop up
	ChromeOptions chro_obj = new ChromeOptions();
	chro_obj.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(chro_obj);
	
	driver.manage().window().maximize();
	driver.get("https://www.goibibo.com/");
	//Find x icon
	WebElement x_icon = driver.findElement(By.xpath("//span[@class='sc-koXPp bDtzaf']"));
	x_icon.click();
	
	driver.close();

}
}
