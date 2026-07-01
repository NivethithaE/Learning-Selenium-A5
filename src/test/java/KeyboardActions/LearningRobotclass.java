package KeyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningRobotclass {
public static void main(String[] args) throws AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Robot robj = new Robot();
	//Finding search Component
	for(int i=1;i<=6;i++) {
	robj.keyPress(KeyEvent.VK_TAB);
	robj.keyRelease(KeyEvent.VK_TAB);
	}
//	 robj.keyPress(KeyEvent.VK_SHIFT);
	 robj.keyPress(KeyEvent.VK_CAPS_LOCK);
	 robj.keyRelease(KeyEvent.VK_CAPS_LOCK);
	 
	 robj.keyPress(KeyEvent.VK_C);
	 robj.keyRelease(KeyEvent.VK_C);
//	 robj.keyRelease(KeyEvent.VK_SHIFT);
	 
	 robj.keyPress(KeyEvent.VK_O);
	 robj.keyRelease(KeyEvent.VK_O);
	 
	 robj.keyPress(KeyEvent.VK_M);
	 robj.keyRelease(KeyEvent.VK_M);
	 
	 robj.keyPress(KeyEvent.VK_P);
	 robj.keyRelease(KeyEvent.VK_P);
	 
	 robj.keyPress(KeyEvent.VK_U);
	 robj.keyRelease(KeyEvent.VK_U);
	 
	 robj.keyPress(KeyEvent.VK_T);
	 robj.keyRelease(KeyEvent.VK_T);
	 
	 robj.keyPress(KeyEvent.VK_E);
	 robj.keyRelease(KeyEvent.VK_E);
	 
	 robj.keyPress(KeyEvent.VK_R);
	 robj.keyRelease(KeyEvent.VK_R);
	 
	 robj.keyPress(KeyEvent.VK_CAPS_LOCK);
	 robj.keyRelease(KeyEvent.VK_CAPS_LOCK);
	 
	 
}
}
