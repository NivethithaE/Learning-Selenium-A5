package HandlingPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HanldingNotificationPopup {
	public static void main(String[] args) {
		ChromeOptions chro_obj = new ChromeOptions();
		chro_obj.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(chro_obj);
		
		driver.get("https://www.goibibo.com/");
		
		
	}
}
