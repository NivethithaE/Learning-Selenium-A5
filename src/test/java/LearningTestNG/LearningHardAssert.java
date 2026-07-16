package LearningTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class LearningHardAssert {
	
	public WebDriver driver;
@Test
public void task1() {
	String exp_title="SELENIUM";
	String act_title="SELENIUM";
	
	int exp_width=0;
	int act_width=0;
	
	boolean exp_sts=true;
	boolean act_sts=true;
	
//	if(exp_title.equals(act_title)) {
//		System.out.println("Pass");
//	}
//	else {
//		System.out.println("Fails");
//	}
	
	Assert.assertEquals(act_width, exp_width);
	Assert.assertEquals(act_title, exp_title);
	Assert.assertEquals(act_sts, exp_sts);
	
}
@Test
public void task2() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/");
	
	//title
	String expect="Swag Labs";
	String actual = driver.getTitle();
	System.out.println(actual);
	
	Assert.assertEquals(expect, actual);
	
	// displayed
	WebElement element = driver.findElement(By.name("user-name"));
	boolean act_sts = element.isDisplayed();
	System.out.println(act_sts);
	boolean exp_sts=true;
	
	Assert.assertEquals(act_sts, exp_sts);
	//width
	int exp_width=292;
	int act_width = element.getSize().getWidth();
	System.out.println(act_width);
	Assert.assertEquals(act_width, exp_width);

	driver.close();
}

//soft assert
@Test
public void task3() {
	SoftAssert soft = new SoftAssert();
	driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/");
	
	//title
	String expect="Swag Labs";
	String actual = driver.getTitle();
	System.out.println(actual);
	
	soft.assertEquals(expect, actual);
	
	// displayed
	WebElement element = driver.findElement(By.name("user-name"));
	boolean act_sts = element.isDisplayed();
	boolean exp_sts=true;
	
	soft.assertEquals(act_sts, exp_sts);
	//width
	int exp_width=292;
	int act_width = element.getSize().getWidth();
	soft.assertEquals(act_width, exp_width);
	soft.assertAll();
	driver.close();
}
}
