package LearningBasics;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser_UserChoice {
public static void main(String[] args) {
	//step1:Open the browser
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Option 1 for Chrome and 2 for Edge:");
		int option=sc.nextInt();
		if(option==1) {
			new ChromeDriver();
		}
		else if(option==2) {
			new EdgeDriver();
		}
		else {
			System.out.println("Invalid option");
		}
}
}
