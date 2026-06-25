package LearningDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSelectDeselect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/NIVETHITHA/Downloads/EmbededWebpage.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30l));
	//Identify the element
	WebElement M_dropdown = driver.findElement(By.cssSelector("select[name='country2']"));
	//Create object
	Select select_obj = new Select(M_dropdown);
	//single select or multiple select
	boolean status = select_obj.isMultiple();
	if(status) {
		System.out.println("It is Multiple Select Dropdown");
	}
	else {
		System.out.println("It is Single select DropDown");
	}
	System.out.println("-------");
	//select by index
	select_obj.selectByIndex(1);
	
	Thread.sleep(3000);
	
	//select by value
	select_obj.selectByValue("swiss");
	Thread.sleep(3000);
	
	//select by visible text
	select_obj.selectByVisibleText("CANADA");
	Thread.sleep(3000);
	
	//select by contains visible text
	select_obj.selectByContainsVisibleText("IND");
	
	//first option
	WebElement first = select_obj.getFirstSelectedOption();
	System.out.println("First select");
	System.out.println(first.getText());
	System.out.println("-----");
	
	// All options
	List<WebElement> all_opt = select_obj.getAllSelectedOptions();
	System.out.println("All Options");
	for(WebElement every_opt:all_opt) {
		System.out.println(every_opt.getText());
	}
	
	System.out.println("--------");
	
	// Get options
	List<WebElement> all_options = select_obj.getOptions();
	for(int i=0;i<all_options.size();i++) {
		System.out.println(all_options.get(i).getText());
	} 
	System.out.println("Count : "+all_options.size());
	System.out.println("-----------");
	
	//Wrapped element
	WebElement wrapped = select_obj.getWrappedElement();
	System.out.println("Wrapped elements");
	System.out.println(wrapped.getText());
	System.out.println("----------");
	
	//de-select
	
	select_obj.deselectAll();
//	select_obj.deselectByIndex(1);
//	select_obj.deselectByValue("swiss");
//	select_obj.selectByContainsVisibleText("IND");
	
	driver.close();
}
}
