package KeyboardActions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningKeyBoardActions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	Actions act=new Actions(driver);
	
	//Keyboard operation
	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	
	//we can give the keys tab in send keys instead of 6 lines like(sendKeys(keys.tab,keys.tab,keys.tab,keys.tab,keys.tab,keys.tab,"book",keys.Enter)
	act.sendKeys("book",Keys.ENTER).perform();
	
	

}

}
}
