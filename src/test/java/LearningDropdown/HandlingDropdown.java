package LearningDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30l));
	//Identify the element
	WebElement dropdown = driver.findElement(By.cssSelector("#searchDropdownBox"));
	//Create object
	Select select_obj = new Select(dropdown);
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
	select_obj.selectByIndex(10);
	
	Thread.sleep(3000);
	
	//select by value
	select_obj.selectByValue("search-alias=dvd");
	Thread.sleep(3000);
	
	// Get options
	List<WebElement> all_options = select_obj.getOptions();
	for(int i=0;i<all_options.size();i++) {
		System.out.println(all_options.get(i).getText());
	} 
	System.out.println("Count : "+all_options.size());
	
	driver.close();
}
}
