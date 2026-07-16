package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task {
	@BeforeClass
public void BrowserSetup() {
	Reporter.log("Browser Opened",true);
	Reporter.log("Browser Maximized",true);
	Reporter.log("Nav toapp via URL",true);
}
@BeforeMethod
public void login() {
	Reporter.log("Enter UN in UN txt Feild",true);
	Reporter.log("Enter password in password txt field",true);
	Reporter.log("Click on login button",true);
}
@Test
public void createOrg() {
	Reporter.log("Creating ORG Success ",true);
}

//update
@Test
public void UpdateOrg() {
	Reporter.log("Updated Successfully !!",true);
}

//delete
@Test
public void DeleteOrg() {
	Reporter.log("Org Deleted!!",true);
}

@AfterMethod
public void BrowserLogout() {
	Reporter.log("Click on Sign up button - sign out",true);
}
@AfterClass
public void BrowserTerminate() {
	Reporter.log("Browser close!");
}
}
