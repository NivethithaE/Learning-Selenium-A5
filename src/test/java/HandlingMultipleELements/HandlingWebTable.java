package HandlingMultipleELements;

import java.io.ObjectInputStream.GetField;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter row Number : ");
	int n=sc.nextInt();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://vinothqaacademy.com/webtable/");
	
	//3rd row 2nd data
	WebElement name = driver.findElement(By.xpath("//table[@id='myTable']//tr[3]/td[2]"));
	System.out.println(name.getText());
	System.out.println("----------");
	//employee name
	List<WebElement> allnames = driver.findElements(By.xpath("//table[@id='myTable']//tr/td[2]"));
	for(WebElement names:allnames) {
		System.out.println(names.getText());
	}
	System.out.println("----------");
	
	// nth row all data
	List<WebElement> alldetails = driver.findElements(By.xpath("//table[@id='myTable']//tr[3]/td"));
	for(WebElement details:alldetails) {
		System.out.println(" "+details.getText());
	}
	System.out.println("---------");
	List<WebElement> all_details = driver.findElements(By.xpath("//table[@id='myTable']//tr["+n+"]/td"));
	for(WebElement detail:all_details) {
		System.out.println(" "+detail.getText());
	}
	driver.close();
}
}
