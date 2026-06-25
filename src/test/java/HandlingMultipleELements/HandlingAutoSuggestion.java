package  HandlingMultipleELements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class HandlingAutoSuggestion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dynamic input: ");
		String searchdata=sc.next();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		//search box is a single element so we have used find element
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys(searchdata);
		
		//handling auto suggestion , it gives list of elements so we have used find elements
		List<WebElement> allsuggestion=driver.findElements(By.xpath("//div[text()='"+searchdata+"']"));
		
		//print the text value
		for(int i=0;i<allsuggestion.size();i++) {
			System.out.println(allsuggestion.get(i).getText());
		}
		driver.close();
		

	}

}
