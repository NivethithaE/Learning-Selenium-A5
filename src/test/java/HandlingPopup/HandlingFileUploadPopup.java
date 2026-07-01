package HandlingPopup;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopup {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://the-internet.herokuapp.com/upload");
	
	WebElement ChooseFile_btn = driver.findElement(By.id("file-upload"));
	
	//create file class
	File act_file = new File("./src/test/resources/Data/Notes.txt");
	
	//use send keys to upload the file 
	ChooseFile_btn.sendKeys(act_file.getAbsolutePath());
	
	driver.close();
}
}
