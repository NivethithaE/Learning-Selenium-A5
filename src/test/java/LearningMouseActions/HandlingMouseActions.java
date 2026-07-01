package LearningMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class HandlingMouseActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions act=new Actions(driver);
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		//perform double click
		WebElement doubleclick=driver.findElement(By.id("doubleBtn"));
		act.doubleClick(doubleclick).perform();
		Thread.sleep(20);
		
		//perform context click(right click)
		WebElement rightclick=driver.findElement(By.id("rightBtn"));
		act.contextClick(rightclick).perform();
		Thread.sleep(20);
		
		//perform Drag and drop
		WebElement dragele=driver.findElement(By.id("dragItem"));
		WebElement dropele=driver.findElement(By.id("dropZone"));
		//act.dragAndDrop(dragele,dropele).perform();
		
		//perform click and hold(alternative method)
		act.clickAndHold(dragele).release(dropele).perform();
		Thread.sleep(20);
		
		//perform hover
		WebElement hover=driver.findElement(By.id("tooltipTarget"));
		act.moveToElement(hover).perform();
		Thread.sleep(20);
		
		//perform slider
		act.dragAndDropBy(driver.findElement(By.id("handle_max")), 200, 0).perform();
		Thread.sleep(20);
		
		//Scrolling operation
		act.scrollByAmount(0,100).perform();
		
		act.scrollToElement(doubleclick).perform();
		Thread.sleep(20);
		
		act.scrollFromOrigin(ScrollOrigin.fromElement(hover), 0, 200).perform();
		
		
		
		
		
		
				
	}
}
